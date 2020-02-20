package me.choi.item15.lsp;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/20
 * Time : 8:26 오후
 */
public class Square extends Rectangle{
    private int width;
    private int height;

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }
}
