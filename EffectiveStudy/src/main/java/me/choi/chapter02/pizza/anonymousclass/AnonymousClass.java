package me.choi.chapter02.pizza.anonymousclass;

public class AnonymousClass {

    Runnable getRunnable() {
        return new Runnable() {
            @Override
            public void run() {

            }
        };
    }

}
