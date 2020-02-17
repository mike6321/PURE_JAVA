package me.choi.item02.pizza.generic.extendsgeneric;

public class UsingGeneric {

    public <T> void UsingGeneric(Child<? super Parent> child) {

    }

    public <T extends Parent>  T UsingGeneric(T t1) {

        return t1;
    }
}
