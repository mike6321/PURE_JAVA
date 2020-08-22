package me.choi.java8to11.optional;

import me.choi.java8to11.OnlineClass;

import java.util.ArrayList;
import java.util.List;

/**
 * Project : java8to11
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 3:40 오후
 */
public class OptionalEx {
    private static List<OnlineClass> springClasses = new ArrayList<>();

    public static void main(String[] args) {
        init();
    }

    private static void init() {
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", false));
    }
}
