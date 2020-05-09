package me.oop.book.appendixA.src.main.java.org.eternity.variance;

public class Customer {
    private Book book;

    public void order(BookStall bookStall) {
        this.book = bookStall.sell(new IndependentPublisher());
    }
}
