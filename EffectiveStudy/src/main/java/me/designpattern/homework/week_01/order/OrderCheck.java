package me.designpattern.homework.week_01.order;

import me.designpattern.homework.week_01.LoginCheck;
import me.designpattern.homework.week_01.ShopMain;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/05/03
 * Time : 1:06 오전
 */
public abstract class OrderCheck {

    protected abstract boolean authorizationCheck(String userId);


    public boolean checkOrder(String userId) {

        // TODO: [주문서에 진입 시 로그인 상태인지 체크] junwoochoi 2020/05/06 1:49 오전
        // 주문서에 진입 시 로그인 상태인지 체크한다. checkLoginStatus() : boolean
        // Cookie 값에 로그인 한 정보가 없으면 진입불가
        if (!checkLoginStatus())
            throw new Error("로그인 정보가 없습니다.");

        if (!authorizationCheck(ShopMain.sessionId)) {
            throw new Error("권한이 없습니다...");
        }


        return true;

    }

    private boolean checkLoginStatus() {
        return LoginCheck.loginState;
    }

}
