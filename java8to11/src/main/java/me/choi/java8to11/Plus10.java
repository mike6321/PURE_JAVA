package me.choi.java8to11;

import java.util.function.Function;

/**
 * Project : java8to11
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:21 오후
 */
public class Plus10 implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer integer) {
        return integer+10;
    }
}
