package me.oop.uiformaccessprinciple.step02;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 5:33 오후
 */
public class Rectangle {
    private int right;
    private int left;

    public Rectangle(int right, int left) {
        this.right = right;
        this.left = left;
    }

    public void Area(int addHeight) {
        this.left += addHeight;
        this.right += addHeight;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "right=" + right +
                ", left=" + left +
                '}';
    }
}
