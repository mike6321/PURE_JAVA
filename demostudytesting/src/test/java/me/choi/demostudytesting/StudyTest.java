package me.choi.demostudytesting;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project : demostudytesting
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/18
 * Time : 8:16 오후
 */
@ExtendWith(FindSlowTestExtention.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
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
    @SlowTest
    void taggingTest2() throws InterruptedException {
        Thread.sleep(10001L);
        Study study = new Study(val++);
        System.out.println("taggingTest2");
        System.out.println(val);
    }

}