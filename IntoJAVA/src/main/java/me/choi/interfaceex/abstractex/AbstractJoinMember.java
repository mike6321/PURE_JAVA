package me.choi.interfaceex.abstractex;

import me.choi.interfaceex.interfaceinstatic.HelloInterface;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment : 인터페이스가 아직 추상클래스만 할 수 있는 모든것을 담지는 못하였다.
 * 가령 상태값을 private 으로 저장할 수 가 없다 인터페이스는
 * Time : 3:53 오후
 */
public abstract class AbstractJoinMember implements HelloInterface {

    private String message = "이런 클래스는 필요가 없나?";

    @Override
    public void preJoin() {
        this.message = message;
    }

}
