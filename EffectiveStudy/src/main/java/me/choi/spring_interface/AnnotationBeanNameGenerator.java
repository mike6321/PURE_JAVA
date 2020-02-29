package me.choi.spring_interface;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/03/01
 * Time : 12:20 오전
 */
public class AnnotationBeanNameGenerator implements BeanNameGenerator{

    public static final AnnotationBeanNameGenerator INSTANCE = new AnnotationBeanNameGenerator();

    @Override
    public String generateBeanName(String definition, String registry) {
        return null;
    }
}
