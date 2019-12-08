package me.choi.chapter01;

public interface AfterJava8CouldStaticMethodImpl {

    static AfterJava8CouldStaticMethodImpl execute(int a, int b){

        return  new Child();
    }
    public static  int testMethod() {
        return 0;
    }
}
