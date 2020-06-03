# JAVA_GRAMMER



Q1) 디폴트메서드는 하위 클래스에서 구현없이 인터페이스에 이미 구현된 것을 받아서 처리한다고 한다. 

이때 "여러클래스가 해당 메서드를 받아서 처리한다면 중복의 문제는 어떻게 해결가능한가?"

Q2) 다중상속(p298) 을 설명하는데 책에서는  "디폴트 메서드를 사용하지 않아도 다중상속을 활용할 수있다고" 나와있다.

~~~java
package java8.me;

public class Main extends SuperMan implements Interface1,Interface2{

    public static void main(String[] args) {
        Main main = new Main();
        main.SuperClass();
        main.A();
        main.B();
    }

    @Override
    public void A() {
        System.out.println("A클래스 구현");
    }

    @Override
    public void B() {
        System.out.println("B클래스 구현");

    }
}
~~~

코드를 구현 하였는데 디폴트메서드를 사용하지 않아도 다중상속을 할 수 있다는 말은 디폴트메서드는 다중상속을 지원한다는 말과 동일 하지 않은가?

내가 작성한 코드를 토대로 디폴트 메서드가 어떠한 방식으로 다중상속을 지원하는지 코드를 통해서 설명부탁한다.



------

Q1 ) reduce와  collect의 정확한 차이가 궁금합니다.(p194)

책에서는 collect메서드는 도출하려는 결과를 누적하는 컨테이너를 바꾸도록 설계된 메서드

reduce는 두 값을 하나로 도출하는 불변형 연산 

이라고 정의하였는데 이러한 설명은 저에게 와닿지가 않네요 조금더 쉬운 설명 부탁드립니다.



Q2 )  일반적인 애플리케이션에는 둘 이상의 ForkJoinPool을 사용하지 않는다고 합니다.(p241)

정확인 이유가 무엇인지 설명 부탁드립니다.

감사합니다.





최준우 드림.

------

Question)

1. 연속되었다는 것은 어떠한 것을 의미하는가?

   -> .Stream().filter() 이러한 연속적인 처리를 연속되었다고 말하는 것인가?

   

   **"연속된"**: 순차적으로 값에 접근한다는 것을 의미한다.

   내가 하고싶은 질문!

   **순차적이라는 것은 병렬처리와 거리가 있어보이는데 그렇다면 스트림은 이러한 순차적인 처리에서 어떠한 방식으로 병렬처리를 진행하는가?**(<u>parallelStream()에서만 병렬처리가 가능한가?</u>). (p 136)

   

   


