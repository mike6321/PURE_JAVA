package me.choi.item02.pizza.generic.whyusinggeneric;

import java.util.ArrayList;
import java.util.List;

public class WhyUsingGeneric {

    public WhyUsingGeneric() {
        List list = new ArrayList();
        list.add("hi");

        String str = (String) list.get(0); //need to type casting


        List<String> list2 = new ArrayList<String>();
        list2.add("hihihi");

        String str2 = list2.get(0); //not need to type casting

    }

}
