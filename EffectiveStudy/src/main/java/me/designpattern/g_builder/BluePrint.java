package me.designpattern.g_builder;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:03 오후
 */
public abstract class BluePrint {
    abstract public void setCpu();
    abstract public void setRam();
    abstract public void setStorate();

    abstract public Computer getComputer();

}
