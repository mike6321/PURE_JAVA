## **String vs StringBuffer vs StringBuilder**



### 세개의 성능 속도를 테스트 해보자

~~~java
public class StringTest {
    final int cnt = 99999;

    public static void main(String[] args) {
        StringTest st = new StringTest();

        System.out.println("String :: "+st.StringTest("test"));
        System.out.println("StringBuilder :: "+st.StringBuilderTest("test"));
        System.out.println("StringBuffer :: "+st.StringBufferTest("test"));

    }

    public  long StringTest(String str) {
        long start = System.currentTimeMillis();
        for (int i=0 ; i<cnt ;i++) {
            str += "test";
        }
        return System.currentTimeMillis() - start;
    }
    
    public  long StringBuilderTest(String str) {
        StringBuilder sb = new StringBuilder(str);

        long start = System.currentTimeMillis();
        for (int i=0 ; i<cnt ;i++) {
            sb.append("test");
        }
        return System.currentTimeMillis() - start;
    }
    
    public long StringBufferTest(String str) {
        StringBuffer sb = new StringBuffer(str);

        long start = System.currentTimeMillis();
        for (int i=0 ; i<cnt ;i++) {
            sb.append("test");
        }
        return System.currentTimeMillis() - start;
    }

}
~~~

![image](https://user-images.githubusercontent.com/33277588/73849920-2013ea80-486e-11ea-86d0-7ec98ea68b9c.png)

String을 썻을때만 유독 시간이 많이 걸리는 것을 볼 수 있다. 이제 본격적으로 내부를 들여다보자!

------

## StringBuffer 클래스와 StringBuilder



### StringBuilder

mutable한 문자열 시퀀스이다.

동기화를 보장하지 않는다.

StringBuffer가 단일 쓰레드 환경에서 사용될 때 대안으로 사용된다.

StringBuffer가 대부분의 경우에 빠르므로 StringBuffer를 사용하는것을 추천한다.

주요작업 요소는 append, insert 이며 모든 유형의 타입을 허용하도록 오버로드된다. 

(append : StringBuilder의 마지막 index에 추가 insert : 특정 구간에 해당 문자열을 삽입)

StringBuilder는 capacity를 가진다. 다만 StringBuilder에 포함된 문자열 시퀀스의 길이가 capacity를 초과하지 않는 이상 새로운 내부 buffer를 추가할 필요는 없다. (혹여나 overflow가 발생하여도 자동적으로 capacity는 커진다.) 

![image](https://user-images.githubusercontent.com/33277588/73857654-93235e00-487a-11ea-9ff5-385b4df466b8.png)

null을 argument로 전달하는 경우 NPE가 발생한다. 즉 null을 허용하지 않는다.

------

### 다시 돌아가서 왜 String과 StringBuilder, StringBuffer의 수행시간이 크게 차이나는지 알아보자

String str = "test";

해당 라인을 실행하면 String의 객체가 생성이 된다.

String str += "test1";

String str += "test1";

따라서 계속적으로 문자열 붙이면 같은 객체를 참조하여 문자열을 붙이는 것이아닌 새로운 인스턴스가 생성되는 것이다. **<u>원래 있던 str 객체는 사라지면서**</u>

즉 100번을 붙이면 100개의 인스턴스가 생성된다.



StringBuilder 와 StringBuffer는 String과 달리 append할 시 똑같은 객체를 참조하기 떄문에 (하나의 인스턴스만을 참조) 



![image](https://user-images.githubusercontent.com/33277588/73859667-bdc2e600-487d-11ea-9b3e-f1e8e5763c36.png)

























