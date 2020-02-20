package me.choi.item16;

import java.awt.*;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/20
 * Time : 11:31 오후
 */
public class Point {
//    public double x;
//    public double y;
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
class main {
    public static void main(String[] args) {
        Point point = new Point();
//        point.x = 13;
        point.setX(13);
//        Dimension

    }
}
