package me.designpattern.b_adapter.step02;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:27 오후
 */
public class MovableAdapterImpl implements MovableAdapter{

    private Movable luxuryCars;

    public MovableAdapterImpl(Movable luxuryCars) {
        this.luxuryCars = luxuryCars;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
