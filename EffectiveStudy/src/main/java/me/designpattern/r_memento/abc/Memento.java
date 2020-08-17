package me.designpattern.r_memento.abc;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 11:11 오후
 */
public class Memento {

    private String state;

    protected Memento(String state) {
        this.state = state;
    }

    protected String getState() {
        return this.state;
    }
}
