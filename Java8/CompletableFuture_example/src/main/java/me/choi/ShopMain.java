package me.choi;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class ShopMain {

    public static void main(String[] args) {
        Shop shop = new Shop("GSShop");

        long start = System.nanoTime();
        Future<Double> futurePrice = shop.getPriceAsync("IpadPro3");
        long invocationTime = ((System.nanoTime() - start) / 1_000_000);

        System.out.println("맡기는데 걸린 시간은 " + invocationTime
                + " msecs 입니다...");

        /*가격을 측정하는 행동을 다른 스레드에 맡기고 다른 작업을 시작한다.*/
        doSomethingElse();

        try {
            double price = futurePrice.get();
            /*가격정보가 있으면 가격정보를 가져오고
            * 가격정보가 없으면 가져올때까지 기다린다.(block)
            * */
            System.out.printf("해당상품의 가격 :  %.2f%n", price);
        } catch (ExecutionException | InterruptedException e) {  //가격을 가져오는 동안 오류가 발생할 것을 대비해 예외처리
            throw new RuntimeException(e);
        }
        long retrievalTime = ((System.nanoTime() - start) / 1_000_000);
        System.out.println("가격은 " + retrievalTime + " msecs 이후에 리턴되었습니다...");
    }

    private static void doSomethingElse() {
        System.out.println("다른일을 하고 있습니다...");
    }

}
