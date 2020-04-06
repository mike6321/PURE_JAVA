package me.choi.item52;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/04/07
 * Time : 12:48 오전
 */
class Conversion {

    public void method(Object i) {

        Byte b = (Byte) i;
        System.out.println("Reference type Integer :: "+ i);
    }

}
class Test {
    public static void main(String[] args) {
        Conversion conversion = new Conversion();

        byte val = 5;
        conversion.method(val);
    }
}