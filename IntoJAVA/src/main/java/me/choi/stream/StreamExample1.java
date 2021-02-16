package me.choi.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 3:14 오후
 */
public class StreamExample1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("junwoo");
        names.add("sunga");
        names.add("mesung");
        names.add("whiteship");

        List<String> stringStream = names.stream()
                                        .map(String::toUpperCase)
                                        .distinct()
                                        .collect(Collectors.toList());

        System.out.println(stringStream);
        names.forEach(System.out::println);
    }
}
