package me.designpattern.h_abstractfactory.gt;

import me.designpattern.h_abstractfactory.abst.BikeFactory;
import me.designpattern.h_abstractfactory.abst.Body;
import me.designpattern.h_abstractfactory.abst.Wheel;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:37 오후
 */
public class GtBikeFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
