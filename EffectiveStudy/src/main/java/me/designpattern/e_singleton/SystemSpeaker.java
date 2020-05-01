package me.designpattern.e_singleton;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/04/27
 * Time : 10:58 오후
 */
public class SystemSpeaker {
    static private SystemSpeaker instance;


    private SystemSpeaker() {



    }

    public static SystemSpeaker getInstance() {
        if (instance == null) {
            instance = new SystemSpeaker();
        }
        return instance;
    }
}
