package me.choi.others.information_hiding.withinterface;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/04/17
 * Time : 12:13 오전
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("(Override) Cicle");
    }
}
