package me.designpattern.h_abstractfactory;

import me.designpattern.h_abstractfactory.abst.BikeFactory;
import me.designpattern.h_abstractfactory.abst.Body;
import me.designpattern.h_abstractfactory.abst.Wheel;
import me.designpattern.h_abstractfactory.gt.GtBikeFactory;
import me.designpattern.h_abstractfactory.sam.SamFactory;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:33 오후
 */
public class Main {
    public static void main(String[] args) {
        BikeFactory factory = new SamFactory();

        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());

        factory = new GtBikeFactory();
        Body body1 = factory.createBody();
        Wheel wheel1 = factory.createWheel();

        System.out.println(body1.getClass());
        System.out.println(wheel1.getClass());
    }
}
