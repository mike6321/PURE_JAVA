package me.choi;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.function.BinaryOperator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException {
        Class<Book> bookClass = Book.class;
        //Arrays.stream(bookClass.getDeclaredFields()).forEach(System.out::println);
        //Arrays.stream(bookClass.getFields()).forEach(System.out::println);

//        Book book = new Book();
//        Class<? extends Book> aClass = book.getClass();
//
//        Class.forName("me.choi.Book");
        Book book = new Book();

//        Arrays.stream(bookClass.getDeclaredFields()).forEach(f -> {
//            try {
//                f.setAccessible(true);
//                System.out.printf("%s %s \n",f, f.get(book));
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//        });
//        Arrays.stream(bookClass.getMethods() ).forEach(System.out::println);
////        Arrays.stream(Book.class.getDeclaredFields()).forEach(field -> {
////            int modifiers = field.getModifiers();
////            System.out.println(field);
////            System.out.println(Modifier.isPrivate(modifiers));
////            System.out.println(Modifier.isPublic(modifiers));
////
////        });
        //두개다
        //Arrays.stream(MyBook.class.getAnnotations()).forEach(System.out::println);
        //Arrays.stream(MyBook.class.getDeclaredAnnotations()).forEach(System.out::println);

        Arrays.stream(Book.class.getDeclaredFields()).forEach(field -> {
//            Arrays.stream(field.getAnnotations()).forEach(System.out::println);
            Arrays.stream(field.getAnnotations()).forEach(a ->{
                if (a instanceof MyAnnotation) {
                    MyAnnotation myAnnotation = (MyAnnotation) a;
                    System.out.println(myAnnotation.value());
                    System.out.println(myAnnotation);
                }
            });
        });

    }
}
