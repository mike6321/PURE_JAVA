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
        ColorPrint colorPrint1 = new ColorPrint(1,2,Color.RED);
        ColorPrint colorPrint2 = new ColorPrint(1,2,Color.BLUE);

        boolean result = point.equals(colorPrint1);
        System.out.println(result);

        boolean result2 = colorPrint1.equals(colorPrint2);
        System.out.println(result2);

        boolean result3 = point.equals(colorPrint2);
        System.out.println(result2);
    }
}
