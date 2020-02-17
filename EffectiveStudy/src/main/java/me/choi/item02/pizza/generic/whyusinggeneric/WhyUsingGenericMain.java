package me.choi.item02.pizza.generic.whyusinggeneric;


import java.util.ArrayList;
import java.util.List;

public class WhyUsingGenericMain {

    public WhyUsingGenericMain() {
        WhyUsingGenericStep02 outerClass = new WhyUsingGenericStep02();
        WhyUsingGenericStep02.Shop test = outerClass.new Shop();

        WhyUsingGenericStep02.Shop2 shop2 = outerClass.new Shop2();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);


        shop2.setT("String");
        shop2.setT(1234);
        shop2.setT(list);



    }
}
