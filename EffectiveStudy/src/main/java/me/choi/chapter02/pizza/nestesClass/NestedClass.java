package me.choi.chapter02.pizza.nestesClass;

public class NestedClass {

     static class NestedInnerClass{
        public NestedInnerClass() {
        }
        public void display() {
            System.out.println("nestedInnerclass");
        }
    }
}

class test{
    public static void main(String[] args) {
        NestedClass.NestedInnerClass nest = new NestedClass.NestedInnerClass();
        nest.display();
    }
}
