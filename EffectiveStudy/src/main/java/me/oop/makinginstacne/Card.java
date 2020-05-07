package me.oop.makinginstacne;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/05/07
 * Time : 7:41 오후
 */
public class Card {
    private final int serialNum;
    private final int year;
    private final int month;

    public Card(int serialNum, int year, int month) {
        this.serialNum = serialNum;
        this.year = year;
        this.month = month;
    }
}

class Main {
    public static void main(String[] args) {

        Card card1 = new Card(12345, 2020, 8);
        Card card2 = new Card(12346, 2021, 6);
        Card card3 = new Card(12346, 2022, 3);
    }
}



