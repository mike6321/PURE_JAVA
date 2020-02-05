package me.choi.stringEx;

public class StringTest {
    final int cnt = 99999;

    public static void main(String[] args) {
        StringTest st = new StringTest();

        //System.out.println("String :: "+st.StringTest("test"));
        System.out.println("StringBuilder :: "+st.StringBuilderTest("testtest"));

        //System.out.println("StringBuffer :: "+st.StringBufferTest(null));

    }

    public  long StringTest(String str) {
        long start = System.currentTimeMillis();
        for (int i=0 ; i<cnt ;i++) {
            str += "test";
        }
        return System.currentTimeMillis() - start;
    }

    public  long StringBuilderTest(String str) {
        StringBuilder sb = new StringBuilder(3);
        System.out.println(sb.capacity());

        long start = System.currentTimeMillis();
        for (int i=0 ; i<cnt ;i++) {
            sb.append("test");
        }
        System.out.println(sb.capacity());
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
