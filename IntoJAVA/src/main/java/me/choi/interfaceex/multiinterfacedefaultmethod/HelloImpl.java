package me.choi.interfaceex.multiinterfacedefaultmethod;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment : 디폴
 * Time : 2:35 오후
 */
public class HelloImpl implements HelloInterface, HelloJoin{

    @Override
    public void beforeHello() {

    }

    @Override
    public void afterHello() {
        HelloInterface.super.afterHello();
    }
}
