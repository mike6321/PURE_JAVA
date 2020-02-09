package me.choi.chapter10;

import java.math.BigDecimal;
import java.math.BigInteger;

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

        // TODO: [main] junwoochoi 08/02/2020 7:29 오후
        // point <=> colorPrint
        boolean result = point.equals(colorPrint1);
        System.out.println(result);

        // TODO: [main] junwoochoi 08/02/2020 7:30 오후
        // colorPrint <=> point
        boolean result4 = colorPrint1.equals(point);
        System.out.println(result4);

        // TODO: [main] junwoochoi 08/02/2020 7:30 오후
        // colorPrint <=> colorPrint
        boolean result2 = colorPrint1.equals(colorPrint2);
        System.out.println(result2);

    }
}
