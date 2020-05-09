package me.oop.book.appendixB.src.main.java.org.eternity.game;

public interface Displayable extends GameObject {
    Point getPosition();
    void update(Graphics graphics);
}
