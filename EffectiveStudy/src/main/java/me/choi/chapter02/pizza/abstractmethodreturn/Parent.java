package me.choi.chapter02.pizza.abstractmethodreturn;

public abstract class Parent {

    public abstract static class MiniParent<T> {
        T Parent()  {
            return makingBaby();
        }

        protected abstract T makingBaby();
    }


}
