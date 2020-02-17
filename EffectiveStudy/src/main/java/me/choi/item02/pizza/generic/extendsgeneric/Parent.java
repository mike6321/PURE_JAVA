package me.choi.item02.pizza.generic.extendsgeneric;

public class Parent<T> {

    public Parent() {

    }
    public Parent(T age) {
        System.out.println("I am Parent"+age);
    }

}
