package me.choi.spring_staticblock;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/28
 * Time : 12:18 오전
 */
public class GenericApplicationContext<T> {
    static {
        System.out.println("GenericApplicationContext...");
    }

    public GenericApplicationContext(Class<T> ... componentClass) {

    }
}
