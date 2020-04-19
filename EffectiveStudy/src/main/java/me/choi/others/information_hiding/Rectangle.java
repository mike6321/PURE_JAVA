package me.choi.others.information_hiding;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/04/16
 * Time : 10:51 오후
 */
public class Rectangle extends Shape{
    public void rectangle() {
        System.out.println("rectangle");
    }
    @Override
    public void draw() {
        rectangle();
    }

    public static void main(String[] args) {
        Shape shape = new Rectangle();
        shape.draw();
    }
}

