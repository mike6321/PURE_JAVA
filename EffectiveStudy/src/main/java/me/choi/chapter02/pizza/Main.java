package me.choi.chapter02.pizza;

import static me.choi.chapter02.pizza.MyPizza.Size.SMALL;
import static me.choi.chapter02.pizza.Pizza.Topping.ONION;
import static me.choi.chapter02.pizza.Pizza.Topping.SAUSAGE;

public class Main {
    public static void main(String[] args) {
        MyPizza myPizza =  new MyPizza.Builder(SMALL)
                                .addTopping(SAUSAGE).addTopping(ONION).build();



    }
}
