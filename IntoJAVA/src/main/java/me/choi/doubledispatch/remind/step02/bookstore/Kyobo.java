package me.choi.doubledispatch.remind.step02.bookstore;

import me.choi.doubledispatch.remind.step02.book.Book;
import me.choi.doubledispatch.remind.step02.book.EffectiveJava;
import me.choi.doubledispatch.remind.step02.book.TobySpring;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:05 오전
 */
public class Kyobo implements BookStore {

    @Override
    public void dispatch(Book book) {
        book.info(this);
    }
}
