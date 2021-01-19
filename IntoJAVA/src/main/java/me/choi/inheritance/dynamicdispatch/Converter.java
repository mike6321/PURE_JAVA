package me.choi.inheritance.dynamicdispatch;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 6:11 오후
 */
public class Converter {
    public Converter(Mother mother) {
        System.out.println(mother.getClass());
        mother.print();
    }
}
