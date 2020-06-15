package org.example.a_package.a_strategypattern;

/**
 * Project : DesignPatternReview
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 11:51 오후
 */
public class Knife implements Weapon {
    @Override
    public void attack() {
        System.out.println("(Weapon) 칼 공격");
    }
}