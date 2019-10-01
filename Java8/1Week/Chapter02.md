**동적 파라미터화 (유지보수에 용이)**

1. 아직 어떻게 실행될지 모르는 코드 실행 block
2. 나중에 프로그램에서 호출(like callback?)

------

**[기존 방식의 문제점]**

1. **특정 색깔의 사과 필터링**

<img src="https://user-images.githubusercontent.com/33277588/64921251-f04f4200-d7fb-11e9-9987-1efb3789daf0.jpg" width="70%">

* 이 코드의 문제점 : 녹색 사과만 필터링 가능



2. **파라미터로 색깔을 받아서 필터링**

<img src="https://user-images.githubusercontent.com/33277588/64921289-65227c00-d7fc-11e9-80ed-da9f35d9b5d2.jpg" width="70%">

* 이 코드의 문제점 : 중복된 코드 발생!



3. **boolean 값을 이용한 필터링**

<img src="https://user-images.githubusercontent.com/33277588/64921310-bdf21480-d7fc-11e9-98d6-db85dcf7a298.jpg" width="70%">

<img src="https://user-images.githubusercontent.com/33277588/64921313-d2361180-d7fc-11e9-97ef-d375b72af39b.jpg" width="70%">

* 이 코드의 문제점 : 만약 무게, 색깔 말고 다른 요구사항이 생긴다면 ... true false 로 구별하기 힘들어진다.

------

4. **전략 디자인 패턴을 적용**

*전략디자인 패턴이란?

캡슐화하는 알고리즘 패밀리를 정의하고 다음 런타임에 알고리즘을 선택

<img src="https://user-images.githubusercontent.com/33277588/64921364-6607dd80-d7fd-11e9-938b-59dc0339aae4.jpg" width="70%">





<img src="https://user-images.githubusercontent.com/33277588/64921363-6607dd80-d7fd-11e9-8eab-f1a19ab97eb9.jpg" width="70%">

**개선사항 :**

**Applepredicate가 다양한 동작을 수행하도록 하기 위해**

**filterApples 메서드가 Applepredicate를 받도록 설계**



<img src="https://user-images.githubusercontent.com/33277588/64921384-98193f80-d7fd-11e9-9b7e-00cc74139185.jpg" width="50%">



***결론 : Applepredicate를 상속받는 특정 객체를 filterApples 에 전달하면서***

​			***해당메서드의 실행결과를 결정짓는다.***

간단하게.. 동작 파라미터화는 **메서드를 파라미터로 넘기는 작업**이라 할 수 있음.

------

**[익명 클래스로 좀더 가독성 높은 코드를 구현해보자]**

*나의생각: 익명클래스느 한번쓰고 버릴 코드라 재사용이 힘든데 다형성 문제는 어떻게 해결할 것인가?*



* 현재 코드를 **1)익명클래스 2) 람다식** 으로 바꾸어가는 과정

<img src="https://user-images.githubusercontent.com/33277588/64921442-32798300-d7fe-11e9-86a0-6a19c11b2642.jpg" width="70%">



* 밑의 람다식을 보면 test메서드로 감쌀 필요가 없다.(이전의 File()메서드로 감싸지 않았던것과 동일한 효과)

------

**[리스트 형식으로 추상화]**

: 현재 code는 Apple만이 동작하도록 한정되어있음.



![KakaoTalk_20190915_212146358](https://user-images.githubusercontent.com/33277588/64921495-debb6980-d7fe-11e9-8489-98f7143cf2d4.jpg)