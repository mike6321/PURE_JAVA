package me.choi.others.information_hiding.factorymethodpattern;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/04/17
 * Time : 12:18 오전
 */
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createCircle();

        circle.draw();
    }
}
