package me.oop.book.chapter08.src.main.java.org.eternity.movie.pricing;

import org.eternity.movie.DiscountCondition;
import org.eternity.movie.Screening;

public class SequenceCondition implements DiscountCondition {
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
