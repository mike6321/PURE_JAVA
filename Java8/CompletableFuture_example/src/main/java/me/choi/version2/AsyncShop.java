package me.choi.version2;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

import static me.choi.version2.Util.delay;
import static me.choi.version2.Util.format;

public class AsyncShop {

    private final String name;
    private final Random random;

    public AsyncShop(String name) {
        this.name = name;
        random = new Random(name.charAt(0) * name.charAt(1) * name.charAt(2));
    }
    /*supplyAsync(version02)*/
    public Future<Double> getPrice(String product) {
/*
        CompletableFuture<Double> futurePrice = new CompletableFuture<>();
        new Thread( () -> {
                    try {
                        double price = calculatePrice(product);
                        futurePrice.complete(price);
                    } catch (Exception ex) {
                        futurePrice.completeExceptionally(ex);
                    }
        }).start();
        return futurePrice;
*/
        return CompletableFuture.supplyAsync(() -> calculatePrice(product));
        /*
        [supplyAsync 내부구조] (p 345)
        1. Supplier<U> supplier 를 파라미터로 받는다.
        2. 반환타입이  CompletableFuture 이다.
        3. asyncSupplyStage의 첫번째 파라미터가 Executor 인것을 주목하자.
        -> Executor를 이용해 성능을 개선할 수 있다.
        4. ForkJoinPool의 Executor 중 하나가 Supplier를 실행한다.

        1)
        public static <U> CompletableFuture<U> supplyAsync(Supplier<U> supplier) {
            return asyncSupplyStage(ASYNC_POOL, supplier);
        }
        2)
        private static final Executor ASYNC_POOL = USE_COMMON_POOL ?
        ForkJoinPool.commonPool() : new ThreadPerTaskExecutor();
        3)
        static <U> CompletableFuture<U> asyncSupplyStage(Executor e,
                Supplier<U> f) {
            if (f == null) throw new NullPointerException();
            CompletableFuture<U> d = new CompletableFuture<U>();
            e.execute(new CompletableFuture.AsyncSupply<U>(d, f));
            return d;
        }
        */
    }

    private double calculatePrice(String product) {
        delay();
        if (true) throw new RuntimeException("해당 제품은 재고가 없습니다...");
        return format(random.nextDouble() * product.charAt(0) + product.charAt(1));
    }

}
