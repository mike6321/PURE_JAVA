package me.choi.inflearnthejavatest;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @FastTest
    @DisplayName("주누의 개인공부 시간 fast")
    //@Tag("fast")
    void create_new_study() {
        //assumeTrue("LOCAL".equals(System.getenv("TEST_ENV")));
        Study study = new Study(10);
    }
    @SlowTest
    @DisplayName("주누의 개인공부 시간 slow")
    //@Tag("slow")
    public void tesing_intelij() {
        System.out.println("test!");
    }

    @Test
    //@Disabled
    void create2() {
        System.out.println("create2");
    }



    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("BeforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("AfterEach");
    }

}