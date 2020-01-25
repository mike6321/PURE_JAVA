package me.choi.threadstopresumestop;

public class ThreadStop {
    public static void main(String[] args) {
        RunImpl run = new RunImpl();
        Thread th1 = new Thread(run, "*");
        Thread th2 = new Thread(run, "**");
        Thread th3 = new Thread(run, "***");

        th1.start();
        th2.start();
        th3.start();

        try {
            Thread.sleep(2000);
            th1.suspend();
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(3000);
            th1.resume();
            Thread.sleep(3000);
            th1.stop();
            th2.stop();
            Thread.sleep(2000);
            th3.stop();

        } catch (InterruptedException e) {

        }


    }
}
class RunImpl implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
