package me.choi.staticEx;


public class Main {
    private static A a;

    public static void main(String[] args) {
        //a.NonStaticMethod();
        /*
        Exception in thread "main" java.lang.NullPointerException
        at me.choi.staticEx.Main.main(Main.java:7)
        */
        A a1 = new A();
        //a1.NonStaticMethod();
        A.StaticMethod();
       //A a2 = null;
        // a2.NonStaticMethod();


    }
}
