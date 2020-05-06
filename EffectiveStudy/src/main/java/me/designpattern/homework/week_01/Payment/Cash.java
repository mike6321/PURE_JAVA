package me.designpattern.homework.week_01.Payment;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/05/06
 * Time : 9:56 오후
 */
public class Cash implements StrategyPayment{
    @Override
    public void Payment() {
        System.out.println("현금 결제");
    }
}
