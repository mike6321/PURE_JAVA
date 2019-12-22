package me.choi;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException {
        //방법1
        Class<Book> bookClass = Book.class;
        //System.out.println(bookClass);
        //방법2
        Book book = new Book();
        Class<? extends Book> bookClass1 = book.getClass();
        //System.out.println(bookClass1);

        //Arrays.stream(bookClass.getFields()).forEach(System.out::println);
        //Arrays.stream(bookClass.getDeclaredFields()).forEach(System.out::println);

//        Arrays.stream(bookClass.getDeclaredFields()).forEach(f -> {
////            try {
////                f.setAccessible(true);
////                System.out.printf("%s %s \n", f, f.get(book));
////            } catch (IllegalAccessException e) {
////                e.printStackTrace();
////            }
////        });



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

//        Arrays.stream(Book.class.getDeclaredFields()).forEach(field -> {
////            Arrays.stream(field.getAnnotations()).forEach(System.out::println);
//            Arrays.stream(field.getAnnotations()).forEach(a ->{
//                if (a instanceof MyAnnotation) {
//                    MyAnnotation myAnnotation = (MyAnnotation) a;
//                    System.out.println(myAnnotation.value());
//                    System.out.println(myAnnotation);
//                }
//            });
//        });



//     Arrays.stream(bookClass.getDeclaredConstructors()).forEach(System.out::println);
//
//        Arrays.stream(MyBook.class.getInterfaces()).forEach(System.out::println);
//
//        Arrays.stream(bookClass.getDeclaredFields()).forEach(f ->{
//            int modifier = f.getModifiers();
//            System.out.println(Modifier.isPublic(modifier));
//            System.out.println(Modifier.isPrivate(modifier));
//            System.out.println(Modifier.isStatic(modifier));
//            System.out.println(Modifier.isAbstract(modifier));
//
//            f.getDeclaredAnnotations();
//
//        });

//        Arrays.stream(bookClass.getMethods()).forEach(f -> {
//            int modifier = f.getModifiers();
//            System.out.println(Modifier.isPublic(modifier));
//            System.out.println(f.getReturnType());
//        });
//    Arrays.stream(MyBook.class.getDeclaredAnnotations()).forEach(System.out::println);

    Arrays.stream(bookClass.getAnnotations()).forEach(f -> {
        if(f instanceof MyAnnotation) {
            MyAnnotation myAnnotation = (MyAnnotation) f;
            System.out.println(myAnnotation.value());
            System.out.println(myAnnotation.number());
        }
    });
    }
}
