package me.choi.doubledispatch.remind.step02;



import me.choi.doubledispatch.remind.step02.book.Book;
import me.choi.doubledispatch.remind.step02.book.CleanCode;
import me.choi.doubledispatch.remind.step02.book.EffectiveJava;
import me.choi.doubledispatch.remind.step02.book.TobySpring;
import me.choi.doubledispatch.remind.step02.bookstore.Bandi;
import me.choi.doubledispatch.remind.step02.bookstore.BookStore;
import me.choi.doubledispatch.remind.step02.bookstore.Kyobo;

import java.util.Arrays;
import java.util.List;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:27 오전
 */
public class App {
    public static void main(String[] args) {
        List<BookStore> bookStores = Arrays.asList(new Bandi(), new Kyobo());
        List<Book> books = Arrays.asList(new EffectiveJava(), new TobySpring(), new CleanCode());

        bookStores.forEach(bs -> {
            books.forEach(b -> {
                bs.dispatch(b);
            });
        });

    }
}
