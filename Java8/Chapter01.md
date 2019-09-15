**자바8을 사용해야하는 이유**

1. 자연어에 가까운 간단한 방식으로 코드 구현 가능
2. 병렬 실행 환경의 새롭고 단순한 방식을 지원

------

**예1. 스트림 처리**

리눅스 or 유닉스의 경우

```scala
cat file1 fil2 | tr "A-Z" "a-z" |sort| tail -2
```



* sort는 여러행의 스트림을 입력받아 병렬로 처리한다. (->여러행의 스트림을 출력)
  - cat, tr, sort, tail은 모두 병렬로서 처리된다.



이처럼 자바8의 스트림 API는 한번에 처리하던 기존방식을 탈히여 병렬로 처리하게끔 도와준다.(스레드 사용X)

------

**예2. 메세지에 코드 전달하기**

![KakaoTalk_20190915_200758769](https://user-images.githubusercontent.com/33277588/64920647-145b5500-d7f5-11e9-9291-429d9ff20571.jpg)

* sort를 처리하는 메서드를 통으로 파라미터로 전달하기

------

**예3. 간결화된 코드(like ::)**

```java
/*예시코드(파일 경로 찾기)*/
File[] hiddenFiles = new File(".").listFiles(new FileFilter(){
   public boolean accept(File file){
       return file.isHidden();
   } 
});
```

* 위의 코드는 굳이 accept 메서드로 묶어서 isHidden()의 결과를 리턴한다.(자바 8이전에는 어쩔수 없음)



*내부 소스

![KakaoTalk_20190915_200758769_04](https://user-images.githubusercontent.com/33277588/64920760-02c67d00-d7f6-11e9-93a1-203b73324858.jpg)



![KakaoTalk_20190915_200758769_05](https://user-images.githubusercontent.com/33277588/64920761-02c67d00-d7f6-11e9-9f74-c48a9abe7b3a.jpg)

->listFiles가 해당 인터페이스를 파라미터로 받기 때문에 구현이 강제되어 진다.



![KakaoTalk_20190915_200758769_06](https://user-images.githubusercontent.com/33277588/64920762-035f1380-d7f6-11e9-8a4d-a824cae21834.jpg)

-> 여기서 파라미터에 주목! 받는 파라미터의 타입이 인터페이스이다.



![KakaoTalk_20190915_200758769_03](https://user-images.githubusercontent.com/33277588/64920764-035f1380-d7f6-11e9-847b-5726cc062b31.jpg)

-> 해당 메서드의 결과를  File Class 내부에 있는 ishidden()으로 return



- **aceept로 감싸지 않고 직관적으로 표현하는 방법이 만들어짐.**

```java
File[] hiddenFiles = new File(".").listFiles(File::isHidden);
```

------

**예4. 람다의 등장**

*난 잘 모르겠다.  위에 :: 처럼 클래스를 만들어서 쓰면 되는 것 아닌가?* 



**자바8 이전 예시코드**

![KakaoTalk_20190915_200758769_09](https://user-images.githubusercontent.com/33277588/64920858-2211da00-d7f7-11e9-9afd-c4b991fdd5e3.jpg)



**자바8 예시코드**

![KakaoTalk_20190915_200758769_10](https://user-images.githubusercontent.com/33277588/64920877-4bcb0100-d7f7-11e9-94c8-0d0aa9027472.jpg)



* 하지만 이렇게 한번만 사용하고 쓸 메서드를 사용할때마다 정의하는 것이 비효율적이라고 판단.



(람다식은 위의 문제점을 개선 해줄 수 있음. - 아래코드 참조)

![KakaoTalk_20190915_200758769_11](https://user-images.githubusercontent.com/33277588/64920891-7fa62680-d7f7-11e9-86e1-f497ef9c49c8.jpg)

* 익명의 클래스로 정의

but! 람다식의 코드가 길어 진다면 이전의 방법으로 "::" 를 써서 사용하자!

------

**예5. 스트림의 등장**



**[자바 8 이전의 멀티스레드의 문제점]**



![KakaoTalk_20190915_203131917](https://user-images.githubusercontent.com/33277588/64920940-11159880-d7f8-11e9-80d2-7eb45b82b5fe.jpg)

* 스레드1이 쓰는 도중 스레드 2가 읽어버리면 예상하지 못한 값이 발생하게 된다.



**기존 자바의 문제점 두가지**

1. 컬렉션을 처리하면서 발생하는 반복적, 모호한 코드 발생
2. 멀티코어 활용의 어려움



해당 문제를 **[1. 필터링 2.추출 3. 그룹화]**  로 해결가능



**컬렉션과 스트림의 차이**

컬렉션 : 데이터를 어떻게 저장하고 접근할지에 집중

스트림 : 데이터를 어떻게 계산할지에 집중



멀티코어 활용의 어려움의 문제를 스트림이 해결가능 하다.

why?

스트림내의  요소들이 병렬로 쉽게 처리하게금 도와주기 떄문



***그럼 스트림은 어떻게 사용하는가?***

주요 흐름

**컬렉션 -> 스트림(병렬처리) -> 다시 컬렉션변환**

![KakaoTalk_20190915_200758769_16](https://user-images.githubusercontent.com/33277588/64921030-f42d9500-d7f8-11e9-8d73-c427bf679efc.jpg)

![KakaoTalk_20190915_204032476](https://user-images.githubusercontent.com/33277588/64921052-20e1ac80-d7f9-11e9-8c9f-07faced0b0d1.jpg)



------

**예6. 디폴트 메서드**

```java
List<Apple> heavyApples1 = 
    inventory.stream().filter((Apple a)->a.getWeight()>150)
    							.collect(toList());
List<Apple> heavyApples2 = 
    inventory.parallelstream().filter((Apple a)->a.getWeight()>150)
    							.collect(toList());
```



위의 코드는 자바8 이전에는 컴파일 불가 : 리스트가 stream(), parrellelStream()을 지원x

굳이 구현을 해야한다면?

1. Collection interface에 stream(), parrellelStream()을 추가
2. ArrayList에서 구현



이 방법은 새로운 메서드가 interface에 추가될때마다

해당 interface를 상속받는 모든 class는 추가된 method를 구현해야한다는 단점이 있다.

-> 클래스의 구현이 아닌 interface의 일부로 보는 **Defaultmethod** 탄생



