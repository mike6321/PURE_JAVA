package me.choi;

import org.junit.Assert;
import org.junit.Test;


public class MoimTest {

    @Test
    public void isFull() {
        Moim moim = new Moim();
        moim.maxAttendees = 100;
        moim.numberOfEnrollment = 10;
        Assert.assertTrue(moim.isEnrollmentFull());
    }
}
