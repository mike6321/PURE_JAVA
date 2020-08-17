package me.choi.abstractinstance;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 12:11 오전
 */
public class Client {
    public static void main(String[] args) {
        ItemCreatorFactory itemCreator = new HpCreatorFactory();
        Item item = itemCreator.createInstance();

    }
}
