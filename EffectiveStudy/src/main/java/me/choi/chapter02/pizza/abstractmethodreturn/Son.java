package me.choi.chapter02.pizza.abstractmethodreturn;

public class Son extends Parent{
    private String name;
    private int age;

    public static class MiniSon extends MiniParent<MiniSon> {

        @Override
        protected MiniSon makingBaby() {
            return this;
        }

    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
