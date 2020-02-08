package me.choi.chapter10;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 08/02/2020
 * Time : 7:23 오후
 */
public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        boolean inParent = isInParent(child);

        System.out.println(inParent);

    }

    static boolean isInParent(Parent parent) {

        if (parent instanceof Parent) {
            return  true;
        }

        return false;
    }
}
