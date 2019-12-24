package me.choi.proxypattern;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.InvocationHandlerAdapter;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static net.bytebuddy.matcher.ElementMatchers.named;
import static org.junit.Assert.*;


public class BookServiceTest {



    @Test
    public void di() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

    Class<? extends BookService> proxyClass = new ByteBuddy().subclass(BookService.class)

            .method(named("rent")).intercept(InvocationHandlerAdapter.of(new InvocationHandler() {
                BookService bookService = new BookService();

                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                    System.out.println("aaaaa");
                    Object invoke = method.invoke(bookService,args);
                    System.out.println("bbbbb");

                    return invoke;
                }
            }))

            .make().load(BookService.class.getClassLoader()).getLoaded();
        BookService bookService = proxyClass.getConstructor(null).newInstance();


        Book book = new Book();
        book.setTitle("Toby Spring");

        bookService.rent(book);
        bookService.returnBook(book);

    }

}