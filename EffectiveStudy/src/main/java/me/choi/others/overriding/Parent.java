package me.choi.others.overriding;

public class Parent extends GrandMother{

    @Override
    public void onCreate() {
        System.out.println("나는 엄마야");
    }
}
