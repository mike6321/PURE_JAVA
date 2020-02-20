package me.choi.item15.lsp;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/20
 * Time : 8:26 오후
 */
public class Main {
    public static void main(String[] args) {
        boolean result1 = Main.checkArea(new Rectangle());
        boolean result2 = Main.checkArea(new Square());

        System.out.println(result1);
        System.out.println(result2);
    }
    static boolean checkArea (Rectangle rectangle) {
        rectangle.setHeight(5);
        rectangle.setWidth(4);

        System.out.println("height :: "+rectangle.getHeight());
        System.out.println("width :: "+rectangle.getWidth());

        return rectangle.area() == 20;
    }
}
