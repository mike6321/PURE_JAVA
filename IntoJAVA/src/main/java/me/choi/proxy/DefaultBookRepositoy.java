package me.choi.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:13 오후
 */
@Service
public class DefaultBookRepositoy implements BookService{
    @Autowired
    BookRepository bookRepository;

    public void rent(Book book) {
        System.out.println("rent :: " + book.getName());
    }
}
