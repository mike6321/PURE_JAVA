package me.choi.others.finalex;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/21
 * Time : 12:53 오전
 */
public class StaticFinalExample {
    //private static final int var;
    private final int var;

    public StaticFinalExample(int var) {
        this.var = var;
    }
}
class main {
    public static void main(String[] args) {
        StaticFinalExample staticFinalExample = new StaticFinalExample(13);
    }
}
