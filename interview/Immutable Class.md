### **불변 클래스란?**

인스턴스의 내부 값을 수정할 수 없는 클래스를 의미한다.

불변 클래스가 가진 정보는 고정되어 객체가 파괴되는 순간까지 절대 달라지지 않는다.

ex) bInteger, String

 

### **왜 불변 클래스를 사용하는가?**

- 가변 클래스 보다 설계하고 구현하기 쉽다.
- 오류가 생길 여지가 적다.
- 안전하다.

### **불변 클래스의 다섯가지 규칙**

1. 객체의 상태를 변경하는 메서드를 제공하지 않는다.

 

2. 클래스를 확장 할 수 없도록 한다.

- 상속을 막기 때문에 하위 클래스에 나쁜의도로 객체의 상태를 변하게 만드는 사태를 막아준다.

 

3. 모든 필드르 final로 선언한다.

 

4. 모든 필드를 private으로 선언한다.

 

5. 자신 외에는 내부 가변 컴포넌트에 접근 할 수 없도록 한다.

------

복소수를 만드는 불변 클래스이다. 해당 클래스를 이용해 Immutable 클래스의 특징을 살펴보자

```java
public final class Complex {
    private final double re;
    private final double im;
    
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double realPart()      { return re; }
    public double imaginaryPart() { return im; }

    public Complex plus(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    // 코드 17-2 정적 팩터리(private 생성자와 함께 사용해야 한다.) (110-111쪽)
    public static Complex valueOf(double re, double im) {
        return new Complex(re, im);
    }

    public Complex minus(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    public Complex times(Complex c) {
        return new Complex(re * c.re - im * c.im,
                re * c.im + im * c.re);
    }

    public Complex dividedBy(Complex c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im) / tmp,
                (im * c.re - re * c.im) / tmp);
    }

    @Override public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Complex))
            return false;
        Complex c = (Complex) o;

        // == 대신 compare를 사용하는 이유는 63쪽을 확인하라.
        return Double.compare(c.re, re) == 0
                && Double.compare(c.im, im) == 0;
    }
    @Override public int hashCode() {
        return 31 * Double.hashCode(re) + Double.hashCode(im);
    }

    @Override public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}
```

 

 

**1. 인스턴스 자신은 수정하지 않고 새로운 인스턴스를 만들어 반환한다.**

```java
public class mainTest {
    public static void main(String[] args) {
        ImmutableEx im = new ImmutableEx(15,20l);

        ImmutableEx plus = im.plus(new ImmutableEx(20,30l));

        double v = plus.realPart();
        System.out.println(v);

    }
}
```

im 객체가 아규먼트로 또다른 ImmutableEx 객체를 담는 plus 메소드를 호출하면 또다른 plus라는 객체가 생성된다.

 

즉 생성된 시점의 상태를 파괴할때 까지 그대로 간직하는 것이다.

 

 

**2. Thread에 안전하다.**

 

불변객체에 대해서는 그 어떤 Thread도 다른 Thread에영향을 줄 수없다.

- 한번 만든 객체를 최대한 재활용하는 것을 추천

```java
public static final ImmutableEx ZERO = new ImmutableEx(0,0);
public static final ImmutableEx ONE = new ImmutableEx(1,0);
public static final ImmutableEx I = new ImmutableEx(0,1);
```



**3. 불변 객체끼리는 내부 데이터를 공유할 수 있다.**

 

BigInteger 클래스의 negate 메소드를 살펴보자

 

negate 메소드 : 크기가 같지만 부호는 반대인 새로운 BigInteger 인스턴스 생성

 

**배열**에 주목하자

```java
BigInteger bigInteger = new BigInteger("200");
BigInteger negate = bigInteger.negate();
System.out.println(negate);
```

 

원본 객체가 생성한 배열을 공유하는지 확인



![img](https://k.kakaocdn.net/dn/bWNYdY/btqBUUDCUfU/214uTKXl9sNtXU55eM6C2k/img.png)공유하는 배열

![img](https://k.kakaocdn.net/dn/cehqM5/btqBVNjGUVB/t2XkUKsO3FsxHqhY8KxQnK/img.png)



 

이전에 



![img](https://k.kakaocdn.net/dn/nbjmh/btqBTKO0X5H/vsxXT5kRPTOSJCkqlddbX1/img.png)



새로만든 객체와 원본객체가 같은 배열을 참조하는 것을 볼 수 있다.

------

### **불변 클래스의 단점**

**1. 값이 다르면 반드시 인스턴스를 생성한다.**

 

아주 미미한 값 (예를 들자면 1 bit) 를 바꾸더라도 값이 다르다는 이유로 인스턴스를 생성한다.

 

\2. 원하는 객체를 생성하기 까지의 단계가 많고 중간 단계에서 만들어진 객체들이 결국 버려진다면 성능상 문제가 생긴다.

 

new plus() -> new minus() -> new **result()**  : 결과 값을 도출하기 위해서 너무 많은 인스턴스 들이 생성되었다.



