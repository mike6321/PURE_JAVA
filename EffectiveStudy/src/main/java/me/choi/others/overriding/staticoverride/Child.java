package me.choi.others.overriding.staticoverride;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/04/15
 * Time : 9:16 오후
 */
public class Child extends Parent{

    @Override
    public void House() {
        System.out.println("(자식) 집 입니다...");
    }

    public static void Money() {
        System.out.println("(자식) 돈 입니다.");
    }
}
