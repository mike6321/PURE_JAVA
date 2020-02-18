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
class StudyTest {

    @Test
    public void init() {
        Study study = new Study();
        assertNotNull(study);
        System.out.println("getting started");
    }

    @Test
    public void init2() {
        Study study = new Study();
        assertNotNull(study);
        System.out.println("getting started2");
    }

    @BeforeEach
    public  void BeforeEach() {
        System.out.println("before each");
    }
    @BeforeAll
    public static void BeforeAll() {
        System.out.println("before all");
    }
    @AfterAll
    public static void AfterAll() {
        System.out.println("afterall");
    }
    @AfterEach
    public  void AfterEach() {
        System.out.println("aftereach");
    }
}