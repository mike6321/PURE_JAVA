package me.choi.others.finalex;

import java.util.ArrayList;
import java.util.List;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/28
 * Time : 12:28 오전
 */
public class FinalWithDefaultConstructor {

    private  List<String> list = new ArrayList<>();

    public FinalWithDefaultConstructor() {
    }
}
class Main{
    public static void main(String[] args) {
        FinalWithDefaultConstructor fdc = new FinalWithDefaultConstructor();
    }
}
