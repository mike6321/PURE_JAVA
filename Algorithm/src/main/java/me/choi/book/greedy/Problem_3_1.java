package me.choi.book.greedy;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 큰 수의 법칙
 * Time : 7:03 오후
 */

/*
5 8 3
2 4 6 4 6
*/
public class Problem_3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int MAX = Integer.MIN_VALUE;

        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxIndex < arr[i]) {
                maxIndex = i;
                MAX = arr[i];
            }
        }

        int SECONDMAX = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (i != maxIndex && SECONDMAX <= arr[i]) {
                SECONDMAX = arr[i];
            }
        }

        int result = 0;

        result = (((M / K) * K) * MAX) + (M % K) * SECONDMAX;
        System.out.println(result);

    }
}
