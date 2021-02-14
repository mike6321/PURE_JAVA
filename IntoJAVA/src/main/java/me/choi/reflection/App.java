package me.choi.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:14 오전
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO: 1. 클래스타입의 인스턴스 가져오기
        Class<Book> bookClass = Book.class;

        // TODO: 2. 인스턴스로부터 가져오기
        Book book = new Book();
        Class<? extends Book> aClass = book.getClass();

        // TODO: 3. 풀패키기 경로로 가져오기
        /**
         * public java.lang.String me.choi.reflection.Book.d
         * public java.lang.String me.choi.reflection.Book.e
         * */
        Class<?> aClass1 = Class.forName("me.choi.reflection.Book");

        Arrays.stream(bookClass.getFields()).forEach(System.out::println);

        // TODO: 모든필드 가져오기 2021/02/14 6:27 오후
        /**
         * public java.lang.String me.choi.reflection.Book.d
         * public java.lang.String me.choi.reflection.Book.e
         * private java.lang.String me.choi.reflection.Book.a null
         * private static java.lang.String me.choi.reflection.Book.B BOOK
         * private static final java.lang.String me.choi.reflection.Book.c BOOK
         * public java.lang.String me.choi.reflection.Book.d d
         * public java.lang.String me.choi.reflection.Book.e e
         * */
        Arrays.stream(bookClass.getDeclaredFields()).forEach(f -> {
            try {
                f.setAccessible(true);
                System.out.printf("%s %s\n", f, f.get(book));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
        System.out.println();

        // TODO: junwoochoi 2021/02/14 6:32 오후
        /**
         * h
         * g
         * wait
         * wait
         * wait
         * equals
         * toString
         * hashCode
         * getClass
         * notify
         * notifyAll
         * */
        Arrays.stream(bookClass.getMethods()).forEach(m -> {
            m.setAccessible(true);
            System.out.println(m.getName());
        });
        System.out.println();

        // TODO: 생성자 가져오기 2021/02/14 6:37 오후
        /**
         * public me.choi.reflection.Book()
         * public me.choi.reflection.Book(java.lang.String,java.lang.String,java.lang.String)
         * */
        Arrays.stream(bookClass.getDeclaredConstructors()).forEach(c -> {
            c.setAccessible(true);
            System.out.println(c);
        });
        System.out.println();

        // TODO: 부모클래스 가져오기 2021/02/14 6:37 오후
        /**
         * class java.lang.Object
         * */
        System.out.println(bookClass.getSuperclass());
        
        // TODO: 인터페이스 가져오기 2021/02/14 6:39 오후 
        /**
         * class java.lang.Object
         * interface me.choi.reflection.MyInterface
         * */
        Arrays.stream(bookClass.getInterfaces()).forEach(i -> {
            System.out.println(i);
        });
        System.out.println();

        // TODO: 접근제어자 확인 2021/02/14 6:42 오후
        /**
         * private java.lang.String me.choi.reflection.Book.a
         * false
         * true
         * false
         * private static java.lang.String me.choi.reflection.Book.B
         * false
         * true
         * true
         * private static final java.lang.String me.choi.reflection.Book.c
         * false
         * true
         * true
         * public java.lang.String me.choi.reflection.Book.d
         * true
         * false
         * false
         * public java.lang.String me.choi.reflection.Book.e
         * true
         * false
         * false
         * */
        Arrays.stream(bookClass.getDeclaredFields()).forEach(f -> {
            f.setAccessible(true);
            int modifiers = f.getModifiers();

            System.out.println(f);
            System.out.println(Modifier.isPublic(modifiers));
            System.out.println(Modifier.isPrivate(modifiers));
            System.out.println(Modifier.isStatic(modifiers));
        });
        System.out.println();

    }
}
