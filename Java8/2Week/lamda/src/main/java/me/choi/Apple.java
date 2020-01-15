package me.choi;

public class Apple {
    private String color;
    private int weitght;

    public Apple(int weitght, String color) {
        this.color = color;
        this.weitght = weitght;
    }

    public int getWeitght() {
        return weitght;
    }

    public void setWeitght(int weitght) {
        this.weitght = weitght;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
