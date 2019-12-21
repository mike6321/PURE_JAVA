package me.choi;

public class Book {
    int totalBookCount;
    int nowBookCount;

    public boolean HowManyBook() {
        if (totalBookCount < nowBookCount) {
            return false;
        }

        return true;

    }
}
