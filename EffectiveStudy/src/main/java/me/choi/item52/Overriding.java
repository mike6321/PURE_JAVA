package me.choi.item52;

import java.util.List;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/04/06
 * Time : 11:41 오후
 */
class Wine {
    String name() {
        return "와인";
    }
}
class SparklingWine extends Wine {
    @Override
    String name() {
        return "스파클링 와인";
    }
}
class Champagne extends SparklingWine {
    @Override
    String name() {
        return "샴페인";
    }
}
public class Overriding {
    public static void main(String[] args) {
        List<Wine> list = List.of(new Wine(), new SparklingWine(), new Champagne());

        for (Wine wine : list) {
            System.out.println(wine.name());
        }
    }
}
