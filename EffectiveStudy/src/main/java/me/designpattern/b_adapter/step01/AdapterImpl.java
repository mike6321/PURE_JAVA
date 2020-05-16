package me.designpattern.b_adapter.step01;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/04/21
 * Time : 9:52 오후
 */
public class AdapterImpl implements Adapter{

    @Override
    public float twiceOf(Float f) {

//        return (float) Math.twoTime(f.doubleValue());
        return Math.doubled(f.doubleValue()).floatValue();
    }

    @Override
    public float halfOf(Float f) {
        System.out.println("[Log] 절반 함수 호출");

        return (float) Math.half(f.doubleValue());
    }
}
