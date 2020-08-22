package me.choi.java8to11.stream;

import java.time.Duration;

/**
 * Project : java8to11
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 3:34 오후
 */
public class Progress {

    private Duration studyDuration;

    private boolean finished;

    public Duration getStudyDuration() {
        return studyDuration;
    }

    public void setStudyDuration(Duration studyDuration) {
        this.studyDuration = studyDuration;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
