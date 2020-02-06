package me.choi.chapter10;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 07/02/2020
 * Time : 12:30 오전
 */
public class Main {
    public static void main(String[] args) {
        Point point = new Point(1,2);
        ColorPrint colorPrint = new ColorPrint(1,2,Color.RED);

        boolean result = point.equals(colorPrint);
        System.out.println(result);

        boolean result2 = colorPrint.equals(point);
        System.out.println(result2);
    }
}
