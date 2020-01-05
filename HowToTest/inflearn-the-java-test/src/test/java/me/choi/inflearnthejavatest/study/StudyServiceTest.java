package me.choi.inflearnthejavatest.study;

import me.choi.inflearnthejavatest.domain.Member;
import me.choi.inflearnthejavatest.member.MemberService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(MockitoExtension.class)
class StudyServiceTest {


    @Test
    void createStudyService(@Mock MemberService memberService, @Mock StudyRepository studyRepository) {
        Optional<Member> optional = memberService.findById(1L);
        assertNull(optional);

        memberService.validate(1L);
        StudyService studyService = new StudyService(memberService, studyRepository);

        assertNotNull(studyRepository);
    }

}