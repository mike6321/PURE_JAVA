package me.choi.chapter61;

import java.util.Comparator;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/16
 * Time : 1:26 오후
 */
// 코드 61-1 잘못 구현된 비교자 - 문제를 찾아보자! (359쪽)
public class BrokenComparator {
    public static void main(String[] args) {

//        Comparator<Integer> naturalOrder =
//                (i, j) -> (i < j) ? -1 : (i == j ? 0 : 1);

        Comparator<Integer> naturalOrder = (preNum, laNum) -> {
              int i = preNum;
              int j = laNum;

              return (i < j) ? -1 : (i == j ? 0 : 1);
        };

        Integer i1 = 42;
        Integer i2 = 42;

        int result1 = naturalOrder.compare(i1, i2);
        System.out.println(result1);

        int result2 = naturalOrder.compare(new Integer(42), new Integer(42));
        System.out.println(result2);
    }
}
