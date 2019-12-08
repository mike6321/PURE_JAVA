package me.choi.chapter02.pizza.finalwithinnerclass;

public class OuterClass {
    private final int num;


//    public OuterClass(int num) {
//        this.num = num;
//    }

    class InnerClass {
        private final int num;

        public InnerClass(int num) {
            this.num = num;
        }
    }

    public OuterClass(InnerClass innerClass) {
        this.num = innerClass.num;
    }
}
