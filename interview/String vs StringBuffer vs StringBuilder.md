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



