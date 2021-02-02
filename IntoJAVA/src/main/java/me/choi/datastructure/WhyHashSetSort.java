package me.choi.datastructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment : HashSet은 정렬을 지원하는 것일까?
 * Time : 7:21 오후
 */
public class WhyHashSetSort {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(2);

        hashSet.add(17);

        System.out.println(hashSet);
    }

}
