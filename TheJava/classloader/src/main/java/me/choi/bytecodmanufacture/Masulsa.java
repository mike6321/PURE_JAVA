package me.choi.bytecodmanufacture;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;

import java.io.File;
import java.io.IOException;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class Masulsa {

    public static void main(String[] args) throws IOException {
//        new ByteBuddy().redefine(Moja.class)
//                .method(named("PullOut")).intercept(FixedValue.value("Rabbit"))
//                .make().saveIn(new File("/Applications/개발환경/repository/PURE_JAVA/TheJava/classloader/target/classes"));

        System.out.println(new Moja().PullOut());
    }
}
