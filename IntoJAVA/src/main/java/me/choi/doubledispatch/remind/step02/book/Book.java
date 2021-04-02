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
public interface Book {
    void info(Bandi bandi);
    void info(Kyobo kyobo);
}
