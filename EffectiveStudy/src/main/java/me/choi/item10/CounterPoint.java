package me.choi.item10;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 08/02/2020
 * Time : 9:50 오후
 */
public class CounterPoint extends Point {
    private static final AtomicInteger counter =
            new AtomicInteger();

    public CounterPoint(int x, int y) {
        super(x, y);
        counter.incrementAndGet();
    }
    public static int numberCreated() { return counter.get(); }

    @Override
    public boolean equals(Object obj) {
        System.out.println("222");
        return super.equals(obj);
    }
}