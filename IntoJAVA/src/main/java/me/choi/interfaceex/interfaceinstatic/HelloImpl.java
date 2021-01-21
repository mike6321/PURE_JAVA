package me.choi.interfaceex.interfaceinstatic;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment : static method는 JVM의 메소드 영역이기 때문에 인스턴스로 접근할 수 없다.
 * 그렇기 떄문에 하나의 인터페이스가 static 메서드를 가지고 있는 인터페이스를 상속한다면
 * 덮어 쓰는것이 아니라 그냥 메모리 구조상 접근할 수 없는 것이다.
 * Time : 2:35 오후
 */
public class HelloImpl implements HelloInterface, StaticJoinMember {

    public static void main(String[] args) {
        HelloImpl hello = new HelloImpl();
        hello.preJoin();

        StaticJoinMember.preJoin();
    }

}
