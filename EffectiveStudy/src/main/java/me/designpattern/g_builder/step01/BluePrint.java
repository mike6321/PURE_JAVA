package me.designpattern.g_builder.step01;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:03 오후
 */
public abstract class BluePrint {
    abstract void setCpu();
    abstract void setRam();
    abstract void setStorate();
    abstract Computer getComputer();
}
