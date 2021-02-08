package me.choi.datastructure;

import java.util.TreeMap;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment : TreeMap에 대해서
 * Time : 12:12 오전
 */
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        treeMap.put(1, 1);
        treeMap.put(65, 1);
        treeMap.put(129, 1);
        treeMap.put(193, 1);
        treeMap.put(257, 1);
        treeMap.put(321, 1);
        treeMap.put(385, 1);
        treeMap.put(449, 1);
        treeMap.put(513, 1);


        System.out.println(treeMap);

    }
}

//if (p.parent == null)
//        root = r;
///*부모가 왼쪽인지 오른쪽인지 판단*/
//if (parentOf(x) == leftOf(parentOf(parentOf(x)))) {
//
//}
///*삼촌과 부모가 같은 red 인지 판단*/
//Entry<K,V> y = leftOf(parentOf(parentOf(x)));
//if (colorOf(y) == RED) {
//
//}

//private void fixAfterInsertion(TreeMap.Entry<K,V> x) {
//    x.color = RED;
//    /*red-red violation 생략*/
//    root.color = BLACK;
//}