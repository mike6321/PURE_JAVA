package me.choi.others.information_hiding.withinterface;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/04/17
 * Time : 12:10 오전
 */
public class Rectangle implements Shape{
    public void rectangle() {
        System.out.println("rectangle");
    }
    @Override
    public void draw() {
        System.out.println("rectangle(Override)");
    }

}
