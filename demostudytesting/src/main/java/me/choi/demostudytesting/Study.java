package me.choi.demostudytesting;

/**
 * Project : demostudytesting
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/18
 * Time : 8:15 오후
 */
public class Study {
    private StudyStatus status;
    private final int limit;

    public Study(int limit) {

        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public StudyStatus getStatus() {
        return this.status;
    }

}
