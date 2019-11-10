package me.choi.version2.version3;



import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BestPriceFinder {
    /*1.
    * 각각의 상점 리스트 생성
    * */
    private final List<Shop> shops = Arrays.asList(new Shop("GSshop"),
                                                  new Shop("LFMall"),
                                                  new Shop("LotteMall"),
                                                  new Shop("Coupang"),
                                                  new Shop("11st"));
    /*2.
    * CompletableFuture로 findprices를 구현해보자!
    *  */
    public List<String> findprices(String product) {
        List<CompletableFuture<String>> pricesFuture =
                shops.stream()
                        .map(shop -> CompletableFuture.supplyAsync(
                                () -> shop.getName() + ": 가격은" + shop.getPrice(product) + "입니다."
                        )).collect(Collectors.toList());
        return pricesFuture.stream()
                .map(CompletableFuture::join) //모든 비동기 동작이 끝나기를 기다린다.
                .collect(Collectors.toList());
//            join == Future의 get 과 비슷하다
//                but! join은 아무런 예외도 발생시키지 않는다는 점이 다를뿐이다.
    }
    /*코드분석
    * 두가지의 파이프라인을 굳이 사용한 이유? (p349)
    순차 : 이전 요청의 처리가 완전히 끝난 이후에 새로만든 CompleteFuture가 실행
    병렬 : CompleteFuture의 리스트를 모은 다음에 독립적으로 작업을 수행
     */
    /*
    무엇이 문제일까?
    *병렬 스트림으로 처리한 것 보다 훨씬 많은 시간소요

    그렇다면 해결책은?  커스텀 Executor의 사용(p351)
    1.CompletableFuture은 Executor로 스레드 풀의 크기를 조절가능
    2.어플리케이션에 맞는 최적화된 설정을 구할 수 있다.
    * */


    /*3.
    * newFixedThreadPool에 주목!
    * setDaemon에 주목!
    * 기본 스레드는 이벤트를 한 없이 기다리면서 종료되지 않는 상황이 생길 수 있다.
    * 데몬스레드는 자바 프로그램이 종료될때 강제로 실행이 종료되게 할 수 있다.
    * */
    private final Executor executor = Executors.newFixedThreadPool(shops.size(), new ThreadFactory() {
        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(r);
            t.setDaemon(true);
            return t;
        }
    });
    public List<String> findprices2(String product){
        List<CompletableFuture<String>> pricesFuture =
                shops.stream()
                        .map(shop -> CompletableFuture.supplyAsync(
                                ()-> shop.getName() + ": 가격은" + shop.getPrice(product) + "입니다.",executor
                        )).collect(Collectors.toList());
        return pricesFuture.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());
    }
    /******************************************************************************************************************/

    /*스트림 Parallel로 처리*/
    public List<String> findPricesParallel(String product) {
        return shops.parallelStream()
                //각 상점에서 할인 전 가격 가져오기
                .map(shop -> shop.getPrice(product))
                //상점에서 반환한 문자열을 Quote객체로 전환
                .map(Quote::parse)
                //Discount 서비스를 이용해서 각 Quote에 할인을 적용
                .map(Discount::applyDiscount)
                .collect(Collectors.toList());
    }
    /*스트림 Sequential로 처리*/
    public List<String> findPricesSequential(String product) {
        return shops.stream()
                .map(shop -> shop.getPrice(product))
                .map(Quote::parse)
                .map(Discount::applyDiscount)
                .collect(Collectors.toList());
    }



    public List<String> findPricesFuture(String product) {
        List<CompletableFuture<String>> priceFutures = findPricesStream(product)
                .collect(Collectors.<CompletableFuture<String>>toList());

        return priceFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());
    }

    /*future에 주목
    * chain구조(내가 지음)
    * future의 CompletableFuture 결과를 다음 쨰 넘긴다.
    * 이로써 메인 스레드는 다른 작업을 할 수 있다.(책 358p 참조)
    *
    * 이떄 thenApply 메서드는 완전히 현재 작업을 완전히 끝날때 까지 블럭 시켜버린다.
    *
    * 그러면 첫 번째 CompletableFuture를 사용하는 동안에 블럭시켜버리면 두 번째 CompletableFuture는 동작을 못한다는 단점이 있네?
    * 이를 위해 탄생한것이 thenCompose
    *
    * thenCompose(특정작업 , executor)
    * executor은 결과를 어떻게 합칠지를 결정한다.
    * */
    Shop sh1 = new Shop("thenCompose");
    ExchangeService exChangeService = new ExchangeService();


    Future<Double> futureEx =
            //첫 번째 테스크 생성
            CompletableFuture.supplyAsync(()-> sh1.getPrice2("IPad")
                    ).thenCombine(
                            CompletableFuture.supplyAsync(
                                    //두 번째 테스크 생성
                                    ()->exChangeService.getRate(ExchangeService.Money.EUR, ExchangeService.Money.USD)),
                    //첫 번째 두 번째 결과 합치기!
                    (price,rate) -> price/rate
            );

    public Stream<CompletableFuture<String>> findPricesStream(String product) {
        return shops.stream()
                .map(shop -> CompletableFuture.supplyAsync(() -> shop.getPrice(product), executor))
                .map(future -> future.thenApply(Quote::parse))
                .map(future -> future.thenCompose(quote -> CompletableFuture.supplyAsync(() -> Discount.applyDiscount(quote), executor)));
    }





    public void printPricesStream(String product) {
        long start = System.nanoTime();
        CompletableFuture[] futures = findPricesStream(product)
                .map(f -> f.thenAccept(s -> System.out.println(s + " (done in " + ((System.nanoTime() - start) / 1_000_000) + " msecs)")))
                .toArray(size -> new CompletableFuture[size]);
        CompletableFuture.allOf(futures).join();
        System.out.println("All shops have now responded in " + ((System.nanoTime() - start) / 1_000_000) + " msecs");
    }
}


