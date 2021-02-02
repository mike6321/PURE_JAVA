package me.choi.datastructure;

import java.util.HashSet;
import java.util.Set;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 12:23 오전
 */
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 1; hashSet.size() <= 64; i+=16) {
            hashSet.add(i);
        }
        System.out.println(hashSet);

// 65 3

// 129 1 -> tree
// 145 8

//        String x = Integer.toBinaryString(15);
//        System.out.println(x);
//        System.out.println(-1 >>> 16);
//
//        System.out.println(65535 & -1);
//
//        System.out.println(-65536 & 15);
//        System.out.println(hashSet);
        // TODO: 2021/01/29 해시를 만들어보자
        /**
         * 1 1
         * -1 0
         * -2 1
         * -3 2
         *
         * -16 15
         * -17 0
         * -18 1
         *
         * -50 -> -34 -> -18 -> -2 -> 1 -> 17 -> 33 -> 49
         * */
        Integer targetNum =  145 + 16;
        int hash = targetNum.hashCode();
        System.out.println(Integer.toBinaryString(145));
        int mapHash = hash ^ (hash >>> 16);
        System.out.println("mapHash " + mapHash);

//        int tableIndex = 15 & mapHash;
        int tableIndex = 31 & mapHash;
        System.out.println("tableIndex " + tableIndex);



    }
}
/**
 * return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
 * p = tab[i = (n - 1) & hash
 * */