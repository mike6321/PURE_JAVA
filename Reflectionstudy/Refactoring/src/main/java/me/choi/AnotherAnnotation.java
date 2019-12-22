package me.choi;

import java.lang.annotation.*;

//@Retention(RetentionPolicy.CLASS)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@Inherited
public @interface AnotherAnnotation {

    String name() default "choi";

    int number() default 123;


//    String value() default "choi";


}
