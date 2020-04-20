package me.designpattern.strategy;

public class Main {
    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter();
        gameCharacter.setWeapon(new Sword());

        gameCharacter.attack();

        GameCharacter gameCharacter2 = new GameCharacter();


        gameCharacter2.attack();
    }
}
