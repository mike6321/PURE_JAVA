package me.oop.book.chapter14.src.main.java.org.eternity.billing.step01;

import org.eternity.money.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
