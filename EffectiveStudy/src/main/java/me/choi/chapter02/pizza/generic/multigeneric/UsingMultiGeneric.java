package me.choi.chapter02.pizza.generic.multigeneric;

public class UsingMultiGeneric {

    UsingMultiGeneric() {
        Person<EmpInfo, Integer> person = new Person<EmpInfo, Integer>(new EmpInfo(1,2,"songpa"),1);

        person.<Integer>PersonInfo(132);

    }

}
