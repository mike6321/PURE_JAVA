package me.oop.book.chapter02.src.main.java.org.eternity.movie.step02;

import org.eternity.money.Money;
import org.eternity.movie.step02.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
