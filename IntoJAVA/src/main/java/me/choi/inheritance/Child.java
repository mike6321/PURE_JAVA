package me.choi.inheritance;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:47 오후
 */
public class Child extends Parent{
    void method() {
        System.out.println(Child.class.toString());
    }
}

class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.method();
    }
}
