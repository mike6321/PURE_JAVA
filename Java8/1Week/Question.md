1. **함수형 프로그래밍이란?**

명령형 프로그래밍 : 프로그래밍의 상태와 상태를 변경하는 문법의 관점에서 연산을 설명

선언형 프로그래밍 : 어떤 방법으로 해야하는지를 나타내기 보단 무엇과 같은지를 설명하는 방식

**"명령형 프로그래밍은 어떻게 할 것인가(How)를 표현하고, 선언형 프로그래밍은 무엇을 할 것인가(What) 표현한다."**

**어떻게** 처리할 지에 대해 명령을 통해 풀어 나아갔다면, 함수형 프로그래밍은 선언적 함수를 통해 **무엇을** 풀어나아갈지 결정하는 것이다.



```java
        List<String> myList =
                Arrays.asList("c1", "a2", "b3", "4", "5");
 
        // 기존방식
        for(int i=0; i<myList.size(); i++){
            String s = myList.get(i);
            if(s.startsWith("c")){
                System.out.println(s.toUpperCase());
            }
        }
 
        // stream API를 이용한 방식
        myList.stream()
              .filter(s -> s.startsWith("c"))
              .map(String::toUpperCase)
              .forEach(System.out::println);
```



2. **전략 디자인 패턴이란?**

쉽게 말하면... ***"전략을 쉽게 바꿀 수 있도록 도와주는 패턴."***

전략 : 어떤 목적을 달성하기 위해 일을 수행하는 방식(비즈니스, 알고리즘...)

![image](https://user-images.githubusercontent.com/33277588/65044902-c5e6bb80-d998-11e9-80ac-5eec946ac97f.png)]

![1568726200232](C:\Users\mike6\AppData\Roaming\Typora\typora-user-images\1568726200232.png)



3. **일급시민(First-class-value) 이급시민의 차이**

1급 객체 의 조건 

1) 변수나 데이터에 할당 할 수 있어야 한다.

2) 객체의 인자로 넘길 수 있어야 한다.

3) 객체의 리턴값으로 리턴 할 수 있어야 한다.

```kotlin
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val a = test
    }

    val test: () -> Unit = { println("kotlin") }
}
```

```java
public class java {
    
    public static void test(){
        sysout("java");
    }
    
    public static void main(String[] args){
        sysout("java");
        //아래코드는 불가!
        Object a = test;
    }
}
```

* 코틀린은 a에 type이 () -> Unit인 test함수 할당이 가능하지만 자바는 불가능 합니다.



4. **DefaultMethod는 diamond problem 을 어떻게 해결하는지?**

https://siyoon210.tistory.com/125

```java
interface GrandFather {
    default void myMethod(){
        System.out.println("GrandFather");
    };
}

interface FatherA extends GrandFather {
    @Override
    default void myMethod(){
        System.out.println("FatherA");
    }
}

interface FatherB extends GrandFather {
    @Override
    default void myMethod(){
        System.out.println("FatherB");
    }
}

interface Son extends FatherA, FatherB{
     //컴파일 에러 발생 
}
```

* 자바8에서는 default method가 추가되었기 때문에, 내부적으로 코드 구현이 가능합니다. 이런 경우는 마치 class 처럼 다중상속을 받을 수 없게 됩니다.
* Class의 다중 상속처럼 컴파일이 진행되지 않습니다. 다만 myMethod()를 새롭게 오버라이딩 하면 충돌을 해결 할 수 있습니다.



5. **스트림에서 고수준으로 추상화하여 일련의 스트림으로 만들어 처리할 수있다 란?**



6. **DefaultMethod와 추상클래스의 구현된 메서드와의 구별**

각자의 기능에 맞게 디폴트메서드는 인터페이스의 목적에 맞게 쓰고 추상클래스의 메서드는 추상클래스의 목적에 맞게 사용하면 될것 같다.

하지만 큰 차이는 없어 보인다.



하위 내용은 발표를 진행하면서 설명 

1. 42p 추가 설명

   

2. 43p 추가설명 (동작 파라미터로 가독성이 저하되지 않을까)