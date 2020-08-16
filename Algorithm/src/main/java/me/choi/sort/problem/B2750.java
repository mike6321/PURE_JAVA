package me.choi.sort.problem;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 11:46 오후
 */
public class B2750 {
    private static int MAX = Integer.MIN_VALUE;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }

    }
}
