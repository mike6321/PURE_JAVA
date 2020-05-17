package me.choi.others.memory;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 12:19 오전
 */
public class Main4 {
    public static void main(String[] args) {
        Integer i = 10;
        System.out.println(i);
        plusInteger(i);
        System.out.println(i);
    }

    private static void plusInteger(Integer i) {
        i+=10;
    }
}
