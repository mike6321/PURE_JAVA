package me.designpattern.d_factorymethod;

import me.designpattern.d_factorymethod.concrete.HpCreator;
import me.designpattern.d_factorymethod.concrete.MpCreator;
import me.designpattern.d_factorymethod.framework.Item;
import me.designpattern.d_factorymethod.framework.ItemCreator;

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
