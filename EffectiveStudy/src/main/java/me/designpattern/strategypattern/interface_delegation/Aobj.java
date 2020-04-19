package me.designpattern.strategypattern.interface_delegation;

public class Aobj {

    Ainterface ainterface;

    public Aobj() {
        this.ainterface = new AinterfaceImpl();
    }

    public void funcAA() {
        ainterface.funA();
        ainterface.funA();
//        System.out.println("AAA");
//        System.out.println("AAA");

    }
}
