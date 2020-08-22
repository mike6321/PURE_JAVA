package me.choi.java8to11.optional;

import me.choi.java8to11.OnlineClass;
import me.choi.java8to11.Progress;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

        OnlineClass spring_boot = new OnlineClass(1, "spring boot", true);
        /**
         * NPE가 발생
         */
//        Duration studyDuration = spring_boot.getProgress().getStudyDuration();
//        System.out.println(studyDuration);

        /**
         * 기존의 해결방법
         *
         * 굉장히 위험한 코드
         * null check를 잊을 수 도 있기 때문
         */
//        Optional<Progress> progress = spring_boot.getProgress();
//        if (progress == null) {
//            throw new IllegalStateException();
//        }
//        if (progress != null) {
//            System.out.println(progress.getStudyDuration());
//        }

        /**
         * Optional의 사용
         */
        Optional<Progress> progress = spring_boot.getProgress();
        progress.ifPresent(p -> System.out.println(p.getStudyDuration()));
    }

    private static void init() {
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", false));
    }
}
