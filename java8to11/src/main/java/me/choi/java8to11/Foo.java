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
        Foo foo = new Foo();
        foo.run();
    }

    public void run() {

        int baseNumber = 10;

        /*로컬 클래스*/
        class LocalClass {
            void printBaseNumber() {
                int baseNumber = 11;
                System.out.println("Local Class : "+baseNumber);
            }
        }

        /*익명 클래스*/
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            int baseNumber = 11;
            @Override
            public void accept(Integer integer) {
                System.out.println("Anonymous Class : "+baseNumber);
            }
        };

        /*람다*/
        IntConsumer printint = (i) -> {
            System.out.println("Lamda : "+ (i+ baseNumber));
        };


        printint.accept(10);

        LocalClass localClass = new LocalClass();
        localClass.printBaseNumber();
    }
}
