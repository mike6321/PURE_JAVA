package me.choi.chapter11;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 11/02/2020
 * Time : 12:53 오전
 */
public class wrapperImmutableEx {
    public static void main(String[] args) {
        Integer i = 12;
        System.out.println("input value :: "+i);
        modify(i);
        System.out.println("After modify :: "+i);
    }

    public static void modify (Integer integer) {
        integer = integer + 1;
    }
}
