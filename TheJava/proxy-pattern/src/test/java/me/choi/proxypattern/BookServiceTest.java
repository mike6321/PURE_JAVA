package me.choi.proxypattern;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

public class BookServiceTest {

    //BookService bookService = new BookServiceProxy(new RealSubjectBookService());
    RealSubjectBookService bookService = (RealSubjectBookService) Proxy.newProxyInstance(BookService.class.getClassLoader(), new Class[]{RealSubjectBookService.class},
            new InvocationHandler() {
                RealSubjectBookService bookService = new RealSubjectBookService();
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if (method.getName() == "rent") {
                        System.out.println("11111");

                        Object invoke = method.invoke(bookService, args);

                        System.out.println("22222");


                        return invoke;
                    }
                    return method.invoke(bookService, args);
                }
            });

@Test
public void di() {

    Book book = new Book();
    book.setTitle("Toby Spring");
    //bookService.rent(book);

    System.out.println();

    bookService.returnBook(book);

}

}