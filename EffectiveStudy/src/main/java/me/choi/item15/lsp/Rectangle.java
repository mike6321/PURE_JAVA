package me.choi.item15.lsp;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/20
 * Time : 8:23 오후
 */
class Rectangle {
    private  int width;
    private  int height;

    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int area () {
        return this.height * this.width;
    }
}
