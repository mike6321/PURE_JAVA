package me.choi.reflection.annotation;

import java.lang.annotation.*;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 7:28 오후
 */
// TODO: annotaion 생성 2021/02/14 7:33 오후
/**
 * 런타임 시점에 Annotation이 생성됨을 알 수 있다.
 * javap -c -v /Applications/WorkingDirectory/repository/PURE_JAVA/IntoJAVA/target/classes/me/choi/reflection/Book.class
 *
 * RuntimeVisibleAnnotations:
 *   0: #59()
 *     me.choi.reflection.annotation.MyAnnotation
 *
 *
 * */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@Inherited
public @interface MyAnnotation {
    // TODO: Annotation - 기본 값 설정 가능 2021/02/14 7:37 오후
    String name() default "junwoo";
    int number() default 100;
    int value();
}
