package me.choi.chapter61;

import java.util.List;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/16
 * Time : 2:01 오후
 */
public class Unbelievable {
    static Integer i;

    public static void main(String[] args) {
//        if (i == 42)
//            System.out.println("what!!!");

        long sum = 0L;
        int max = Integer.MAX_VALUE;

        for(long i=0 ; i < max ; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }
}

