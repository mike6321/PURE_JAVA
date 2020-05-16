package me.designpattern.h_abstractfactory.sam;

import me.designpattern.h_abstractfactory.abst.BikeFactory;
import me.designpattern.h_abstractfactory.abst.Body;
import me.designpattern.h_abstractfactory.abst.Wheel;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:32 오후
 */
public class SamFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
