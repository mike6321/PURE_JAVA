package me.choi.datastructure;

import java.util.HashSet;

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
        for (int i = 1; hashSet.size() <= 16; i+=16) {
            System.out.println(i);

//            if (i == 257) {
//                hashSet.add(i);
//                break;
//            }
            hashSet.add(i);
        }
        System.out.println(hashSet);



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
        Integer targetNum = 49;
        int hash = targetNum.hashCode();
        int mapHash = hash ^ (hash >>> 16);
        System.out.println("mapHash " + mapHash);

        int tableIndex = 15 & mapHash;
        System.out.println("tableIndex " + tableIndex);

    }
}
/**
 * return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
 * p = tab[i = (n - 1) & hash
 * */