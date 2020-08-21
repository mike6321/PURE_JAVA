package me.choi.java8to11.stream;

import java.util.ArrayList;
import java.util.List;

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

        // TODO: [close 되지 않은 수업] junwoochoi 2020/08/22 12:41 오전

        // TODO: [수업 이름만 모아서 스트림 만들기] junwoochoi 2020/08/22 12:42 오전

        // TODO: [두 수업 목록에 들어있는 모든 수업 아이디 출력] junwoochoi 2020/08/22 12:42 오전

        // TODO: [10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 빼고 최대 10개 까지만] junwoochoi 2020/08/22 12:42 오전

        // TODO: [자바 수업 중에 Test가 들어있는 수업이 있는지 확인] junwoochoi 2020/08/22 12:43 오전




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
