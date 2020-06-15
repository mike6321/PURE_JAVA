package org.example.a_package.a_strategypattern;

/**
 * Project : DesignPatternReview
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 11:53 오후
 */
public class Character {
    private Weapon weapon;

    public Character(Weapon weapon) {
        this.weapon = weapon;
    }

    public void characterAttack() {
        weapon.attack();
    }
}
