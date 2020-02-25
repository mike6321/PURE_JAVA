package me.choi.sort;

import java.util.Scanner;

/**
 * Project : Algorithm
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/25
 * Time : 8:54 오후
 */
public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열을 나눕니다...");
        System.out.println("요솟수 : ");
        int nx = sc.nextInt();

        int[] array = new int[nx];

        for (int i=0 ; i<nx ; i++) {
            System.out.print("x["+i+"] = ");
            array[i] = sc.nextInt();
        }

        partition(array, nx);
    }

    private static void partition(int[] array, int length) {
        int pl = 0;
        int pr = length-1;
        int x = array[length/2];

        do {
            while (array[pl] < x) pl++;
            while (array[pr] > x) pr--;

            if (pl <= pr) {
                swap(array, pl++, pr--);
            }
        }while (pl <= pr);

        System.out.println("피벗의 값은 "+x+ " 입니다...");
    }
    static void swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}
