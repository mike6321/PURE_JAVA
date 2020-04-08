package me.choi.others.enumEx;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/04/08
 * Time : 9:47 오후
 */
public class Unit {
    enum Direction {EAST, SOUTH, WEST, NORTH}

    int x,y;
    Direction direction;

    void init() {
        direction = Direction.SOUTH;
    }

    public static void main(String[] args) {
        Direction[] directions = Direction.values();

        for (Direction direction : directions) {
            System.out.println(direction.ordinal());
            System.out.println(direction.name());
        }
    }

}
