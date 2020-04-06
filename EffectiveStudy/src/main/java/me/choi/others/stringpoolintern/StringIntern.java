package me.choi.others.stringpoolintern;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/04/02
 * Time : 12:43 오전
 */
public class StringIntern {

    String str = "junwoo";

    public static void main(String[] args) {
        for (int i=0 ; i<1000000 ; i++) {
            String str =  "junwoo";
        }
    }
}
