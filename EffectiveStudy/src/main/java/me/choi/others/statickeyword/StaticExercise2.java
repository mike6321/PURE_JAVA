package me.choi.others.statickeyword;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/03/04
 * Time : 8:38 오후
 */
public class StaticExercise2 {

    static int var1;
    static int var2;

    static {
        var1 = 1;
        var2 = 2;
    }

    public static void main(String[] args) {
        System.out.println("var1 = "+var1);
        System.out.println("var2 = "+var2);
    }
}
