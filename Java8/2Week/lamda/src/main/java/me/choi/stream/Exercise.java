package me.choi.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(new Dish("pork", false,800, Dish.Type.MEAT),
                                        new Dish("pork", false,700, Dish.Type.MEAT),
                                        new Dish("chicken", false,400, Dish.Type.MEAT),
                                        new Dish("french fries", true, 530, Dish.Type.OTHER),
                                        new Dish("rice", true,350, Dish.Type.OTHER),
                                        new Dish("season fruit", true,120, Dish.Type.OTHER),
                                        new Dish("pizza",true,550, Dish.Type.OTHER),
                                        new Dish("salmon", false,450, Dish.Type.FISH)
        );
        System.out.println("flatmap");
        /*flatmap*/
        List<String> strList = Arrays.asList("Hello","World");
        List<String[]> collect = strList.stream()
                .map(s -> s.split(""))
                .distinct()
                .collect(Collectors.toList());

        for (String[] str : collect) {
            for(int i=0;i<str.length; i++) {
                System.out.println(str[i]);
            }
        }



        System.out.println("map");
        /*map*/
        List<String> dishesmap = menu.stream()
                                     .filter(d -> d.getCalories() > 700)
                                     .map(Dish::getName)
                                     .collect(Collectors.toList());
                System.out.println(dishesmap);

        List<Integer> dishesmap2 = menu.stream()
                                        .map(Dish::getName)
                                        .map(String::length)
                                        .collect(Collectors.toList());
        System.out.println(dishesmap2);


        System.out.println("skip");
        /*skip*/
        List<Dish> dishes = menu.stream()
                                .filter(d -> d.getCalories() > 300)
                                .skip(2)
                                .collect(Collectors.toList())
                                ;
        System.out.println(dishes);

        System.out.println("distinct");
        /*distinct*/
        List<Integer> numbers = Arrays.asList(1,2,1,3,3,2,4);
        numbers.stream()
                .filter((Integer i) -> i %2 == 0)
                .distinct()
                .forEach(System.out::println);


//        long start = System.currentTimeMillis();
//        System.out.println(start);
//        List<String> name = new ArrayList<>();
//        for(Dish dish : menu) {
//            name.add(dish.getName());
//        }
//        long finish = System.currentTimeMillis();
//        System.out.println("list :: "+(finish-start));
//
//        start = System.currentTimeMillis();
//        System.out.println(start);
//        List<String> names = menu.parallelStream()
//                                    .map(Dish::getName)
//                                    .collect(Collectors.toList());
//        System.out.println(names);
//        finish = System.currentTimeMillis();
//        System.out.println("stream :: "+(finish-start));

    }

    public static Predicate distinctBykey(Function keyExtractor) {
        Map seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;

    }
}
