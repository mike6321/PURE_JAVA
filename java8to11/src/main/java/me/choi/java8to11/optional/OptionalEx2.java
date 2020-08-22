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
 * Time : 4:36 오후
 */
public class OptionalEx2 {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "rest api development", false));

        //Optional 타입으로 나오는것에 주목
        Optional<OnlineClass> optional = springClasses.stream()
                                                        .filter(oc -> oc.getTitle().startsWith("spring"))
                                                        .findFirst();
        // TODO: [isPresent 사용] junwoochoi 2020/08/22 4:41 오후
        boolean present = optional.isPresent();
        System.out.println(present);

        // TODO: [isEmpty 사용] junwoochoi 2020/08/22 4:41 오후
        boolean empty = optional.isEmpty();
        System.out.println(empty);

        // TODO: [get 사용] junwoochoi 2020/08/22 6:00 오후
        OnlineClass onlineClass = optional.get();
        System.out.println(onlineClass.getTitle());
        /**
         * 만약 값이 없다면?
         * RuntimeException 발생 (NoSuchElementException)
         */
        Optional<OnlineClass> optional2 = springClasses.stream()
                                                            .filter(oc -> oc.getTitle().startsWith("jpa"))
                                                            .findFirst();
        if (optional2.isPresent()) {
            OnlineClass onlineClass1 = optional2.get();
            System.out.println(onlineClass1.getTitle());
        }

        // TODO: [ifPresent 사용] junwoochoi 2020/08/22 6:06 오후
        // get을 사용하지 않아도 된다.
        optional2.ifPresent(oc -> {
            System.out.println(oc.getTitle());
        });

        // TODO: [orElse 사용] junwoochoi 2020/08/22 6:09 오후
        // 허나 있던 없던 createNewMethod는 무조건 탄다.
        OnlineClass onlineClass1 = optional2.orElse(createNewMethod());
        System.out.println(onlineClass1.getTitle());

        // TODO: [orElseGet 사용] junwoochoi 2020/08/22 6:12 오후
        OnlineClass onlineClass2 = optional.orElseGet(OptionalEx2::createNewMethod);
        System.out.println(onlineClass2.getTitle());

        // TODO: [orElseThrow 사용] junwoochoi 2020/08/22 6:15 오후
//        optional2.orElseThrow(() -> {
//            return new IllegalArgumentException();
//        });
//        OnlineClass onlineClass3 = optional2.orElseThrow(IllegalStateException::new);

        // TODO: [filter 사용] junwoochoi 2020/08/22 6:20 오후
        Optional<OnlineClass> onlineClass4 = optional.filter(oc -> !oc.isClosed());
        System.out.println(onlineClass4.isEmpty());

        // TODO: [map 사용] junwoochoi 2020/08/22 6:24 오후
        Optional<Integer> integer = optional.map(OnlineClass::getId);
        System.out.println(integer.isPresent());

        // TODO: [flatmap 사용] junwoochoi 2020/08/22 6:26 오후
        /**
         * Optional의 Optional인 경우
         * Optional<Optional<Progress>> progress1 = optional.map(OnlineClass::getProgress);
         */
        Optional<Progress> progress = optional.flatMap(OnlineClass::getProgress);



    }

    private static OnlineClass createNewMethod() {
        System.out.println("create new online class");
        return new OnlineClass(10, "New class", false);
    }

}
