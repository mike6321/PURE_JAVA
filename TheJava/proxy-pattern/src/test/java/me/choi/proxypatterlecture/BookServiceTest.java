package me.choi.proxypatterlecture;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project : proxy-pattern
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:27 오후
 */
public class BookServiceTest {


    BookService bookService = (BookService) Proxy.newProxyInstance(BookService.class.getClassLoader(), new Class[] {BookService.class}, new InvocationHandler() {


        BookService bookService = new BookRealSubject();

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


            if (method.getName() == "rent") {
                Log1();
                Object invoke = method.invoke(bookService, args);
                Log2();

                return invoke;
            }

            return method.invoke(bookService, args);

        }


    });



    @Test
    public void test() {

        Book book = new Book("Effective Java");

        bookService.rent(book);
        System.out.println();
        bookService.returnRent(book);
    }

    private void Log1() {
        System.out.println("#######################Log1#######################");
    }

    private void Log2() {
        System.out.println("#######################Log2#######################");
    }

}