package me.choi.baekjun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Project : Algorithm
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/03/10
 * Time : 8:06 오후
 */
public class Ex1874 {
    private final static char[] pushPop = {'+', '-'};
    private static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i=0 ; i<n ; i++) {
            list.add(scanner.nextInt()) ;
        }

        int start = 0;
        int end = list.size();

        for (int i=start ; i<end ; i++) {

            for (int k=0 ; k<stack.size() ; k++) {
                System.out.print(stack.get(k));
            }
            System.out.println();

            // stack 초기 세팅
            if (stack.isEmpty()) {
                push(0, list.get(0), stack);
            }
            // stack의 맨처음 값이 현재 리스트의 값과 같을때
            if (stack.peek() == list.get(start)) {
                start = stack.peek()-1;

                stack.pop();
                sb.append(pushPop[1]);
            } else if (stack.peek() < list.get(start)) {
                push(start, list.get(i), stack);

                for ( int m=0 ; m< stack.size(); m++) {
                    if (stack.peek() == list.get(start)) {
                        start = stack.peek();

                        stack.pop();
                        sb.append(pushPop[1]);
                        break;
                    }
                    stack.pop();
                    sb.append(pushPop[1]);
                }
            }


//            if (stack.peek() > list.get(start)) {
//
//            }

        }

        result(sb);
    }

    private static void push (int start, int end, Stack<Integer> stack)  {
        for (int i=start+1 ; i<=end ; i++) {
            stack.push(i);
            sb.append(pushPop[0]);
        }
    }

    private static void result(StringBuffer sb) {
        for (int i=0 ; i<sb.length() ; i++)
            System.out.print(sb.charAt(i));
            System.out.println();
    }


}
