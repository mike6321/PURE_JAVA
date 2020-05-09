package me.oop.book.appendixA.src.main.java.org.eternity.billing;

import org.eternity.money.Money;

import java.util.List;

public interface RatePolicy {
	Money calculateFee(List<Call> calls);
}
