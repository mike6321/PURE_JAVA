package me.choi;

import org.junit.Assert;
import org.junit.Test;


public  class BookTest {

    @Test
    public void isBook() {
        Book book = new Book();

        book.nowBookCount = 10;
        book.totalBookCount = 10;

        Assert.assertTrue(book.HowManyBook());



    }
}