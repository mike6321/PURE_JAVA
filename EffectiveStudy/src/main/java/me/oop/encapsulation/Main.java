package me.oop.encapsulation;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/05/02
 * Time : 11:02 오후
 */
public class Main {
    public static void main(String[] args) {
        Rental rental = new Rental(new Movie(1), 2);

        int frequentRenterPoints = rental.getFrequentRenterPoints();
        System.out.println(frequentRenterPoints);

    }
}
