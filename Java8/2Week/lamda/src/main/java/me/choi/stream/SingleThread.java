package me.choi.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SingleThread {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동","신용권","김남준","람다식","병렬처리");
        list.stream().filter((String s) -> s.equals("람다식")).forEach(SingleThread::print);

        for(String s : list) {
            if(s.equals("람다식"))
            print(s);
        }
    }

    public static void print(String string) {
        System.out.println(string+ " : "+Thread.currentThread().getName());
    }
}
