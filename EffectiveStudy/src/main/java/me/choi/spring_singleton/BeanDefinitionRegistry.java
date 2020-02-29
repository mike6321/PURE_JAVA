package me.choi.spring_singleton;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/29
 * Time : 10:51 오후
 */
public class BeanDefinitionRegistry {

    private AnnotatedBeanDefinitionReader annotatedBeanDefinitionReader = AnnotatedBeanDefinitionReader.INSTANCE;

    public BeanDefinitionRegistry() {
        System.out.println(annotatedBeanDefinitionReader);
        System.out.println(AnnotatedBeanDefinitionReader.INSTANCE);
        System.out.println(AnnotatedBeanDefinitionReader.INSTANCE);

    }
}
class Main {
    public static void main(String[] args) {
        BeanDefinitionRegistry bdr = new BeanDefinitionRegistry();

    }
}


