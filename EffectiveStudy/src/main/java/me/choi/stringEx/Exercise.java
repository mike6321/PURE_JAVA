package me.choi.stringEx;

import java.util.ArrayList;
import java.util.List;

public class Exercise {

    int[] array = new int[10];

    public static void main(String[] args) {

        int[] array = new int[10];

        //값을 할당
        array[0] = 3;
        array[9] = 12;


        int cnt = 0;
        while (cnt < 10) {

            if (array[cnt] == 12) {
                System.out.println("값을 출력!!!");
            }

            cnt++;
        }



//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 12) {
//                System.out.println(i);
//
//            } else if (array[i] == 3) {
//                System.out.println(i);
//
//            }
//
////            } else {
////                System.out.println(i);
////            }
//        }


    }
}
