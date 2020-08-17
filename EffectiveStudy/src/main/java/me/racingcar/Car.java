package me.racingcar;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment : 자동차는 움직인다. 고로 전진하는 역할을 담당
 * Time : 12:08 오전
 */
public class Car {

    private int moveCount = 0;
    private static final int moveStandard = 4;

    public void AdvanceOneSpace(int moveCount) {

        if (moveCount > moveStandard) {
            this.moveCount += 1;
        }
    }
}
