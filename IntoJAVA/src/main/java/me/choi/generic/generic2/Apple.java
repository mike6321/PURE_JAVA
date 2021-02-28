package me.choi.generic.generic2;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:14 오후
 */
public class Apple implements Entity<Integer>{

    private Integer id;

    public static Apple of(Integer id) {
        Apple apple = new Apple();
        apple.id = id;
        return apple;
    }

    @Override
    public Integer getId() {
        return id;
    }
}
