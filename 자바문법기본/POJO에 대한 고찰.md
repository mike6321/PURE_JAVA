## POJO란?

POJO (Plain Old Java Object) 는 "평범한 구식 자바 객체" 를 의미한다.

------



## POJO의 역사적 배경

마틴 파울러가 2000년 가을 컨퍼런스의 발표를 준비하며 처음 만들어낸 용어

> 왜 사람들은 EJB (Enterprise Java Bean) 사용하는 것 보다 단순한 자바 오브젝트에 도메인 로직을 사용하는 것이 더 많은 장점이 있는데 왜 이러한 오브젝트를 사용하지 않는 것일까?

이떄 마틴 파울러는 평범한 자바 오브젝트를 대체할 마땅한 용어가 존재하지 않아서 사용하지 않는것이라 판단하였고 해당 오브젝트에 POJO라는 이름을 붙였다.

------

## 마틴 파울러는 왜 EJB에 부정적인 견해를 던졌는가?

EJB가 무엇인지에 대한 의문에서부터 시작해보자

EJB가 등장하게된 배경은 기업에서 IT 시스템에 대한 업무 비중이 높아지면서 기본적인 JDK에 대한 기술만으로는 충족시키기 어려운 점을 보완하여 나타났다.

그 당시에도 J2EE 라는 기술이 존재하였지만 서블릿 ,  Jsp 레벨의 최소한의 서버 인터페이스만을 가지고는 복잡한 엔터프라이즈 어플리케이션을 대체하기엔 어려움이 따랐다.

* 비즈니스로직의 복잡성
* 로우레벨에 대한 고민 (멀티쓰레드, 트랜잭션처리, 리소스풀링, 보안 ...)



EJB는 이러한 문제점을 개선하기 위해 등장하였다. EJB의 모토는 아래와 같다.

"개발자들은 로우레벨에 관심을 가질 필요가 없이 오직 어플리케이션 개발에만 집중하게 도와준다. "

EJB는 독립적으로 개발한 컴포넌트들을 서버에 자유롭게 배포하고 서로 연동해 사용하게하는 컴포넌트 기반의 개발 모델을 제시할 뿐더러, 여러 대의 서버에 분산되어있는 모듈간의 리모팅 처리도 개발자들이 거의 신경쓰지 않고 개발 할 수 있게 했다. 더 나아가 벤더별로 제각각 발전시켜 혼란에 빠지기 쉬운 자바의 서버 기술을 일관성있게 구현할 수 있도록 지원하므로 특정 서버에 종속되지 않고 서버간의 이동성을 보장해준다고 약속했다.

------



## 너무 과도한 EJB

> EJB의 실패 원인은 객체지향적인 특징과 장점을 포기했다는 점에 있다.

EJB의 여러가지 문제점들이 있지만 제일 실패한 것은 객체지향적인 특징 즉 상속과 다형성을 포기했다는 점에 있다. 이로 인해서 프로그램의 수정이 어려워지고 결합도가 높고 응집도가 낮은 최악의 어플리케이션이 만들어지게된다.



그럼에도 계속 EJB를 사용하였던 이유는 마땅한 대체 자원이 없었기 때문이었다. 또한 이전에 언급하였던 개발자들은 로우레벨에 신경쓰지 않고 비즈니스로직만을 구현하면 된다 에 대한 모토를 EJB가 어느 정도는 성공하였기 때문이다.

즉 어플리케이션 개발의 복잡도를 줄여주었지만 더 많은 복잡도와 문제를 양산하였다.



결국 EJB는 성능적인 이슈, 불필요한 기술적인 복잡도에 대한 문제가 커지며 불신이 가중되었다. 이러한 까닭에 마틴 파울러는 이전의 POJO로 퓨어한 자바로 돌아가자 라고 한것이다.

하지만 이전으로 돌아가자는 것은 로우레벨을 다루는 것으로 돌아가자라는 말과 같기 떄문에 적절한 또다른 대안이 나와야했다.



------

## 스프링 프레임워크의 등장



POJO를 이용한 어플리케이션 개발이 가진 특징과 장점을 살리면서 EJB가 제공하였던 엔터프라이즈 서비스와 기술을 그대로 사용할 수 있는 POJO 프레임워크가 등장하였다. (스프링, 하이버네이트)



스프링 프레임워크는 POJO 프레임 워크 중 하나이며 자바 어플리케이션 개발을 위한 structure를 제공하는 자바 플랫폼이다. 스프링을 사용하면 POJO 기반의 어플리케이션을 만들 수 있고 로우레벨에 대한 서버스를 비침투적으로 POJO에 적용할 수 있다.



### Annotation-based Container Configuration의 등장 

#### 어노테이션 기반 Configuration이 등장하면서 어느 사람들은 더 이상 어노테이션 기반의 클래스는 POJO가 아니라는 사람들이 등장하였다. 



이런말이 나오는 배경에 대해서 어느정도 이해가 간다. 어노테이션을 사용하면 스프링이 제공하는 라이브러리를 자바 코드에서 사용한다는 것인데 이는 스프링 프레임워크에 종속적인 클래스가 작성될 여지가 높기 때문이다.

> Are annotations better than XML for configuring Spring?
>
> The introduction of annotation-based configuration raised the question of whether this approach is “better” than XML. The short answer is “it depends.” The long answer is that each approach has its pros and cons, and, usually, it is up to the developer to decide which strategy suits them better. Due to the way they are defined, annotations provide a lot of context in their declaration, leading to shorter and more concise configuration. However, XML excels at wiring up components without touching their source code or recompiling them. Some developers prefer having the wiring close to the source while others argue that annotated classes are no longer POJOs and, furthermore, that the configuration becomes decentralized and harder to control.
>
> No matter the choice, Spring can accommodate both styles and even mix them together. It is worth pointing out that through its [JavaConfig](https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-java) option, Spring lets annotations be used in a non-invasive way, without touching the target components source code and that, in terms of tooling, all configuration styles are supported by the [Spring Tools for Eclipse](https://spring.io/tools).

스프링은 위와 같이 xml 기반의 Configuration과 어노테이션 기반의 Configuration을 적절히 사용할것을 권장하고 있다.

------

## POJO를 정리

- 특정 규약(contract)에 종속되지 않는다. (Java 언어와 꼭 필요한 API 외에 종속되지 않는다.)
- 특정 환경에 종속되지 않는다.
- 객체지향원리에 충실해야 한다.

## POJO를 사용하는 이유

- 코드의 간결함 (비즈니스 로직과 특정 환경/low 레벨 종속적인 코드를 분리하므로 단순하다.)
- 자동화 테스트에 유리 (환경 종속적인 코드는 자동화 테스트가 어렵지만, POJO는 테스트가 매우 유연하다.
- 객체지향적 설계의 자유로운 사용











