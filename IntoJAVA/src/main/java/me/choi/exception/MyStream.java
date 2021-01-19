package me.choi.exception;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 3:31 오후
 */
public class MyStream implements AutoCloseable{
    @Override
    public void close() {
        System.out.println("AutoCloseable");
    }
}
