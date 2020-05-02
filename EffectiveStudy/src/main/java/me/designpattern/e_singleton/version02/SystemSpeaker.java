package me.designpattern.e_singleton.version02;

import org.w3c.dom.ls.LSOutput;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/05/02
 * Time : 5:53 오후
 */
public enum  SystemSpeaker {
    INSTANCE();

    SystemSpeaker() {

    }

    public static SystemSpeaker getInstance() {
        return INSTANCE;
    }

    public void innerMethod() {
        System.out.println("inner Singleton");
    }
}
