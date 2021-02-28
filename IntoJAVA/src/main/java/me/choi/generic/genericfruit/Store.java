package me.choi.generic.genericfruit;

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
//        AppleDao appleDao = new AppleDao();
        // TODO: 제네릭 레펙토링 2021/02/28 9:55 오후
        /**
         * 이렇게 하면 Banana, Apple이 필요 없어진다.
         * */
        GenericDao<Apple, Integer> appleDao = new GenericDao<>();

        appleDao.save(Apple.of(1));
        appleDao.save(Apple.of(2));
        appleDao.save(Apple.of(3));

        List<Apple> all = appleDao.findAll();
        all.forEach(System.out::println);
    }
}
