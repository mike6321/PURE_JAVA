package me.choi.version2;

import java.util.concurrent.Future;

public class AsyncShopClient {
    public static void main(String[] args) {
        AsyncShop shop = new AsyncShop("GSShop");
        long start = System.nanoTime();
        Future<Double> futurePrice = shop.getPrice("IPadPro3");
        long incocationTime = ((System.nanoTime() - start) / 1_000_000);
        System.out.println("맡기는데 걸린 시간은 " + incocationTime
                + " msecs 입니다...");

        try {
            /*이전코드*/
            //System.out.printf("해당상품의 가격 :  %.2f%n", price);
            System.out.printf("해당상품의 가격 :  %.2f%n", futurePrice.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long retrivalTime = ((System.nanoTime() - start) / 1_000_000);
        System.out.println("가격은 " + retrivalTime + " msecs 이후에 리턴되었습니다...");

    }
}
