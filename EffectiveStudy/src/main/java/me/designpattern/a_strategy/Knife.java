package me.designpattern.a_strategy;

public class Knife implements Weapon{
    @Override
    public void attack() {
        System.out.println("Knife Attack");
    }
}
