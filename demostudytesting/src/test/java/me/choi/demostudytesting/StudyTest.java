package me.choi.demostudytesting;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project : demostudytesting
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/18
 * Time : 8:16 오후
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @Test
    @DisplayName("Assertion Test")
    public void study() {
        Study study = new Study();
        StudyStatus status = study.getStatus();
        //assertNotNull(status);
        assertEquals(status,StudyStatus.DRAFT,"초기값 DRAFT");
    }
}