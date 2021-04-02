## 의존관계

Supplier의 변화가 Client에 영향을 주는 경우

* Client의 코드에서 Supplier 타입이 필드로 사용되는 경우
* Client의 메서드에서 Supulier 타입이 파라미터로 사용되는 경우
* Client가 Supplier로 메세지를 보내는경우

핵심 : Supplier에 코드가 변경되는경우 Client 코드에도 영향을 준다.



이때 Client는 재사용이 어려우며 컴포넌트 / 서비스가 될 수 없다.

> "컴포넌트란 이를 만든 개발자의 손이 미치지 않는 곳에서도, 아무 변경 없이, 필요에 따라 확장해서 사용될 수 있는 소프트웨어 덩어리 이다."
>
> -Martin Flowler
>
> "오브젝트 패턴은 런타임 시에 바뀔 수 있는 더 동적인 의존관계를 다룬다"
> -GOF



### Step01



아래 코드는 컴파일시점에 Service에 run() 메서드가 호출될 것을 알고 있다. - Static Dispatch

```java
public class Dispatch {

    static class Service {
        void run() {
            System.out.println("run()");
        }
    }

    public static void main(String[] args) {
        new Service().run();
    }
}
```

아래도 동일하다!  

```java
public class Dispatch {

    static class Service {
        void run() {
            System.out.println("run()");
        }
        void run(int number) {
            System.out.println("number = " + number);
        }
        void run(String msg) {
            System.out.println("msg = " + msg);
        }
    }

    public static void main(String[] args) {
        new Service().run();
        new Service().run("Dispatch");
        new Service().run("1");
    }
}
```



아래와 같이 추상 클래스에 이를 상속하는 클래스 두개가 있다고 가정하자!

그리고 추상클래스 타입 (Service) 로 해당 상속 클래스에 대한 인스턴스를 생성한다음 구현메서드를 실행한다면?

```java
public class Dispatch {

    static abstract class Service {
        abstract void run();
    }

    static class MyService1 extends Service {
        @Override
        void run() {
            System.out.println("MyService1.run");
        }
    }

    static class MyService2 extends Service {
        @Override
        void run() {
            System.out.println("MyService2.run");
        }
    }

    public static void main(String[] args) {
        Service service = new MyService1();
        service.run();
    }
}
```

 Service service = new MyService1();

여기서 컴파일 시점에는 어떤 클래스를 호출할 것인지 알 수 없다.

런타임 시점에 알 수 있다. 

이를 "Dynamic Dispatch" 라고 한다.

이는 receiver parameter를 받기 때문에 가능하다 (this)



아래와 같이 루프를 돌면 receiver parameter에 따라서 해당 메서드를 사용할 수 있다.

```java
List<Service> services = Arrays.asList(new MyService1(), new MyService2());
services.forEach(s -> s.run());
```



## Double Dispatch

![image](https://user-images.githubusercontent.com/33277588/113426454-72b74b00-940e-11eb-9df4-16edcf058c9e.png)



위와같이
Post를 구현하는 Text, Picture가 있고
Snsf를 구현하는 Facebook, Twitter가 있다고 가정하자



아래와 같이 2중 포문을 돌면서 각각의 리스트를 출력해준다.
(이때 postOn 메서드의 파라미터 타입은 런타임 시점에 결정된다.)

```java
List<Post> posts = Arrays.asList(new Text(), new Picture());
List<Sns> snsList = Arrays.asList(new Facebook(), new Twitter());

posts.forEach(p -> snsList.forEach(p::postOn));
```



이를 각각의 비즈니스로직을 분리하여서 작성해보자

```java
static class Text implements Post {
  @Override
  public void postOn(Sns sns) {

    if (sns instanceof Facebook) {
      System.out.println("Text - Facebook");
    }
    if (sns instanceof Twitter) {
      System.out.println("Text - Twitter");
    }
  }
}

static class Picture implements Post {
  @Override
  public void postOn(Sns sns) {

    if (sns instanceof Facebook) {
      System.out.println("Picture - Facebook");
    }
    if (sns instanceof Twitter) {
      System.out.println("Picture - Twitter");
    }
  }
}
```

Problem

* 만약 Instagram을 추가한다면 Instagram에 해당하는 if문이 없으니 실행이 안된다.
* 대상 구현클래스를 추가할때마다 if 문을 추가해야하기 때문에 if문 누락 시 장애가 발생할 수 있다.





------

## References

토비의 봄 TV 1회 - 재사용성과 다이나믹 디스패치, 더블 디스패치

https://www.youtube.com/watch?v=s-tXAHub6vg