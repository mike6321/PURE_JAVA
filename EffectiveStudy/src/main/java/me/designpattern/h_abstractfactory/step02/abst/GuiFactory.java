package me.designpattern.h_abstractfactory.step02.abst;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:43 오후
 */
public interface GuiFactory {
    public Button createButton();
    public TextArea createTextArea();
}
