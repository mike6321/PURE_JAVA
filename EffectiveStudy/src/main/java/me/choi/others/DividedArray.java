package me.choi.others;

import me.choi.others.stringpoolintern.Executor;

import java.util.ArrayList;
import java.util.List;

public class DividedArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        Executor executor = new Executor();
        /*
        * 넣을때 execute()를 하자!
        * 예를들어서 1000건씩 끊어서  execute를 실행
        * 시작점과 끝점이 필요하다
        * 1~1000 1001~2000 2001~3000
        * */
        for (int i=0 ; i<190001 ; i++) {
            list.add(i);
        }

        int listSize = list.size();
        int cnt = 1;
        //1900000건을 돈다.

        for (int i=0 ; i<=listSize ; i++) {
            if (i == 10000*cnt) {
                subList.add(i);
                executor.excuteUpdate();
                subList.clear();

                i = 1000*cnt+1;
                cnt++;
            }
        }
    }
}
