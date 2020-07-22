package me.choi.java8to11;

/**
 * Project : java8to11
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 12:51 오전
 */
public class Greeting {
    private String name;

    public Greeting() {
    }

    public Greeting(String name) {
        this.name = name;
    }

    public String hello(String name) {
        return "hello" +name;
    }
    public static String hi(String name) {
        return "hi" +name;
    }

    public String getName() {
        return name;
    }
}
