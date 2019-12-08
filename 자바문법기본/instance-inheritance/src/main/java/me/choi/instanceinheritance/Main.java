package me.choi.instanceinheritance;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {

//        Phone phone = new Phone(new TaxablePolicy(0.2,new RegularPolicy(Money.wons(2000),Duration.ofSeconds(20))));
        Phone phone = new Phone(new TaxablePolicy(0.05,new RateDiscountablePolicy(Money.wons(2000),
                                                                    new RegularPolicy(Money.wons(4000),Duration.ofSeconds(3)))));
        System.out.println(phone);



    //new TaxablePolicy(0.05,new RegularPolicy(Money.ZERO,1.0));
    }
}
