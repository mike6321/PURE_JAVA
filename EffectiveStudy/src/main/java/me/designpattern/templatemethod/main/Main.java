package me.designpattern.templatemethod.main;


import me.designpattern.templatemethod.AbstractGameConnectHelper;
import me.designpattern.templatemethod.DefaultGameConnectionHelper;

/**
 * Project : croissant
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/04/20
 * Time : 8:53 오후
 */
public class Main {
    public static void main(String[] args) {
        AbstractGameConnectHelper gameConnectHelper = new DefaultGameConnectionHelper();

        gameConnectHelper.requestConnection("아이디 암호 등 접속 정보");


    }
}
