package me.choi.chapter02_lamda;

import java.awt.*;
import java.util.Comparator;
import java.util.function.Function;

public class main {
    public static void main(String[] args) {

    Comparator<Apple> appleComparator = (Apple o1, Apple o2) -> o1.getWeight() - o2.getWeight();


//    Comparator<Apple> appleComparator = new Comparator<Apple>() {
//        @Override
//        public int compare(Apple o1, Apple o2) {
//            return o1.getWeight() - o2.getWeight();
//        }
//    };




    }
}
