package me.choi.item02.pizza.generic.multigeneric;

public class Person<T, R> {
    private T info;
    private R age;

    public Person(T info, R age) {
        this.info = info;
        this.age = age;
    }

    public <U> void PersonInfo(U info) {

    }


    public T getinfo() {
        return info;
    }

    public void setinfo(T info) {
        this.info = info;
    }

    public R getAge() {
        return age;
    }

    public void setAge(R age) {
        this.age = age;
    }
}
