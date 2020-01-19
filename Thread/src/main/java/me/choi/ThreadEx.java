package me.choi;
public class ThreadEx {

    public static void main(String[] args) {
        ThreadEx1_1 th1 = new ThreadEx1_1();
        th1.run();
    }
}

class ThreadEx1_1 extends Thread{
    @Override
    public void run() {
        ThrowException();
    }
    public void ThrowException () {
        try {
            throw  new Exception();
        }catch (Exception e) {
            e.printStackTrace();
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