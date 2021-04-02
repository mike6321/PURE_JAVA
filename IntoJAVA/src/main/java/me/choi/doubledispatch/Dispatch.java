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
        void run(int number) {
            System.out.println("number = " + number);
        }
        void run(String msg) {
            System.out.println("msg = " + msg);
        }
    }

    public static void main(String[] args) {
        new Service().run();
        new Service().run("Dispatch");
        new Service().run("1");
    }
}
