package me.choi.others.overriding.staticoverride;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/04/15
 * Time : 9:18 오후
 */
public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.House();
        parent.Money();


        Parent child = new Child();
        child.House();
        child.Money();


    }
}
