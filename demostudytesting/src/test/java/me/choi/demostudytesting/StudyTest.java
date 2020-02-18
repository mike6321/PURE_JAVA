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

    @Tag("fast")
    @Test
    void taggingTest() {
        Study study = new Study(-1);
        System.out.println("fast");
    }
    @Test
    @Tag("slow")
    void taggingTest2() {
        Study study = new Study(-1);
        System.out.println("slow");
    }
}