package me.choi.inheritance.dynamicdispatch;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 5:59 오후
 */
public class Main {
    public static void main(String[] args) {
        Converter converter1 = new Converter(new Son());
        Converter converter2 = new Converter(new Mother());

//        Converter converter = new Converter();
//        Son switching = converter.Switching(new Son());
//        System.out.println(switching.getClass());
    }
}
