package me.choi;

public class MultiThread {
    static long startTime = 0;

    public static void main(String[] args) {
        MultiThread2 th1 = new MultiThread2();
        th1.start();
        startTime = System.currentTimeMillis();

        for (int i=0;i<500;i++) {
            System.out.printf("%s", new String("ㅡ"));
        }
        System.out.println("소요시간 1 : "+(System.currentTimeMillis()-MultiThread.startTime));
    }
}
class MultiThread2 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<500;i++) {
            System.out.printf("%s", new String("|"));
        }

        System.out.println("소요시간 2 : "+(System.currentTimeMillis()-MultiThread.startTime));
    }
}
