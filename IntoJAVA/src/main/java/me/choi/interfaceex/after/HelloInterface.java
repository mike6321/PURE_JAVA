package me.choi.interfaceex.after;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:34 오후
 */
public interface HelloInterface {
    default void beforeHello() {};

    default void afterHello() {};
}
