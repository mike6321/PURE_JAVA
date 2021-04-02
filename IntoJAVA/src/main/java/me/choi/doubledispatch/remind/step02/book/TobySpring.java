package me.choi.doubledispatch.remind.step02.book;

import me.choi.doubledispatch.remind.step02.bookstore.Bandi;
import me.choi.doubledispatch.remind.step02.bookstore.Kyobo;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:05 오전
 */
public class TobySpring implements Book {
    @Override
    public void info(Bandi bandi) {
        System.out.println("Bandi에서산 토비스프링");
    }

    @Override
    public void info(Kyobo kyobo) {
        System.out.println("Kyobo에서산 토비스프링");
    }
}
