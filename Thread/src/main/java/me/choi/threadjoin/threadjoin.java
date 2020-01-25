package me.choi.threadjoin;

public class threadjoin {
    static long startTime = 0;

    public static void main(String[] args) {
        threadjoin_1 th1 = new threadjoin_1();
        threadjoin_2 th2 = new threadjoin_2();

        th1.start();
        th2.start();
        startTime = System.currentTimeMillis();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {

        }
        System.out.println("소요시간 :: "+(System.currentTimeMillis() - startTime));
    }
}
class threadjoin_1 extends Thread{
    @Override
    public void run() {
        for (int i=0 ;i<300; i++) {
            System.out.print("-");
        }
    }
}
class threadjoin_2 extends Thread{
    @Override
    public void run() {
        for (int i=0 ;i<300; i++) {
            System.out.print("|");
        }
    }
}
