package me.choi.doubledispatch.remind.step01;

import me.choi.doubledispatch.remind.step01.book.Book;
import me.choi.doubledispatch.remind.step01.book.EffectiveJava;
import me.choi.doubledispatch.remind.step01.book.TobySpring;
import me.choi.doubledispatch.remind.step01.bookstore.Bandi;
import me.choi.doubledispatch.remind.step01.bookstore.BookStore;
import me.choi.doubledispatch.remind.step01.bookstore.Kyobo;

import java.util.Arrays;
import java.util.List;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:06 오전
 */
public class App {
    public static void main(String[] args) {
        List<BookStore> bookStores = Arrays.asList(new Bandi(), new Kyobo());
        List<Book> books = Arrays.asList(new EffectiveJava(), new TobySpring());

        // TODO: 컴파일 오류 발생 2021/04/03 2:11 오전
//        bookStores.forEach(bs -> {
//            books.forEach(b -> {
//                bs.info(b);
//            });
//        });
        
        // TODO: if문 추가 및 타입 캐스팅 방법 2021/04/03 2:14 오전
        bookStores.forEach(bs -> {
            books.forEach(b -> {
                if (b instanceof TobySpring) {
                    bs.info((TobySpring) b);
                }
                if (b instanceof EffectiveJava) {
                    bs.info((EffectiveJava) b);
                }
            });
        });


    }
}
