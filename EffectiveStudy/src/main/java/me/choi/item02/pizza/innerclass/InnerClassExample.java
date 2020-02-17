package me.choi.item02.pizza.innerclass;

public class InnerClassExample {

    private InnerClass innerClass;

    public InnerClassExample() {
        System.out.println("outerclass constructor");
    }
    public void Method() {
        System.out.println("outerclass method");
    }

    //내부클래스
    public  class InnerClass {
        public  InnerClass() {
            System.out.println("innerclass constructor");
        }
        public  void InMethod() {
            System.out.println("innerclass method");
        }

    }

    public void UsingInnerClass() {
        innerClass.InMethod();
    }


    static class StaticInnerClass{

        void innerClass() {

        }

        static void innerStaticClass() {

        }
    }
}
class Main {

    public Main() {
        InnerClassExample outerclass = new InnerClassExample();
        outerclass.UsingInnerClass();


        InnerClassExample.InnerClass inner = outerclass.new InnerClass();

        //객가 생성되어야지만 호출할 수 있기 때문에체 객체 생성후 메서드를 호출한다.
        InnerClassExample.StaticInnerClass staticInnerClass = new InnerClassExample.StaticInnerClass();
        staticInnerClass.innerClass();


        //메서드가 static일 떄
        InnerClassExample.StaticInnerClass.innerStaticClass();

    }
}









