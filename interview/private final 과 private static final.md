

> 문득 이런 생각이 들었다.  
> 상수를 선언할 때 우리는 거의 명시적으로 private static final을 선언한다.  
> private final로 선언하면 되지 굳이 static을 선언하는 이유가 무엇일까?

결론은 초기화한 값을 끝까지 유지하기 위해서이다. -> 값을 불변으로 만들다.

만약 private final로 선언한다면 직접 적으로 값을 참조할 수는 없지만 생성자를 통해 값을 참조할 수 있다.

하지만 private static final의 경우에는 생성자를 통해 값을 참조할 수없다. (이때 private static final 변수는 무조건 초기화돼있어야 한다.)

즉 **절대 해당 값을 바꾸지 않겠다는 표현과 유사**하다.

[https://jwdeveloper.tistory.com/163](https://jwdeveloper.tistory.com/163)

[

(JAVA) The final keyword in Java

상속은 개발자에게 코드를 재사용할 수 있는 환경을 제공하지만 개발자는 특정한 상황에서 상속의 범위를 제한할 필요가 있다. final 키워드는 바로 이러한 기능을 제공한다. Final Class final을 선언한 클래스..

jwdeveloper.tistory.com



](https://jwdeveloper.tistory.com/163)

> **private static final**을 선언한 변수를 사용하면 재할당하지 못하며,메모리에 한 번 올라가면 같은 값을 클래스 내부의 전체 필드, 메서드에서 공유한다.

> **private final**을 선언한 변수를 사용하면 재할당하지 못하며,해당 필드, 메서드 별로 호출할 때마다 새로이 값이 할당(인스턴스화)한다.

그렇다면 상수로 사용하려고 할 때, 그 값은 변하지 않을 것인데 호출할 때마다 새롭게 인스턴스 화할 필요가 없다.**한 번 메모리에 올려놓고 계속 같은 값을 가져다 쓰면 될 일이다.**

---

객체 생성 시 private final 변수는 초기화가 가능하다.

```
public class StaticFinalExample {
    private final int var;

    public StaticFinalExample(int var) {
        this.var = var;
    }
}
```

private static 은 메모리에 올라가므로 초기화를 반드시 해주어야 한다.

그러므로 아래 코드는 초기화를 하지 않았기 때문에 컴파일 오류가 발생한다.

```
public class StaticFinalExample {
    private static final int var;

    public StaticFinalExample(int var) {
        this.var = var;
    }
}
```
