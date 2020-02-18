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
        Study study = new Study(-10);

        assertAll(
                () -> assertNotNull(study),
                () -> assertEquals(study.getStatus(), StudyStatus.DRAFT, "초기값은 DRAFT 여야한다."),
                () -> assertTrue(study.getLimit() > 0, () -> "스터디 정원은 0 명보다 커야한다.")
        );
    }
}