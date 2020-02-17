package me.choi.item02.pizza.anonymousclass;

public class AnonymousClass {

    Runnable getRunnable() {
        return new Runnable() {
            @Override
            public void run() {

            }
        };
    }

}
