package me.choi.chapter03.version02;

public class Elvis2 {
    private static final Elvis2 INSTANCE = new Elvis2();

    public static Elvis2 getInstance() {
        return INSTANCE;
    }

    private Elvis2 () {

    }
}
