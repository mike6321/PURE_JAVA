package me.choi.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 3:27 오후
 */
public class StringExample2 {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        List<OnlineClass> javaClasses = new ArrayList<>();
        javaClasses.add(new OnlineClass(6, "The Java, Test", true));
        javaClasses.add(new OnlineClass(7, "The Java, Code manipulation", true));
        javaClasses.add(new OnlineClass(8, "The Java, 8 to 11", false));

        List<List<OnlineClass>> junwooEvents = new ArrayList<>();
        junwooEvents.add(springClasses);
        junwooEvents.add(javaClasses);

        System.out.println("***************************1***************************");
        // TODO spring 으로 시작하는 수업 1
        springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .forEach(oc -> System.out.println(oc.getId()));
        System.out.println("***************************1***************************");
        System.out.println();

        System.out.println("***************************2***************************");
        // TODO close 되지 않은 수업 2
        springClasses.stream()
                .filter(Predicate.not(OnlineClass::isClosed))
                .forEach(oc -> System.out.println(oc.getId()));
        System.out.println("***************************2***************************");
        System.out.println();

        System.out.println("***************************3***************************");
        // TODO 수업 이름만 모아서 스트림 만들기 3
        junwooEvents.stream().flatMap(Collection::stream)
                .forEach(oc -> System.out.println(oc.getTitle()));
        System.out.println("***************************3***************************");
        System.out.println();


        System.out.println("***************************4***************************");
        // TODO 두 수업 목록에 들어있는 모든 수업 아이디 출력 4
        junwooEvents.stream().flatMap(Collection::stream)
                .forEach(oc -> System.out.println(oc.getId()));
        System.out.println("***************************4***************************");
        System.out.println();

        System.out.println("***************************5***************************");
        // TODO 10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 빼고 최대 10개 까지만 5
        Stream.iterate(10, i -> i + 1)
                .skip(10)
                .limit(10)
                .forEach(System.out::println);
        System.out.println("***************************5***************************");
        System.out.println();

        System.out.println("***************************6***************************");
        // TODO 자바 수업 중에 Test가 들어있는 수업이 있는지 확인 6
        boolean test = javaClasses.stream().anyMatch(jc -> jc.getTitle().contains("Test"));
        System.out.println(test);
        System.out.println("***************************6***************************");
        System.out.println();

        System.out.println("***************************7***************************");
        System.out.println();
        // TODO 스프링 수업 중에 제목에 spring이 들어간 것만 모아서 List로 만들기 7
        List<String> spring = springClasses.stream().filter(sp -> sp.getTitle().contains("spring"))
                                                    .map(sp -> sp.getTitle())
                                                    .collect(Collectors.toList());
        for (String s : spring) {
            System.out.println(s);
        }
        System.out.println("***************************7***************************");

    }
}
