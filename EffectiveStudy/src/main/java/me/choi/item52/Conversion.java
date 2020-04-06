package me.choi.item52;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/04/07
 * Time : 12:48 오전
 */
class Conversion {
    public void method(int i) {
        System.out.println("Primitive type int :: "+ i);
    }
    public void method(Integer i) {
        System.out.println("Reference type Integer :: "+ i);
    }
    public void method(long i) {
        System.out.println("Primitive type long :: "+ i);
    }
}
class Test {
    public static void main(String[] args) {
        Conversion conversion = new Conversion();

        conversion.method(new Long(100));
    }
}