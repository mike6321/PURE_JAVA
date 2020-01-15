package me.choi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Locale.filter;

public class Exercise {
    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        Apple apple = new Apple(60,"green");

        boolean test = exercise.test(apple);
        System.out.println(test);
    }

    public static List<Apple> fiilterApples(List<Apple> inventory, String color, int weight, boolean flag) {

        List<Apple> appleList = new ArrayList<>();

        for(Apple apple : inventory) {
            if(flag && apple.getColor().equals(color) || !flag && apple.getWeitght() > weight) {
                appleList.add(apple);
            }
        }

        return appleList;
    }
}
