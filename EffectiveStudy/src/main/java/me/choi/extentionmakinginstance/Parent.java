package me.choi.extentionmakinginstance;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/29
 * Time : 8:00 오후
 */
public class Parent {
    private  int num;
    private  String name;

    public Parent() {
    }

    public Parent(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public Parent(int num) {
        this.num = num;
    }
}
