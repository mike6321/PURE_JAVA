package me.choi.item03.version03;

import java.io.Serializable;

public class Elvis3 implements Serializable {

    private static Elvis3 INSTANCE = new Elvis3();
    private String name = "choi";
    private int age = 29;

    private static long serialVersionUID = 9083057440306700412L;

    private Elvis3() {

    };

    public static Elvis3 getInstance() {
        return INSTANCE;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}
