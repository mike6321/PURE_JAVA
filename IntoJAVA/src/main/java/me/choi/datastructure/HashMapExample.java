package me.choi.datastructure;

import java.util.HashMap;
import java.util.Map;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 12:13 오전
 */
public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(2, 2);
    }
}
