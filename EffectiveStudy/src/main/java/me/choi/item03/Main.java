package me.choi.item03;

import me.choi.item03.version01.Elvis;
import me.choi.item03.version02.Elvis2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {


        Class class1 = Class.forName("me.choi.item03.version01.Elvis");

        Constructor constructor = class1.getDeclaredConstructor();
        System.out.println(constructor);
        constructor.setAccessible(true);
        Elvis elvis = (Elvis) constructor.newInstance();

        System.out.println(elvis);

        /******************************************************************************/

        Elvis2.getInstance();


    }
}
