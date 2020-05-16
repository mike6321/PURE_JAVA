package me.designpattern.b_adapter.step02;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:29 오후
 */
public class AdapterTest {
    @Test
    public void adapterTest() {

        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

        assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);

    }
}