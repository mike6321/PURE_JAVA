package me.choi.proxypattern;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookServiceTest {

    @Test
    public void di() {
        Book book = new Book();
        book.setTitle("Toby Spring");

        BookServiceProxy bookServiceProxy = new BookServiceProxy(new RealSubjectBookService());
        bookServiceProxy.rent(book);

    }

}