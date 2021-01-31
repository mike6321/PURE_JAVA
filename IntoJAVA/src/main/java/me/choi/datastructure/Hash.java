package me.choi.datastructure;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 6:20 오후
 */
public class Hash {
    public static void main(String[] args) {
        Integer targetNum =  -1;
        int hash = targetNum.hashCode();
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(hash >>> 16);
        int mapHash = hash ^ (hash >>> 16);
        System.out.println(mapHash);
        int tableIndex = 15 & mapHash;

        System.out.println("tableIndex " + tableIndex);
    }
}
