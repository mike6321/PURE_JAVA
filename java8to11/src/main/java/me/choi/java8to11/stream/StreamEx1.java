package me.choi.java8to11.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Project : java8to11
 *
 * @author : jwdeveloper
 * @comment : Stream 연습
 * Time : 11:43 오후
 */
public class StreamEx1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("junwoo");
        names.add("jwdeveloper");
        names.add("keesun");
        names.add("foo");

        Stream<String> stringStream = names.stream().map(String::toUpperCase);

        /**
         * 예시
         * */
        // 출력이 되지 않는다.
        names.stream().map(s -> {
            System.out.println(s);

            return s.toUpperCase();
        });

        /**
         * Collectors의 사용
         * */
        List<String> collect = names.stream().map(s -> {
            System.out.println(s);

            return s.toUpperCase();
        }).collect(Collectors.toList());
        System.out.println("*********************");
        collect.forEach(System.out::println);

        System.out.println("*********************");
        names.forEach(System.out::println);

        /**
         * 병렬처리
         * */
        List<String> collect2 = names.parallelStream().map(s -> {
            System.out.println(s + " " + Thread.currentThread().getName());
            return s.toUpperCase();
        }).collect(Collectors.toList());
    }
}
