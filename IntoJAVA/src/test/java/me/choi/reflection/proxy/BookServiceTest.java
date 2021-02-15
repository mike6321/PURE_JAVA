package me.choi.reflection.proxy;

import me.choi.proxy.Book;
import me.choi.proxy.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:47 오후
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceTest {

    @Autowired
    BookService bookService;

    @Test
    public void diTest() {
        // TODO: 앞뒤로 추가적인 로깅을 하고 싶다! 2021/02/14 10:10 오후
        Book book = new Book();
        book.setName("Spring in Action");
        bookService.rent(book);
    }
}
