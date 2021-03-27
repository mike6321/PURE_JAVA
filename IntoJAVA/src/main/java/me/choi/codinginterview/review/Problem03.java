package me.choi.codinginterview.review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:13 오후
 */
public class Problem03 {
    public static void main(String[] args) {
        List<Integer> start_time = Arrays.asList(1, 3, 3, 5, 7);
        List<Integer> running_time = Arrays.asList(2, 2, 1, 2, 1);
        int solution = Problem03.solution(start_time, running_time);

        System.out.println(solution);
    }


    public static int solution(List<Integer> start_time, List<Integer> running_time) {
        // Write your code here
        List<Time> timeList = new ArrayList<>();

        for (int i = 0; i < start_time.size(); i++) {
            timeList.add(new Time(start_time.get(i), start_time.get(i) + running_time.get(i)));
        }

        System.out.println(timeList.size());

        int totalCount = 0;
        int endTime = 0;
        int startTime = 0;
        for (Time time : timeList) {
            int nowStartTime = time.getStartTime();
            int nowEndTime = time.getEndTime();
            if (startTime < nowStartTime && endTime < nowEndTime) {
                totalCount++;
                startTime = nowStartTime;
                endTime = nowStartTime;
            } else if (startTime == nowStartTime) {
                continue;
            }
        }


        return totalCount;
    }
}
class Time {
    private final int startTime;
    private final int endTime;

    public Time(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }
}
