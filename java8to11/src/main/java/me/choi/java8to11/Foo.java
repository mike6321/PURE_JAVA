package me.choi.java8to11;

import java.util.function.*;

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
        RunSomething runSomething1 = new RunSomething() {
            @Override
            public int doIt(int number) {
                return 0;
            }
        };


//        RunSomething runSomething2 = () -> {
//            System.out.println("Hello!");
//            System.out.println("Lamda");
//        };

        RunSomething runSomething3 = (number) -> {
            return number+10;
        };


//        System.out.println(runSomething3.doIt(5));
//        System.out.println(runSomething3.doIt(5));
//        System.out.println(runSomething3.doIt(5));
//        System.out.println(runSomething3.doIt(5));

        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(10));

        System.out.println();
        System.out.println("Function");

        Function<Integer, Integer> plus5 = (i) -> i+5;
        Function<Integer, Integer> multiply2 = (i) -> i*2;

        Function<Integer, Integer> multiply2AndPlus5 = plus5.compose(multiply2);
        System.out.println(multiply2AndPlus5.apply(2));

        Function<Integer, Integer> plus5AndMultiply2 = plus5.andThen(multiply2);
        System.out.println(plus5AndMultiply2.apply(5));


        System.out.println();
        System.out.println("Consumer");

        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(3);


        System.out.println();
        System.out.println("Supplier");

        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());


        System.out.println();
        System.out.println("Predicate");
        Predicate<String> startsWithJunwoo = (s) -> s.startsWith("junwoo");
        Predicate<Integer> isEven = (i) -> i%2 == 0;

        System.out.println(startsWithJunwoo.test("djflkjflkdf"));;
        System.out.println(startsWithJunwoo.test("junwoo"));

        UnaryOperator<Integer> plus11 = (i) -> i+11;


    }
}
