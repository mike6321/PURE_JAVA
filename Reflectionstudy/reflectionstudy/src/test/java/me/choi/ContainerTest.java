package me.choi;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerTest {

    @Test
    public void test() {
        StudyService studyService = Container.getObject(StudyService.class);
        assertNotNull(studyService);
    }
    @Test
    public void test2() {
        StudyService studyService = Container.getObjectRepository(StudyService.class);
        assertNotNull(studyService.studyRepository);
    }
}