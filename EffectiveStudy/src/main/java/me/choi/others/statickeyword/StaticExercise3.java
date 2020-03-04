package me.choi.others.statickeyword;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/03/04
 * Time : 8:39 오후
 */
public class StaticExercise3 {

    int localVariable = 1;

    static {
        System.out.println("Inside Static Block...!");
    }

    static int method01() {

        // TODO: [method01] junwoochoi 2020/03/04 8:42 오후
        // static 메서드에는 지역 변수, 일반 메서드 선언 및 초기화 불가
//        localVariable = 2;
//        method02();
        return 100;
    }

    private void method02() {
        System.out.println("Inside none-static Method...!");
    }

    public static void main(String[] args) {
        System.out.println(StaticExercise3.method01());
        System.out.println("Inside Main Method...!");
    }
}
