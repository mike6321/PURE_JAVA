package me.choi.others.event;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/28
 * Time : 12:05 오전
 */
public class ContextClosedEvent extends ApplicationContextEvent{

    public ContextClosedEvent(ApplicationContext source) {
        super(source);
    }
}
