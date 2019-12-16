package me.choi.inflearnthejavatest;

public class Study {
    private StudyStatus status;
    private int limit;

    public Study(int limit) {
        if (limit < 0) throw new IllegalArgumentException("학생 수가 너무 작아요");
        this.limit = limit;
    }

    public StudyStatus getStatus() {

        return this.status;
    }

    public int getLimit() {

        return limit;
    }
}
