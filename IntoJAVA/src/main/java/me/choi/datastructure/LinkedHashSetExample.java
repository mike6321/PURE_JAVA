package me.choi.datastructure;


import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:54 오후
 */
public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(4);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(17);

        System.out.println(linkedHashSet);
    }
}
