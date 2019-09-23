**Question!**

**Q)<u>그렇다면 어떤 면에서 람다식이 병렬 처리에 유용하다는 것인가?</u>**

**Q)<u>인터페이스의 미완성 클래스 들은 단지 구현을 하지 않고 파라미터를 전달하는 기능만을 하는가? 아니라면 다른 용도로 사용되는 예는?</u>**

------

**람다식을 사용하지 않는 이유?**

자질구레한 코드 사용 없이 간결하게 코드를 구현할 수 있기 때문.

![IMG_74FBD0FF88A1-1](https://user-images.githubusercontent.com/33277588/65416778-8f46f000-de33-11e9-845c-1cf816c915e8.jpeg)



Like Comparator 객체

![IMG_AAE8B03C7011-1](https://user-images.githubusercontent.com/33277588/65416932-ddf48a00-de33-11e9-9f8e-995da338257f.jpeg)



**람다의 구조**

1. 파라미터 리스트 :  Comparator의 compare 메서드의 파라미터 (두 개의 사과)
2. 화살표 : 화살표는 람다의 파라미터 리스트와 바디를 구분
3. 람다의 바디 : 두 사과의 무개를 비교. return 값에 해당



함수형 인터페이스 : 정확히 하나의 **인터페이스**를 지정하는 메서드

함수형 인터페이스로 무엇을 할 수 있나?

* 람다표현식으로 추상메서드 구현을 **직접 전달** 가능 -> 전체 표현식을 함수형 인터페이스의 **인스턴스**로 취급

![IMG_1CAD0E66F5DC-1](https://user-images.githubusercontent.com/33277588/65417406-edc09e00-de34-11e9-8f85-130d55a3e5a6.jpeg)





**함수 디스크립터** : 

일종의 설계도를 의미. 

함수형 인터페이스의 람다표현식의 시그니처를 서술하는 메서드를 의미.



**실행 어라운드 패턴** : 준비 , 정리 가 실행할 작업을 감싸는 형태

![IMG_3851517341E1-1](https://user-images.githubusercontent.com/33277588/65417557-4a23bd80-de35-11e9-92e9-59a008e10dd8.jpeg)

**람다식으로 바꿔나가는 4가지 과정**



![IMG_EEFD2CF150D5-1](https://user-images.githubusercontent.com/33277588/65417660-86efb480-de35-11e9-84b8-45050fc0019e.jpeg)

* 위의 코드는 현재 한개의 행밖에 읽어올 수 없다.



1. 동작 파라미터화 : <u>한번에 여러줄 or 자주 사용되는 단어를 반환하려면 ?</u>  -> processFile을 메서드로 동작을 전달!

![IMG_B982C3586733-1](https://user-images.githubusercontent.com/33277588/65417847-01b8cf80-de36-11e9-8d1e-c163091d3595.jpeg)

* 두 개의 행 읽기 가능!



2. 함수형 인터페이스를 이용해서 동적 전달 : 함수형 인터페이스 자리에 람다 사용

BufferedReader -> String , 예외를 던지는 설계를 가진 함수형 인터페이스를 따로 만든다.



![IMG_13E0C32CA1F5-1](https://user-images.githubusercontent.com/33277588/65418474-7b9d8880-de37-11e9-9a7f-afa56ebae1cd.jpeg)



3. 동적실행 : 함수형 인터페이스에 정의된 코드와 동일한 방식으로 처리(구럼 프로세스의 구현은 언제하는거야?)

![IMG_DDBDA93FBE07-1](https://user-images.githubusercontent.com/33277588/65418685-f4044980-de37-11e9-8d4f-c904f87402af.jpeg)



4. 람다적용

![IMG_E359289B416D-1](https://user-images.githubusercontent.com/33277588/65419159-0763e480-de39-11e9-8146-97669827b7cd.jpeg)





예시 한개만더 !!

~~~ java
@FunctionalInterface
interface Say{
    int someting(int a,int b);
}  //설계도 느낌

class Person{
    public void hi(Say line) {
	int number = line.someting(3,4);
	System.out.println("Number is "+number);
    }
}
~~~

~~~java
/*람다식 사용하지 않음*/
Person rin = new Person();
rin.hi(new Say() {
    public int someting(int a, int b) {
	System.out.println("My Name is Coding-Factory");
	System.out.println("Nice to meet you");
	System.out.println("parameter number is "+a+","+b);
	return 7;
    }
});
~~~

~~~java
/*람다식 사용*/
Person rin = new Person();
rin.hi((a,b) ->{
	System.out.println("This is Coding-Factory!");
	System.out.println("Tank you Lamda");
	System.out.println("parameter number is "+a+","+b);
    return 7;
});
~~~



Q)그렇다면 어떤 면에서 람다식이 병렬 처리에 유용하다는 것인가?

Q)인터페이스의 미완성 클래스 들은 단지 구현을 하지 않고 파라미터를 전달하는 기능만을 하는가? 아니라면 다른 용도로 사용되는 예는?



------

**함수형 인터페이스의 사용** 

줄곧 말하지만 함수형 인터페이스는 오직 하나의 **추상메서드** 만을 갖는다.

함수형 인터페이스 내부의 추상메서드는 :   **"함수 디스크립터"** 라고 불리운다.



1. predicate  [**test**]

   형식 : (T ) -> boolean

![IMG_BC51C8F7AA12-1](https://user-images.githubusercontent.com/33277588/65419913-b654f000-de3a-11e9-9af6-7b19175dce51.jpeg)



2. Consumer [**accept**]

형식 : (T ) -> void : <u>T 형식의 객체를 인수로 받아 어떠한 처리를 하고 싶을때 사용</u>



![IMG_0E6EFD8F6CDC-1](https://user-images.githubusercontent.com/33277588/65420001-f9af5e80-de3a-11e9-84d1-228abd82056d.jpeg)



3. funtion

   형식 : (T ) -> R

![IMG_C01EA54102E8-1](https://user-images.githubusercontent.com/33277588/65420079-38451900-de3b-11e9-8b58-bada7d92bbaf.jpeg)





**기본형에 특화**

: 예를 들어 제네릭을 받을땐 참조형(Object, List, Integer, Byte) 밖에 구조상 받을 수 없다.

* 따라서 오토 박싱을 하게 되는데 이는 너무 많은 비용이 든다.



오토박싱을 하지않고 캐스팅을 하는 함수형 인터페이스가 자바8에는 존재한다.



![IMG_42A839A549C7-1](https://user-images.githubusercontent.com/33277588/65420226-92de7500-de3b-11e9-939e-872cfe8c285f.jpeg)



------

**람다, 함수형 인터페이스의 예외 사용 밥법 두 가지**



1. 인터페이스에 예외를 직접 정의

![IMG_DAA48E676BF2-1](https://user-images.githubusercontent.com/33277588/65420354-e3ee6900-de3b-11e9-8201-8f030ba20ad0.jpeg)

2. 람다에 try catch 로 예외를 정의

![IMG_8AF4E13C51F0-1](https://user-images.githubusercontent.com/33277588/65420390-fbc5ed00-de3b-11e9-9170-215e187f0a2a.jpeg)





**형식검사, 형식추론, 제약**

<u>람다는 어떤 함수형 인터페이스의 메서드를 구현하는지 알 방법이없다.</u>



1. **형식검사** : 람다가 사용하는 context를 이용해서 람다의 형식을 알수 있다.

![IMG_5239B67B532A-1](https://user-images.githubusercontent.com/33277588/65420541-5f501a80-de3c-11e9-8300-5cf62c9d4c9a.jpeg)



2. **같은 람다 다른 함수형 인터페이스**

<u>: 같은 람다라도 다른 함수형 인터페이스의 추상메서드를 사용할 수 있다.</u>



![IMG_AB57D8CDFDC0-1](https://user-images.githubusercontent.com/33277588/65420646-ab02c400-de3c-11e9-99d7-7d461474fa31.jpeg)



* 특별한 void 호환 규칙 : 람다의 바디에 일반 표현식이 존재하면 함수형 인터페이스의 리턴값이 달라도 가능!(return void 만 가능!)



3. **형식 추론 :**

<u>단순히 말하자면 람다식에 타입을 제외하고 변수만 선언할 수 있다는 말.</u>

![IMG_AF02E31684FC-1](https://user-images.githubusercontent.com/33277588/65420772-f4531380-de3c-11e9-9821-b1c228355f3a.jpeg)





4. 지역변수 사용가능 :

<u>전달받은 파라미터 뿐만아니라 지역변수도 사용가능 하지만 지역변수는 final(상수) 의 역할을 가진 변수만이 적용 가능 하다.</u>



* 이유는 인스턴스 변수는 힙에 저장되어 객체가 소멸하는 순간까지 이어지지만 지역변수는 스택에 저장되어 변수의 사용이 달라지거나 끝나면 해당 변수를 람다가 참조 할 수없기 때문이다.



------



**메서드 레퍼런스**



메서드 레퍼런스를 사용하는 이유는?

만약 람다가 메서드 호출을 명령한다면 어떤 메서드를 호출할 것인지에 대한 설명보단! 

메서드명을 직접 참조하는 것이 **가독성**에 좋기때문이다.



**활용법** : " :: " 



~~~java
(Apple a) -> a.getWeight()
  
Apple :: getWeight
~~~

![IMG_3E6F028F92F9-1](https://user-images.githubusercontent.com/33277588/65421882-dcc95a00-de3f-11e9-8c95-196f9914afe5.jpeg)





**메서드 레퍼런스를 만드는 방법 세 가지**

1. **정적 메서드 레퍼런스**

Ex) Integer의 parseInt 메서드의 표현 : **Integer :: parseInt**

2. **다양한 형식의 인스턴스 메서드 레퍼런스**

Ex) String :: length

3. **기존 객체의 인스턴스 메서드 레퍼런트**

* 외부객체의 메서드를 호출 시

~~~java
( ) -> expensiveTransaction.getValue()
  
  //expensiveTransaction : Transaction 객체를 할당받은 참조변수
expensiveTransaction :: getValue
~~~

------



**특별한 형식의 메서드 레퍼런스**

ex) 대소문자 구분없이 리스트를 정렬하는 코드

![IMG_96EE6E42DBEB-1](https://user-images.githubusercontent.com/33277588/65422204-c5d73780-de40-11e9-9620-86934e28c843.jpeg)





**람다표현식을 레퍼런스로 바꾸는 세가지 방식**

![IMG_6F6C26C04B8B-1](https://user-images.githubusercontent.com/33277588/65422344-236b8400-de41-11e9-99ca-40387ffb5cd5.jpeg)

------



**생성자 레퍼런스**

1. Supplier() 에 ( ) -> Apple 시그니처가 있다고 가정

![IMG_B21322876A04-1](https://user-images.githubusercontent.com/33277588/65422427-66c5f280-de41-11e9-8f1f-209a06fdc133.jpeg)



2. Function에 ( ) -> Apple (int weight )

![IMG_D72F31B5E984-1](https://user-images.githubusercontent.com/33277588/65422487-8fe68300-de41-11e9-9fa6-448a6549022f.jpeg)



3. Bifunction (  ) -> Apple (String color, int weight )

![IMG_2341D4685B54-1](https://user-images.githubusercontent.com/33277588/65422566-cfad6a80-de41-11e9-8d36-cd68c8643890.jpeg)





------

**활용방법**

1. **메서드로 묶은 코드 전달**

![IMG_C553E2EE1849-1](https://user-images.githubusercontent.com/33277588/65422682-29ae3000-de42-11e9-83f1-2cf333547969.jpeg)



* sort에 정렬 전략을 전달.

2. **익명클래스** 

   <u>: 한 번만 쓸 코드를 굳이 클래스로 만들지 말고 익명클래스로 생성</u>

![IMG_484799209A29-1](https://user-images.githubusercontent.com/33277588/65422761-55311a80-de42-11e9-9992-23e41c8ae824.jpeg)



3. **람다 표현식 사용**

1. ![IMG_3AB8C7B56004-1](https://user-images.githubusercontent.com/33277588/65422831-8873a980-de42-11e9-90f7-4e163d9acec4.jpeg)

2. Apple 타입일 제외하고 간략하게 표현할 수 있다.





