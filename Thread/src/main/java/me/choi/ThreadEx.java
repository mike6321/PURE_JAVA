package me.choi;
public class ThreadEx {

    public static void main(String[] args) {
        ThreadEx1_1 th1 = new ThreadEx1_1();
        th1.start();

        Runnable r = new ThreadEx1_1();
        Thread th2 = new Thread(r);
        th2.start();
//        th2.start();
    }
}

class ThreadEx1_1 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println(getName());
        }
    }
}
class ThreadEx1_2 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}