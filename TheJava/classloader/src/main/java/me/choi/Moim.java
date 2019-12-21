package me.choi;

public class Moim {
    int maxAttendees;
    int numberOfEnrollment;

    public boolean isEnrollmentFull()  {
        if (maxAttendees == 0) {
            return false;
        }

        if (maxAttendees < numberOfEnrollment) {
            return false;
        }

        return true;
    }
}
