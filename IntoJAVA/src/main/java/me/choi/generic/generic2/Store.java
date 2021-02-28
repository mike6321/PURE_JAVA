package me.choi.generic.generic2;

import java.util.List;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:22 오후
 */
public class Store {
    public static void main(String[] args) {
        AppleDao appleDao = new AppleDao();
        appleDao.save(Apple.of(1));
        appleDao.save(Apple.of(2));
        appleDao.save(Apple.of(3));

        List<Apple> all = appleDao.findAll();
        all.forEach(System.out::println);
    }
}
