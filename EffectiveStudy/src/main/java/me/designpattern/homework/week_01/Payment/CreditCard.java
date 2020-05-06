package me.designpattern.homework.week_01.Payment;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/05/06
 * Time : 9:55 오후
 */
public class CreditCard implements StrategyPayment{
    @Override
    public void Payment() {
        System.out.println("신용카드 결제");
    }
}
