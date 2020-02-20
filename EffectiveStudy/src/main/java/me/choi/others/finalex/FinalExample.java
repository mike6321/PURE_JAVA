package me.choi.others.finalex;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/21
 * Time : 12:37 오전
 */
public class FinalExample {

    public void alterFinalVariable() {
        final int var = 3;
        //var = 5;
        final Foo foo = new Foo();

        //foo = new Foo();
        foo.setHeight(68);
        foo.setHeight(80);
    }

    public static void main(String[] args) {
        FinalExample finalExample = new FinalExample();
        finalExample.alterFinalVariable();
    }
}
