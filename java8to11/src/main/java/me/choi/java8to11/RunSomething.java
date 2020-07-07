package me.choi.java8to11;

/**
 * Project : java8to11
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:30 오후
 */
@FunctionalInterface
public interface RunSomething {

    int doIt(int number);

    static void printName() {
        System.out.println("Junwoo");
    }

    default void printAge() {
        System.out.println("30");
    }

}
