package me.choi.spring_builder;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/03/19
 * Time : 10:59 오후
 */
public class BeanDefinitionMain {
    public static void main(String[] args) {
        BeanDefinitionBuilder.rootBeanDefinition(A.class).addPropertyValue("name");
    }
    public static class A {

    }
}
