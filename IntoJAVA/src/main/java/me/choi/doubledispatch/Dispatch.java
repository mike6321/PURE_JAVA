package me.choi.doubledispatch;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment : 메서드 디스패치
 * Time : 10:32 오후
 */
public class Dispatch {

    static class Service {
        void run() {
            System.out.println("run()");
        }
    }

    public static void main(String[] args) {
        new Service().run();
    }
}
