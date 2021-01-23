package me.choi.multithreading;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:53 오후
 */
public class ThreadCreation extends Thread{

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        new Thread(new Runnable() {
            @Override
            public void run() {
                // TODO: [sleep] junwoochoi 2021/01/23 11:00 오후
                /**
                 * sleep에는 long 타입을 사용하자 대문자를 사용하자
                 * */
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
    }
}
