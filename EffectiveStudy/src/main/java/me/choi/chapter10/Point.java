package me.choi.chapter10;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 07/02/2020
 * Time : 12:01 오전
 */
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        Class<? extends Point> aClass = getClass();

        if (obj.getClass() == null || obj.getClass() != getClass())
            return  false;

        Point point = (Point) obj;

        return point.x == x && point.y == y;
    }
}
