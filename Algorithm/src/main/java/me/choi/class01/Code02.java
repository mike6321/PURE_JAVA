package me.choi.class01;

public class Code02 {
    public static void main(String[] args) {
        int n = 4;
        func(n);
    }

    private static void func(int n) {
        if (n<=0) {
            return;
        } else {
            System.out.println("Hello Junwoo!");
            func(n-1);
        }
    }
}
