package me.choi;

public class Test2 {

    int i = 0;
    double d;
    float f;
    static final int i2 = 2;

    public static void main(String[] args) {
        String str = "123";

        int i2 = (int) 3.2;
        Integer i = 1;
        Integer.valueOf(3);
        Integer i3 = 128;
        Integer i4 = 128;

        if(i3 == i4) {
            System.out.println("222");
        }


        Test2 test2 = new Test2();
        test2.t2();
    }

    public void t2 ()
    {
        System.out.println(i2);
    }
}
