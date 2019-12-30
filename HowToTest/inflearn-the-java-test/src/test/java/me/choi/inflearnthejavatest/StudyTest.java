package me.choi.inflearnthejavatest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @DisplayName("스터디 만들기")
    @RepeatedTest(value = 10, name = "{displayName}, {currentRepetition} / {totalRepetitions}")
    void repeatTest(RepetitionInfo repetitionInfo) {
        System.out.println("repeate test :: "+ repetitionInfo.getCurrentRepetition() + "/"+
                repetitionInfo.getTotalRepetitions());
    }

    @DisplayName("스터디 만들기 2")
    @ParameterizedTest(name = "{index} {displayName} message = {0}")
    @ValueSource(strings = {"날씨가", "많이", "추워지고", "있습니다."})
    void ParameterizedTest(String message) {
        System.out.println(message);
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