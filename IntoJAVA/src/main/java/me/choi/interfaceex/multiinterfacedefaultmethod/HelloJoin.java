package me.choi.interfaceex.multiinterfacedefaultmethod;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 4:21 오후
 */
public interface HelloJoin {
    default void beforeHello() {
        System.out.println("[HelloJoin] : beforeHello");
    };

    default void afterHello() {
        System.out.println("[HelloJoin] : afterHello");
    };

    default void other() {

    };


}
