package me.choi.others.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:53 오후
 */
public class Main3 {
    public static void main(String[] args) {
        List<String> listArgument = new ArrayList<>();
        listArgument.add("zira");
        listArgument.add("github");

        print(listArgument);
    }

    private static void print(List<String> listParam) {
        String value = listParam.get(0);
        listParam.add("io");
        System.out.println(value);
    }
}
