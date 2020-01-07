package me.choi;

import java.lang.reflect.*;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        Class<?> bookClass = Class.forName("me.choi.Book");
        //bookClass.newInstance();
        Constructor<?> constructor = bookClass.getConstructor(null);
        Book book = (Book) constructor.newInstance();


        Constructor<?> constructor1 = bookClass.getConstructor(String.class);
        Book book1 = (Book) constructor1.newInstance("choijunwoo");

        Field field = bookClass.getDeclaredField("A");
        field.set(null, "choi");
        //System.out.println(field.get(null));

        //private  String B = "B";
        Field field1 = bookClass.getDeclaredField("B");
        field1.setAccessible(true);
        field1.get(book);
        //System.out.println(field1.get(book));

        field1.set(book, "I am IronMan...");
        //System.out.println(field1.get(book));


        /*method manufacturing*/
        Method method = bookClass.getDeclaredMethod("c");
        method.invoke(book);
//        Constructor<?> constructor2 = bookClass.getConstructor(String.class);

        Method method1 = bookClass.getDeclaredMethod("sum",int.class,int.class);
        int result = (int) method1.invoke(book,1,2);
        System.out.println(result);





        //방법1
//        Class<Book> bookClass = Book.class;
        //System.out.println(bookClass);
        //방법2
//        Book book = new Book();
//        Class<? extends Book> bookClass1 = book.getClass();
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

//    Arrays.stream(bookClass.getAnnotations()).forEach(f -> {
//        if(f instanceof MyAnnotation) {
//            MyAnnotation myAnnotation = (MyAnnotation) f;
//            System.out.println(myAnnotation.value());
//            System.out.println(myAnnotation.number());
//        }
//    });
    }
}
