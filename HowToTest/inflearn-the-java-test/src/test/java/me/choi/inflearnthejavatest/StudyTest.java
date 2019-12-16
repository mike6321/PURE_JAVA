package me.choi.inflearnthejavatest;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @Test
    @DisplayName("주누의 개인공부 시간")
    void create_new_study() {
        Study study = new Study(-10);

//        assertNotNull(study);
//        //assertEquals(StudyStatus.DRAFT, study.getStatus(), "스터디를 처음 만들면 상태값은 DRAFT여야 한다.");
//        assertEquals(StudyStatus.DRAFT, study.getStatus(), () -> "스터디를 처음 만들면 상태값은 DRAFT여야 한다.");
//        assertTrue(study.getLimit() > 0, "스터디 최대 참석인원은 0명 보다 커야 합니다.");

//        assertAll(
//                () -> assertNotNull(study),
//                () -> assertEquals(StudyStatus.DRAFT, study.getStatus(), () -> "스터디를 처음 만들면 상태값은 DRAFT여야 한다."),
//                () ->assertTrue(study.getLimit() > 0, "스터디 최대 참석인원은 0명 보다 커야 합니다.")
//        );
//
//        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Study(-50));
//        String message = exception.getMessage();
//        assertEquals(message, "학생 수가 너무 작아요");

        assertTimeoutPreemptively(Duration.ofMillis(100), () ->{
            new Study(10);
            Thread.sleep(30000);
        });
    }
    @Test
    @Disabled
    void create2() {
        System.out.println("create2");
    }

    @Test
    public void tesing_intelij() {
        System.out.println("test!");
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