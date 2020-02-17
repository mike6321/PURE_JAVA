package me.choi.item02.pizza.localinnerclass;

class Outer {

    int outNum = 100;
    static int sNum = 200;

    Runnable gerRunnable(int i) {

        int num = 100;
        class MyRunnerble implements Runnable {

            //num += 10;
            //i = 20;


            @Override
            public void run() {
                System.out.println(i);
                System.out.println(num);
                System.out.println(outNum);
                System.out.println(Outer.sNum);
            }
        }
        return new MyRunnerble();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Runnable runnable = outer.gerRunnable(50);

        runnable.run();
    }
}
