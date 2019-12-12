package me.choi;

import java.lang.annotation.*;

//@Retention(RetentionPolicy.CLASS)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@Inherited
public @interface AnotherAnnotation {

    //String name() default "choi";
//    String name();
    //int number() default 123;
//    int number();

    String value() default "choi";


}
