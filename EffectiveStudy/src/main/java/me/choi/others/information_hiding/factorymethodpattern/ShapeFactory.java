package me.choi.others.information_hiding.factorymethodpattern;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/04/17
 * Time : 12:16 오전
 */
public class ShapeFactory {
    public Shape createRectangle() {
        return new Rectangle();
    }

    public Shape createCircle() {
        return new Circle();
    }
}
