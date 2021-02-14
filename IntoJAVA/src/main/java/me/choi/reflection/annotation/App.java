package me.choi.reflection.annotation;

import me.choi.reflection.Book;
import me.choi.reflection.MyBook;

import java.util.Arrays;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 7:42 오후
 */
// TODO: @Inherited 2021/02/14 7:43 오후
/**
 * Annotation - @Inherited
 * 부모의 어노테이션까지 가져올 수 있다.
 * @Inherited
 * public @interface MyAnnotation {
 * }
 *
 * [결과]
 * @me.choi.reflection.annotation.MyAnnotation(name="junwoo", number=100, value=31)
 * @me.choi.reflection.annotation.AnotherAnnotation(value=32)
 *
 * */
public class App {
    public static void main(String[] args) {
        Class<MyBook> myBookClass = MyBook.class;
        Arrays.stream(myBookClass.getAnnotations()).forEach(a -> {
            Class<Book> bookClass = Book.class;
            System.out.println(a);
        });
        System.out.println();

        // TODO: Annotation - Field의 관련된 어노테이션 가져오기 2021/02/14 7:51 오후
        Arrays.stream(Book.class.getDeclaredFields()).forEach(field -> {
            Arrays.stream(field.getAnnotations()).forEach(System.out::println);
        });
    }
}
