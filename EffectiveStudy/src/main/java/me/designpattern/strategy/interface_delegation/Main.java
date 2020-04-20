package me.designpattern.strategy.interface_delegation;

public class Main {
    public static void main(String[] args) {
        Ainterface ainterface = new AinterfaceImpl();

        ainterface.funA();

        Aobj aobj = new Aobj();
        aobj.funcAA();
    }
}
