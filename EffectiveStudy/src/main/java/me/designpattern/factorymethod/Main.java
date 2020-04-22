package me.designpattern.factorymethod;

import me.designpattern.factorymethod.concrete.HpCreator;
import me.designpattern.factorymethod.concrete.MpCreator;
import me.designpattern.factorymethod.framework.Item;
import me.designpattern.factorymethod.framework.ItemCreator;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/04/22
 * Time : 10:55 오후
 */
public class Main {
    public static void main(String[] args) {
        Item item;
        ItemCreator itemCreator;

        itemCreator = new HpCreator();
        item = itemCreator.create();
        item.use();

        itemCreator = new MpCreator();
        item = itemCreator.create();
        item.use();

    }
}
