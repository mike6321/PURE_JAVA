package me.choi.chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 09/02/2020
 * Time : 10:32 오후
 */
public class equalsWithHashcode {

    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(new PhoneNumber(707,867,5309).hashCode(),"junwoo");

        Iterator iterator = m.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();

            System.out.println("key :: "+ entry.getKey());
        }

        String result = m.get(new PhoneNumber(707, 867, 5309));
        System.out.println(result);

        String result2 = m.get(1927950199);
        System.out.println(result2);
    }
}
