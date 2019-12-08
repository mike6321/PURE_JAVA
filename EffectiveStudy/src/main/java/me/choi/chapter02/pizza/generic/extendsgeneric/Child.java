package me.choi.chapter02.pizza.generic.extendsgeneric;

import java.util.Comparator;
import java.util.List;

public class Child<T> extends Parent{

    public Child() {
        System.out.println("I am son of Parent");
    }

    //    public <T> Child<U extends Parent>(T info){
//
//    }
//    public <T> void sort(List<T> list, Comparator<? super T> comp) {
//
//
//
//    }
//
//    public  <T extends Parent> void Child (T param){
//
//    }
//
//        public  <T> void Child2 (List<T> param, Child<? extends Parent> child)  {
//
//    }
}
