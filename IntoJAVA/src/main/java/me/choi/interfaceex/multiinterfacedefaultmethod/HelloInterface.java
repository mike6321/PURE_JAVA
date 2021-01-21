package me.choi.interfaceex.multiinterfacedefaultmethod;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment : 똑같은 디폴트메서드를 가진 인터페이스를 두개 다 implements 하면?
 * 둘다 재정의 하면되고 특정 인터페이스의 디폴트메서드를 사용하려면
 * 클래스명.super.메서드
 * 이렇게 호출하면 된다.
 * Time : 2:34 오후
 */
public interface HelloInterface {
    default void beforeHello() {
        System.out.println(HelloInterface.class + " : beforeHello");
    };

    default void afterHello() {
        System.out.println(HelloInterface.class + " : beforeHello");
    };
}
