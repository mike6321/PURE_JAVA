package me.choi.spring_interface;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/03/01
 * Time : 12:47 오전
 */
public class DefaultBeanNameGenerator implements BeanNameGenerator{
    @Override
    public String generateBeanName(String definition, String registry) {
        return "DefaultBeanNameGenerator";
    }
}
