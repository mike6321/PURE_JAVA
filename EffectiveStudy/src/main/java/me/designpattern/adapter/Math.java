package me.designpattern.adapter;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/04/21
 * Time : 9:47 오후
 */
public class Math {
    /*Double*/
    public  static double twoTime(double num) {
        return num*2;
    }
    /*Half*/
    public static double half(double num) {
        return num/2;
    }

    /*추가된 알고리즘*/
    public static Double doubled(Double d) {
        return d*2;
    }
}
