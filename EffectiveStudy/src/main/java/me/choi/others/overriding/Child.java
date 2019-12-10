package me.choi.others.overriding;

public class Child extends Parent{
    @Override
    public void onCreate() {
        System.out.println("나는 자식이야.");
    }
}

