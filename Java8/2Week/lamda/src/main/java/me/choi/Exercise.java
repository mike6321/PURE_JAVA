package me.choi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Locale.filter;

public class Exercise {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"), new Apple(20,"red"));
        List<Apple> apples = filterGreenApples(inventory, "green");
        System.out.println(apples.get(0).getColor());

    }
    /*초록색을 필터링*/
    public static List<Apple> filterGreenApples (List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }
}
