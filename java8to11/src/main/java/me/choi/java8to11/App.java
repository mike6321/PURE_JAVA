package me.choi.java8to11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * Project : java8to11
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 12:52 오전
 */
public class App {
    public static void main(String[] args) {
        // TODO: [static mehtod 메서드레퍼런스] junwoochoi 2020/07/23 12:56 오전
        UnaryOperator<String> hi = (s) -> "hi" +s;
        UnaryOperator<String> hi1 = Greeting::hi;

        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;

        Function<String, Greeting> greetingFunction = Greeting::new;
        Supplier<Greeting> greetingSupplier = Greeting::new;

        Greeting junwoo = greetingFunction.apply("junwoo");
        System.out.println(junwoo.getName());


        String[] names = {"junwoo", "hotire", "developer"};
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        Arrays.sort(names, (o1, o2) -> 0);

        Arrays.sort(names, String::compareToIgnoreCase);;
        System.out.println(Arrays.toString(names));
    }
}
