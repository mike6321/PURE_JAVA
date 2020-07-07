package me.choi.java8to11;

/**
 * Project : java8to11
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:35 오후
 */
public class Foo {

    public static void main(String[] args) {

        // 익명 내부 클래스
//        RunSomething runSomething = () -> {
//            System.out.println("Hello!");
//            System.out.println("Lamda");
//        };

        RunSomething runSomething = (number) -> {
            return number+10;
        };


        System.out.println(runSomething.doIt(5));
        System.out.println(runSomething.doIt(5));
        System.out.println(runSomething.doIt(5));
        System.out.println(runSomething.doIt(5));

    }
}
