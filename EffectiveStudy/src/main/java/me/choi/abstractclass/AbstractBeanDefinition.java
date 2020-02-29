package me.choi.abstractclass;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/29
 * Time : 8:20 오후
 */
public abstract class AbstractBeanDefinition extends BeanMetadataAttributeAccessor{
    private int num;
    private String name;

    public AbstractBeanDefinition() {
        this(0,null);
    }

    public AbstractBeanDefinition(int num, String name) {
        this.num = num;
        this.name = name;
    }
}
