package me.choi.chapter10;

public class EqualsEx {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println(" == 비교 :: " + (s1 == s2));
        System.out.println("equals 비교 :: " + s1.equals(s2));
        int i =3;

    }

    @Override
    public boolean equals(Object obj) {
        throw  new AssertionError(); // 호출 금지
    }
}
