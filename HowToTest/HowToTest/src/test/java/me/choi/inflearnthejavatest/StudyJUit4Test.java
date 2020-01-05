package me.choi.inflearnthejavatest;

import org.junit.Before;
import org.junit.Test;

public class StudyJUit4Test {
    @Before
    public void Before() {
        System.out.println("before");
    }
    @Test
    public void createTest() {
        System.out.println("test");
    }
}
