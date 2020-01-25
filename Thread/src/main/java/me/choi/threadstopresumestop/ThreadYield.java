package me.choi.threadstopresumestop;

public class ThreadYield {
    public static void main(String[] args) {
        /*thread 인스턴스 생성*/
        ThreadYield_1 th1 = new ThreadYield_1("th1");
        ThreadYield_1 th2 = new ThreadYield_1("th2");
        ThreadYield_1 th3 = new ThreadYield_1("th3");
        /*thread 실행*/
        th1.start();
        th2.start();
        th3.start();
        System.out.println("thread 시작!!!");
        try {
            Thread.sleep(2000);
            th1.suspend();
            System.out.println(Thread.currentThread().getName()+" suspend!!");


            Thread.sleep(2000);

            th2.suspend();
            System.out.println(Thread.currentThread().getName()+" suspend!!");


            Thread.sleep(3000);

            th1.resume();
            System.out.println(Thread.currentThread().getName()+" resume!!");

            Thread.sleep(3000);

            th1.stop();

            Thread.sleep(2000);
            th3.stop();

            th2.resume();
        } catch (InterruptedException e) {

        }
    }
}
class ThreadYield_1 implements Runnable{

    boolean suspended = false;
    boolean stopped = false;

    Thread th;

    public ThreadYield_1(String name) {
        th = new Thread(this, name);
    }

    @Override
    public void run() {
        String name = th.getName();

        while (!stopped) {
            if (!suspended) {
                System.out.println("현재 thread :: "+name);
                try {

                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(name + "-interrupted");
                }
            }else {
                Thread.yield();
            }
        }
        System.out.println(name + "-stopped");
    }
    public void suspend() {
        suspended = true;
        th.interrupt();
        System.out.println(th.getName() + "-interrupt () by suspend()");
    }
    public void resume() {
        suspended = false;
    }
    public void stop () {
        stopped = true;
        th.interrupt();
        System.out.println(th.getName() + "-interrupt () by stop()");
    }
    public void start() {
        th.start();
    }
}
