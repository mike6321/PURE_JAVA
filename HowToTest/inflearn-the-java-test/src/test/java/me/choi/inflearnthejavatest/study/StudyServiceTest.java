package me.choi.inflearnthejavatest.study;

import me.choi.inflearnthejavatest.Study;
import me.choi.inflearnthejavatest.domain.Member;
import me.choi.inflearnthejavatest.member.MemberNotFoundException;
import me.choi.inflearnthejavatest.member.MemberService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class StudyServiceTest {

    @Test
    void createStudyService() {

        MemberService memberService = mock(MemberService.class);
        StudyRepository studyRepository = mock(StudyRepository.class);


        StudyService studyService = new StudyService(memberService,studyRepository);

        assertNotNull(studyRepository);
    }

}