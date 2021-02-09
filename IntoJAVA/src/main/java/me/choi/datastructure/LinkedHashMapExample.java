package me.choi.datastructure;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment : {1=1, 17=1, 2=2, 3=1, 4=1}
 * Time : 12:51 오전
 */
public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, 1);
        linkedHashMap.put(2, 2);
        linkedHashMap.put(17, 1);
        linkedHashMap.put(3, 1);
        linkedHashMap.put(4, 1);

        System.out.println(linkedHashMap);



        LinkedHashMap<Integer, Integer> linkedHashMap2 = new LinkedHashMap<>();
        for (int i = 1; linkedHashMap2.size() <= 64; i+=16) {
            linkedHashMap2.put(i, i);
        }

        System.out.println(linkedHashMap2);
    }
}
