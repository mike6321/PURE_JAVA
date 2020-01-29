# **HashMap과 HashTable의 차이**

## **특징**

- HashMap은 보조 해시 함수를 사용

- HashTable은 보조 해시 함수를 사용하지 않는다.

- 이로인해 HashMap은 해시 충돌이 덜 발생한다.

- HashTable은 동기화를 제공하지만 HashMap은 동기화를 제공하지 않는다. -> ConcurrentHashMap

- HashTable은 null을 허용하지 않지만 HashMap은 null을 허용한다.

  

  그러면 HashTable을 사용하는 것은 의미가 없나?
  jre 1.0, jre1.1 환경을 대상으로 구현한 어플리케이션을 위해 존재
  (하위 호환의 문제)
  associate array : 키와 값의 쌍의 개수에 따라 동적으로 크기가 증가하거나 
  감소하는 배열
  ex) dictionary, map, symbol table
  순서가 보장되어지지 않는다.

버킷 : 각 해시 테이블의 엔트리 - 하나의 버킷에는 여러개의 key value(slot)가 존재
슬롯 : 버킷 내부의 key value pair가 저장될 수 있는 단위
충돌 : 다른 내용의 데이터가 같은 키를 갖는 경우 (ex 같은 사람이 같은 생일을 갖는 경우에 해당)
오버플로우 : 식별자가 모든 슬롯이 꽉 찬 버킷에 매핑될 경우

------

## 완전 해시 함수 

어떠한 동일하지 않은 객체 X, Y 가 있다고 가정하자

이때 객체를 비교하였을때 X.equals(Y)는 false를 리턴할 것이다. 더불어 X.hashcode() != Y.hashcode() 또한

false를 리턴한다면 이를 완전한 해쉬함수라고 부른다.

Ex) Integer, Long, Double - 객체가 나타내는 값 자체를 hash값으로 사용가능 하기 때문에 완전해쉬함수 가능

<u>하지만 완전한 해시함수를 제작하는 것은 사실상 불가능</u>

Why? 

hashCode() 의 리턴 값은 int이다.

int는 32비트 이며 비교하는 객체가 int가 아니라면 더 많은 규칙 혹은 경우의 수를 가질 수 있으므로 같은 다른 결과 값이 같은 

해시 값을 참조 할 수 밖에 없다.  (int의 생성가능 객체수 2^32)

시간복잡도 O(1) 불가능 - 하나의 해시 값에 하나의 Value는 불가능하다

또한 hashMap이 2의 32승만큼의 배열을 가지고 있을 수는 없다.

------

## HashMap의 해시 함수 사용 법

```java
    static final int hash(Object key) {
        int h;
        return key == null ? 0 : (h = key.hashCode()) ^ h >>> 16;
    }
```



```java
int index = X.hashCode() % M; 
```

위에서 언급하였듯 너무많은 HashMap 배열을 사용하면 안되니 정수의 범위보다 작은 M으로 나눈 값을 index로 사용한다.

- 1/M 확률로 같은 해시 버킷을 사용할 가능성이 생긴다.

이렇게 해시 충돌이 발생하더라도 key-value를 잘 저장하고 조회할 수 있도록 하는 방식 두가지

Open Addressing , Separate Chaining



#### Open Addressing 

데이터를 삽입하려는 해시 버킷이 이미 사용중인경우 다른 해시 버킷에 해당 데이터를 삽입하는 경우

#### Separate Chaining (HashMap에서 사용하는 방법)

같은 인덱스를 가지는 경우 LinkedList로 해당 데이터를 연결한다. 이때 인덱스의 값은 LinkedList의 head 이다.

![image](https://user-images.githubusercontent.com/33277588/73369645-47126f80-42f6-11ea-9ef0-62f45e75bc3b.png)



HashMap에서 **Separate Chaining**을 사용하는 이유는 remove가 빈번하게 사용되기 떄문이다.

Open Addressing은 remove의 사용이 어렵고 Separate Chaining은 remove의 사용이 쉽기 때문이다. (링크 참조)

------

## JAVA7 HashMap 과 JAVA8 HashMap의 차이

#### **알고리즘**

JAVA7에서의 기본 알고리즘은 LinkedList이다. - N/M (균등 분포임을 가정)

JAVA8에서의 기본 알고리즘은 LinkedList와 Tree이다. - logN/M (균등 분포임을 가정)

<u>데이터 개수가 방대할 수록 LinkedList가 유리하다.</u>

~~~java
static final int TREEIFY_THRESHOLD = 8;

static final int UNTREEIFY_THRESHOLD = 6;  
~~~

8일때는 Tree를 사용하고 6일때는 LinkedList를 사용한다. 

굳이 차이를 2를 두는 이유는 만약 1이라고 가정한다면 key-value가 반복되어 삭제 되는 경우를 대비해서 성능저하를 막기위해서이다.



#### **클래스**

JAVA7 - Entry

JAVA8 - Node

자바8이  Node를 사용하는 이유는 LinkedList 말고도 Tree를 사용할 수 있기 때문이다.

------

## 해쉬 버킷의 동적 확장

### 버킷의 개수와 성능의 상관관계

버킷의 개수가 작으면 메모리 사용을 줄일 수 있지만 해시 충돌이 일어날 가능서이 높아져 성능측면에서 좋지않다.

<u>resize 부분은 현재 13버전과 많은 차이가 있는것 같다.</u> 

<u>다음에 이 부분에 대해서 제대로 알아보도록하자</u>



일단은 버킷 개수의 기본 값은 16 이고 임계점에 이를 때마다 2배씩 증가시킨다는 점은 같다.

이때 임계점의 부분에 대해서는 8version 과 약간의 차이가 있다.

------

## 보조해쉬함수

보조 해시 함수(supplement hash function)의 목적은 '키'의 해시 값을 변형하여, 해시 충돌 가능성을 줄이는 것

```java
static final int hash(Object key) {
    int h;
    return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
}
```
상위 16비트 값을 XOR 연산하는 매우 단순한 형태의 보조 해시 함수를 사용



### 이전과 달리 단순한 형태로 변형된 이유

1. Tree가 등장함으로써 해시 충돌 시 발생할 수있는 성능 문제가 완화되었다는 점
2. <u>**현재 제공되는 hash함수가 균등분포가 잘 되게 만들어지는 경향이 있어 JAVA7에서 제공하였던 보조해쉬함수는 영향력이 그닥 크지 않다는 점이다.**</u>

------

### **참조**

http://jdm.kr/blog/197

https://limkydev.tistory.com/40

[https://books.google.co.kr/books?id=O6fJBAAAQBAJ&pg=PA47&lpg=PA47&dq=hashmap+big+o&source=bl&ots=YiozhYFDcF&sig=ACfU3U1sdhYCb4BaH91XNW9lXUZrRQpqVA&hl=ko&sa=X&ved=2ahUKEwilkeLU76PnAhVU_GEKHT-lCkM4ChDoATABegQIChAB#v=onepage&q=hashmap%20big%20o&f=false](https://books.google.co.kr/books?id=O6fJBAAAQBAJ&pg=PA47&lpg=PA47&dq=hashmap+big+o&source=bl&ots=YiozhYFDcF&sig=ACfU3U1sdhYCb4BaH91XNW9lXUZrRQpqVA&hl=ko&sa=X&ved=2ahUKEwilkeLU76PnAhVU_GEKHT-lCkM4ChDoATABegQIChAB#v=onepage&q=hashmap big o&f=false)

https://preamtree.tistory.com/20

Open Addressing 

https://m.blog.naver.com/PostView.nhn?blogId=wpdls6012&logNo=220482453361&proxyReferer=https%3A%2F%2Fwww.google.com%2F

Open Addressing  remove

https://bcho.tistory.com/1072