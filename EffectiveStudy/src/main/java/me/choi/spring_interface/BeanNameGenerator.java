package me.choi.spring_interface;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/03/01
 * Time : 12:18 오전
 */
public interface BeanNameGenerator {

    String generateBeanName(String definition, String registry);
}
