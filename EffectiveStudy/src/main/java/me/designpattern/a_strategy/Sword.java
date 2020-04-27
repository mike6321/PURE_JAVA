package me.designpattern.a_strategy;

public class Sword implements Weapon{
    @Override
    public void attack() {
        System.out.println("Sword Attack");
    }
}
