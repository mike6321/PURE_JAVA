package me.choi.inflearnthejavatest;

import org.junit.jupiter.api.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudyTest {

    int val = 1;

    @Order(2)
    @FastTest
    @DisplayName("주누의 개인공부 시간 fast")
    void create_new_study() {
        System.out.println(this);
        System.out.println(val++);
    }

    @Order(1)
    @SlowTest
    @DisplayName("주누의 개인공부 시간 slow")
    public void create_new_study2() {
        System.out.println(this);
        System.out.println(val++);
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
