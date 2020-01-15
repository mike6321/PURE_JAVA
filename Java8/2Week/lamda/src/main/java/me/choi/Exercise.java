package me.choi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Locale.filter;

public class Exercise {
    public static void main(String[] args) {
        List<Apple> appleList = Arrays.asList(new Apple(60, "green"), new Apple(100, "red"));
        List<Apple> result = filterApple(appleList, new AppleGreenColorPredicate());
        System.out.println(result.isEmpty());

    }

    public static List<Apple> filterApple(List<Apple> inventory, ApplePredicate applePredicate) {
        List<Apple> appleList = new ArrayList<>();
        for(Apple apple : inventory) {
            if (applePredicate.test(apple)) {
                appleList.add(apple);
            }
        }
        return appleList;
    }

}
