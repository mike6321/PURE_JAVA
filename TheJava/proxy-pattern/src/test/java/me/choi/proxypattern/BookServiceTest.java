package me.choi.proxypattern;

import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

public class BookServiceTest {

    MethodInterceptor handler = new MethodInterceptor() {
        BookService bookService = new BookService();

        @Override
        public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
            System.out.println("aaaa");
            System.out.println("");
            System.out.println(method);
            System.out.println(args);
            System.out.println("");
            Object invoke = method.invoke(bookService, args);
            System.out.println("bbbb");

            return invoke;
        }
    };

    @Test
    public void di() {


        BookService bookService = (BookService) Enhancer.create(BookService.class, handler);

        Book book = new Book();
        book.setTitle("Toby Spring");
        bookService.rent(book);

        System.out.println();

        //bookService.returnBook(book);

    }

}