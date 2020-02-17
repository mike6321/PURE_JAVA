package me.choi.item10;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 07/02/2020
 * Time : 12:08 오전
 */
public class ColorPrint extends Point{
    private final Color color;

    public ColorPrint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Point))
            return false;

        // point이면 색상을 무시하고 비교
        if (!(obj instanceof ColorPrint)) {
            return obj.equals(this);
        }
        // colorprint이면 색깔을 포함하여 비교
        return super.equals(obj) && ((ColorPrint) obj).color == color;
    }
}
