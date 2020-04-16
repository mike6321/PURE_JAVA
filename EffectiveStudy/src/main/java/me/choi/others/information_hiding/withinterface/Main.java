package me.choi.others.information_hiding.withinterface;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/04/17
 * Time : 12:12 오전
 */
public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        shape.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.rectangle();
    }
}
