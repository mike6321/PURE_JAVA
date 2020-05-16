package me.designpattern.b_adapter.step01;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/04/21
 * Time : 9:50 오후
 */
public class Main {
    public static void main(String[] args) {

        Adapter adapter = new AdapterImpl();
        System.out.println(adapter.halfOf(100f));
        System.out.println(adapter.twiceOf(100f));

        System.out.println(adapter.halfOf(100f));
        System.out.println(adapter.halfOf(100f));
        System.out.println(adapter.halfOf(100f));
        System.out.println(adapter.halfOf(100f));
        System.out.println(adapter.halfOf(100f));
        System.out.println(adapter.halfOf(100f));
        System.out.println(adapter.halfOf(100f));
        System.out.println(adapter.halfOf(100f));
        System.out.println(adapter.halfOf(100f));



    }
}
