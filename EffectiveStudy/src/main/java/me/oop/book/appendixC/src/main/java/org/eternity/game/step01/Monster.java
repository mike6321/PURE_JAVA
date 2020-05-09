package me.oop.book.appendixC.src.main.java.org.eternity.game.step01;

public abstract class Monster {
	private int health;
	
	public Monster(int health) {
		this.health = health;
	}
	
	abstract public String getAttack();
}

