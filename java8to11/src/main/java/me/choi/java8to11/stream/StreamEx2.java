package me.choi.java8to11.stream;

import me.choi.java8to11.OnlineClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Project : java8to11
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 12:13 오전
 */
public class StreamEx2 {
    private static List<OnlineClass> springClasses = new ArrayList<>();
    private static List<OnlineClass> javaClasses = new ArrayList<>();
    private static List<List<OnlineClass>> junwooEvents = new ArrayList<>();

    public static void main(String[] args) {
        init();

        // TODO: [Spirng으로 시작하는 수업] junwoochoi 2020/08/22 12:40 오전
        springClasses.stream()
                        .filter(oc -> oc.getTitle().startsWith("spring"))
                        .forEach(oc -> System.out.println(oc.getId()));

        System.out.println("*******************************************");

        // TODO: [close 되지 않은 수업] junwoochoi 2020/08/22 12:41 오전
        // ex1
        springClasses.stream()
                        .filter(oc -> !oc.isClosed())
                        .forEach(oc -> System.out.println(oc.getId()));
        // ex2
        springClasses.stream()
                        .filter(Predicate.not(OnlineClass::isClosed))
                        .forEach(oc -> System.out.println(oc.getId()));

        System.out.println("*******************************************");

        // TODO: [수업 이름만 모아서 스트림 만들기] junwoochoi 2020/08/22 12:42 오전
        springClasses.stream()
                        .map(oc -> oc.getTitle())
                        .forEach(System.out::println);

        System.out.println("*******************************************");

        // TODO: [두 수업 목록에 들어있는 모든 수업 아이디 출력] junwoochoi 2020/08/22 12:42 오전
        junwooEvents.stream()
                        .flatMap(Collection::stream)
                        .forEach(oc -> System.out.println(oc.getId()));

        System.out.println("*******************************************");

        // TODO: [10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 빼고 최대 10개 까지만] junwoochoi 2020/08/22 12:42 오전
        Stream.iterate(10, i -> i + 1)
                .skip(10)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("*******************************************");

        // TODO: [자바 수업 중에 Test가 들어있는 수업이 있는지 확인] junwoochoi 2020/08/22 12:43 오전
        boolean test = javaClasses.stream().anyMatch(oc -> oc.getTitle().contains("Test"));
        System.out.println(test);

        System.out.println("*******************************************");

        // TODO: [스프링 수업 중에 제목에 spring이 들어간 것만 모아서 List 만들기] junwoochoi 2020/08/22 1:48 오전
        List<String> spirng = springClasses.stream()
                .filter(oc -> oc.getTitle().contains("spring"))
                .map(OnlineClass::getTitle)
                .collect(Collectors.toList());
        spirng.forEach(System.out::println);

        System.out.println("*******************************************");

        springClasses.stream()
                        .map(oc -> oc.getTitle())
                        .filter(s -> s.contains("rest"))
                        .collect(Collectors.toList())
                        .forEach(System.out::println);

    }

    private static void init() {
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        javaClasses.add(new OnlineClass(6, "The Java Test", true));
        javaClasses.add(new OnlineClass(7, "The Java, Code Manipulation", true));
        javaClasses.add(new OnlineClass(8, "The Java, 8 to 11", false));

        junwooEvents.add(springClasses);
        junwooEvents.add(javaClasses);
    }
}
