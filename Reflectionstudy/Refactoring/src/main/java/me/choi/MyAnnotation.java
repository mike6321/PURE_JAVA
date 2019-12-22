package me.choi;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})

@Inherited
public @interface MyAnnotation {

    String value();
    int number() default 29;

}
