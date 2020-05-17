package me.choi.others.memory;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:49 오후
 */
public class Main {
    public static void main(String[] args) {
        int argument = 4;

        argument = someOperation(argument);
    }

    private static int someOperation(int param) {
        int tmp = param * 3;
        int result = tmp / 2;

        return result;
    }
}
