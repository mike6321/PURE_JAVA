package me.oop.uiformaccessprinciple.step02;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 5:37 오후
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,15);
        System.out.println(rectangle.toString());

        rectangle.Area(15);
        System.out.println(rectangle.toString());
    }
}
