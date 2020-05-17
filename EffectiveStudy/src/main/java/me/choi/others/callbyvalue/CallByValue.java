package me.choi.others.callbyvalue;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 4:31 오후
 */
public class CallByValue {
    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 5;

        swap(n1,n2);

        System.out.println(n1);
        System.out.println(n2);
    }
}
