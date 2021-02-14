package me.choi.reflection.annotationutilizing;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:26 오후
 */
public class App {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        // TODO: 리플렉션 - 생성자를 통한 인스턴스 생성 2021/02/14 8:29 오후
        Class<Book> bookClass = Book.class;
        Constructor<Book> constructor = bookClass.getConstructor(null);
        Book book = constructor.newInstance();
        System.out.println(book);


        // TODO: 리플렉션 - 필드 값 가져오기 2021/02/14 8:32 오후
        Field a = bookClass.getDeclaredField("A");
        System.out.println(a.get(null));


        // TODO: 리플렉션 - 필드 값 변경 2021/02/14 8:33 오후
        a.set(null, "AAAA");
        System.out.println(a.get(null));


        // TODO: 리플렉션 - 타입이 인스턴스인 필드인 값을 가져오기 2021/02/14 8:38 오후
        /**
         * get(해당 클래스의 인스턴스)
         * b.get(new Book());
         * 이렇게 선언 X
         * 같은 인스턴스여야한다.
         * */
        Book sharedBook = new Book();

        Field b = bookClass.getDeclaredField("B");
        b.setAccessible(true);
        System.out.println(b.get(sharedBook));

        Field b2 = bookClass.getDeclaredField("book2");
        System.out.println(b2.get(sharedBook));

        b.set(sharedBook, "convertString");
        System.out.println(b.get(sharedBook));


        // TODO: 리플렉션 - 메서드 호출하기 2021/02/14 8:46 오후
        Method c = bookClass.getDeclaredMethod("c");
        c.setAccessible(true);
        c.invoke(sharedBook, null);


        // TODO: 리플렉션 - 리턴타입이 있는 메서드 호출하기 2021/02/14 8:49 오후
        Method sum = bookClass.getDeclaredMethod("sum", int.class, int.class);
        int invoke = (int) sum.invoke(sharedBook, 10000, 40000);
        System.out.println(invoke);
    }
}
