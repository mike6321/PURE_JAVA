package me.choi.doubledispatch.remind.step01.bookstore;

import me.choi.doubledispatch.remind.step01.book.EffectiveJava;
import me.choi.doubledispatch.remind.step01.book.TobySpring;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:05 오전
 */
public class Kyobo implements BookStore{
    @Override
    public void info(TobySpring tobySpring) {
        System.out.println("Kyobo에서산 토비스프링");
    }

    @Override
    public void info(EffectiveJava effectiveJava) {
        System.out.println("Kyobo에서산 이펙티브자바");
    }
}
