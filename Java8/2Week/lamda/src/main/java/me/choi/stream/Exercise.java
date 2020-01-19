package me.choi.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(new Dish("pork", false,800, Dish.Type.MEAT),
                                        new Dish("beef", false,700, Dish.Type.MEAT),
                                        new Dish("chicken", false,400, Dish.Type.MEAT),
                                        new Dish("french fries", true, 530, Dish.Type.OTHER),
                                        new Dish("rice", true,350, Dish.Type.OTHER),
                                        new Dish("season fruit", true,120, Dish.Type.OTHER),
                                        new Dish("pizza",true,550, Dish.Type.OTHER),
                                        new Dish("salmon", false,450, Dish.Type.FISH)
        );

        long start = System.currentTimeMillis();
        System.out.println(start);
        List<String> name = new ArrayList<>();
        for(Dish dish : menu) {
            name.add(dish.getName());
        }
        long finish = System.currentTimeMillis();
        System.out.println("list :: "+(finish-start));

        start = System.currentTimeMillis();
        System.out.println(start);
        List<String> names = menu.parallelStream()
                                    .map(Dish::getName)
                                    .collect(Collectors.toList());
        System.out.println(names);
        finish = System.currentTimeMillis();
        System.out.println("stream :: "+(finish-start));
    }
}
