package me.choi.interfaceex.before;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment : 인터페이스를 구현하면 구현을 원하지 않는 메서드 또한 구현해야하는데 이러한 문제점을 방지하기 위해서
 * 자바 6버전에서는 adapter 클래스를 하나 만들어서 인터페이스에 있는 모든 추상메서드를 빈 공란으로 구현한다음에
 * 해당 어댑터클래스를 상속받아 원하는 메서드만 구현하는 기법이 존재하였다.
 * Time : 2:35 오후
 */
public class HelloImpl extends HelloAdapter{
    @Override
    public void beforeHello() {
        System.out.println("사전인사");
    }
}
