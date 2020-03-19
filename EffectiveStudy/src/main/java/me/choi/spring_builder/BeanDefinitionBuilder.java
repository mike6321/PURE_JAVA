package me.choi.spring_builder;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/03/19
 * Time : 10:59 오후
 */
public class BeanDefinitionBuilder {

    public static BeanDefinitionBuilder rootBeanDefinition(Class<?> tClass) {
        BeanDefinitionBuilder builder = new BeanDefinitionBuilder();

        return builder;
    }

    public BeanDefinitionBuilder addPropertyValue(String name) {
        return this;
    }
}
