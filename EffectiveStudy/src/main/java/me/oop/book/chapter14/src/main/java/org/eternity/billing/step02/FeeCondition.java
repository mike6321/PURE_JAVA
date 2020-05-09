package me.oop.book.chapter14.src.main.java.org.eternity.billing.step02;

import org.eternity.time.DateTimeInterval;

import java.util.List;

public interface FeeCondition {
    List<DateTimeInterval> findTimeIntervals(Call call);
}
