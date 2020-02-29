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
    private AnnotationBeanNameGenerator adg;

    public void doRegister() {
        String result = this.beanNameGenerator.generateBeanName("definition", "registry");
        System.out.println(result);
        /*NPE 발생*/
        String result2 = this.adg.generateBeanName("definition", "registry");
        System.out.println(result2);
    }

    public static void main(String[] args) {
        AnnotatedBeanDefinitionReader adr = new AnnotatedBeanDefinitionReader();
        adr.doRegister();
    }

}
