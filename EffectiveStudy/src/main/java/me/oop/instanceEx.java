package me.oop;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/05/03
 * Time : 5:48 오후
 */
public class instanceEx {
    private final int age;
    private final String name;

    public instanceEx(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void method() {
        System.out.println("assign");
    }
}
