package me.choi;


public class Book {

    MyBook myBook;

    public static String A = "A";

    private  String B = "B";

    public Book() {
    }

    public Book(String b) {
        B = b;
    }

    public Book(int i) {

    }

    public void c() {
        System.out.println("C");
    }

    public int sum(int left, int right) {
        return left+right;
    }
}
