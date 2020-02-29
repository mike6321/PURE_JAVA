package me.choi.spring_interface;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/03/01
 * Time : 12:20 오전
 */
public class AnnotatedBeanDefinitionReader {
    private BeanNameGenerator beanNameGenerator = AnnotationBeanNameGenerator.INSTANCE;

    public void doRegister() {
        this.beanNameGenerator.generateBeanName("definition","registry");
    }

}
