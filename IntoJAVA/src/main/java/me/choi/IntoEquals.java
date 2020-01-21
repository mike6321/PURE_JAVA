package me.choi;

public class IntoEquals {

    private final static boolean compare = true;

    public static void main(String[] args) {
        boolean result = testAnd(true, 1);
        System.out.println(result);

        byte b = thirdOperation((byte) 2);
        System.out.println(b);
    }

    /*&& 둘다 참일 때 true를 반환*/
    public static boolean testAnd(boolean b, int i) {
        return b && i == 0;
    }

    /*삼항연산자*/
    public static byte thirdOperation(byte i) {
        return compare ? i : 0;
    }
}
