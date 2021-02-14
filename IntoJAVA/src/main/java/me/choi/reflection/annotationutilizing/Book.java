package me.choi.reflection.annotationutilizing;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:25 오후
 */
public class Book {

    public static String A = "A";

    private String B = "B";
    public Book2 book2;

    public Book() {
    }

    public Book(String b) {
        B = b;
    }

    public void c() {
        System.out.println("C");
    }

    public int sum(int left, int right) {
        return left + right;
    }
}
