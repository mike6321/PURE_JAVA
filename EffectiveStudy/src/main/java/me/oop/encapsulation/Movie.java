package me.oop.encapsulation;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/05/02
 * Time : 10:52 오후
 */
public class Movie {
    public static final int REUGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private final int priceCode;

    public Movie(int priceCode) {
        this.priceCode = priceCode;
    }

    public int getFrequentRenterPoints(int daysRented) {
        if (priceCode == NEW_RELEASE && daysRented > 1) {
            return 2;
        }else {
            return 1;
        }
    }
}
