package me.choi.interfaceex.interfaceinstatic;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:34 오후
 */
public interface HelloInterface extends StaticJoinMember{

    default void beforeHello() {
        System.out.println(HelloInterface.class + " : beforeHello");
    };

    default void afterHello() {
        System.out.println(HelloInterface.class + " : beforeHello");
    };

    default void preJoin() {
        System.out.println("pre join member");
    }

}
