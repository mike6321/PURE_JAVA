package org.example.a_package.a_strategypattern;

/**
 * Project : DesignPatternReview
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 11:53 오후
 */
public class Client {
    public static void main(String[] args) {
        Character character = new Character(new Sword());
        character.characterAttack();
    }
}
