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
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudyTest {

    int val = 1;

    @Test
    @Order(2)
    void taggingTest() {
        Study study = new Study(val++);
        System.out.println("taggingTest1");
        System.out.println(val);
    }
    @Test
    @Order(1)
    void taggingTest2() {
        Study study = new Study(val++);
        System.out.println("taggingTest2");
        System.out.println(val);
    }

    // TODO:  junwoochoi 2020/02/18 9:57 오후
    // static이 필요없다...
    @BeforeAll
    public void BeforeAll() {
        System.out.println("BeforeAll");
    }
}