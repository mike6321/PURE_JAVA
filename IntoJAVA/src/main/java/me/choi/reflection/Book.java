package me.choi.reflection;

import me.choi.reflection.annotation.AnotherAnnotation;
import me.choi.reflection.annotation.MyAnnotation;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:11 오전
 */
@MyAnnotation(31)
public class Book implements MyInterface{

    @AnotherAnnotation(17)
    private String a;

    private static String B = "BOOK";

    private static final String c = "BOOK";

    public String d = "d";

    public String e = "e";

    public Book() {
    }

    public Book(String a, String d, String e) {
        this.a = a;
        this.d = d;
        this.e = e;
    }

    private void f() {
        System.out.println("F");
    }

    public void g() {
        System.out.println("g");
    }

    public int h() {
        return 100;
    }
}
