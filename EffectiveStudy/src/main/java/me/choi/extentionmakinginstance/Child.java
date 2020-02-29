package me.choi.extentionmakinginstance;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/29
 * Time : 8:00 오후
 */
public class Child extends Parent{
    private final int num;

    public Child(int num) {
        this.num = num;
    }

}
class Main {
    public static void main(String[] args) {
        Child child = new Child(123);
    }
}
