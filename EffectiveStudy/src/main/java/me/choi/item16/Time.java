package me.choi.item16;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/20
 * Time : 11:39 오후
 */
public class Time {
    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTES_PER_HOUR = 60;

    public final int hour;
    public final int minutes;

    public Time(int hour, int minutes) {

        if (hour < 0 || hour >= HOURS_PER_DAY)
            throw new IllegalArgumentException("시간 : "+hour);
        if (minutes < 0 || minutes >= MINUTES_PER_HOUR)
            throw new IllegalArgumentException("분 : "+minutes);

        this.hour = hour;
        this.minutes = minutes;
    }
}
class TestTime {
    public static void main(String[] args) {
        Time time = new Time(10,50);

    }
}
