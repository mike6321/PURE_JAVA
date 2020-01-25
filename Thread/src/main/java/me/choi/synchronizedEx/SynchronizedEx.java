package me.choi.synchronizedEx;

public class SynchronizedEx {
    public static void main(String[] args) {
        Runnable runnable = new SynchronizedEx2();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}
