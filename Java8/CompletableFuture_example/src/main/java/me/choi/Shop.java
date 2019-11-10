package me.choi;

import java.util.Random;
import java.util.concurrent.*;

import static me.choi.Util.delay;

public class Shop {

    private final String name;
    private final Random random;

    public Shop(String name) {
        this.name = name;
        random = new Random(name.charAt(0) * name.charAt(1) * name.charAt(2));
    }



    /*CompletableFuture 코드 구현(version01)*/
    public double getPrice(String product) {
        return calculatePrice(product);
    }

    public Future<Double> getPriceAsync(String product) {
        CompletableFuture<Double> futurePrice = new CompletableFuture<>();
        /*다른 스레드를 생성해여 해당 스레드에서 현재 작업을 맡긴다.*/
        new Thread( () -> {

            double price = calculatePrice(product);
            futurePrice.complete(price);
            //만약 맡겨 둔 스레드에서 처리과정에 에러가 발생한다면....?
            //예외처리로 감싼다!
            // completeExceptionally = Future를 종료
            /*
            try {
                double price = calculatePrice(product);
                futurePrice.complete(price);
            }catch (Exception ex) {
                futurePrice.completeExceptionally(ex);
            }
            /*
             */
        }).start();
        return futurePrice;
    }

    private double calculatePrice(String product) {
        delay();
        return random.nextDouble() * product.charAt(0) + product.charAt(1);
    }

    public String getName() {
        return name;
    }





    /*ExecutorService*/
    //전제조건 : 스레드 풀에 테스크르 제출하려면 ExecutorService를 만들어야한다.
    ExecutorService executorService = Executors.newCachedThreadPool();
    Future<Double> future = executorService.submit(new Callable<Double>() {
        @Override
        public Double call() throws Exception {
            /*실행이 오래걸리는 작업은 다른스레드에서 비동기적으로 처리*/
            return doLongSomething();
        }
    });


    /*비동기작업을 수행하는 동안 다른작업 수행*/
    Double k = doShortSomething();

    private Double doLongSomething() {
        return 0.2;
    }
    private Double doShortSomething() {
        return 0.2;
    }

}
