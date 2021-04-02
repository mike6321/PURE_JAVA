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
public interface BookStore {
    void info(TobySpring tobySpring);
    void info(EffectiveJava effectiveJava);
}
