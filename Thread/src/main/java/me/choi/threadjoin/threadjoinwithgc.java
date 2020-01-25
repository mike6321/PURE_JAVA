package me.choi.threadjoin;

public class threadjoinwithgc {
    public static void main(String[] args) {
        threadjoinwithgc_1 th1 = new threadjoinwithgc_1();
        th1.setDaemon(true);
        th1.start();

        int requiredMemory = 0;

        for (int i=0;i<20;i++) {
        //            try {
        //                Thread.sleep(1000);
        //            } catch (InterruptedException e) {
        //            }
            requiredMemory = (int) ((Math.random() * 10) * 20);

            if(th1.freeMemory() < requiredMemory || th1.freeMemory() < th1.totalMemory() * 0.4 ) {
                th1.interrupt();
                try {
                    th1.join(100);
                } catch (InterruptedException e) {
                }
            }
            th1.usedMemory += requiredMemory;
            System.out.println("usedMemory : "+th1.usedMemory);
        }
    }
}
class threadjoinwithgc_1 extends Thread {
    final static int MAX_MEMORY = 1000;

    int usedMemory = 0;
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000*10);
            } catch (InterruptedException e) {
                System.out.println("Awaken by interrupt");
            }
            gc();
            System.out.println("GC free memory :: "+freeMemory());
        }
    }
    public void gc() {
        usedMemory -=300;
        if (usedMemory<0) usedMemory = 0;
    }
    public int totalMemory() {return MAX_MEMORY;}
    public int freeMemory() {return MAX_MEMORY - usedMemory;}
}

