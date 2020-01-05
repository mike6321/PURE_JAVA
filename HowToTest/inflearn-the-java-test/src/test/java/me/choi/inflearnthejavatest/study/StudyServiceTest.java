package me.choi.inflearnthejavatest.study;

import me.choi.inflearnthejavatest.domain.Member;
import me.choi.inflearnthejavatest.domain.Study;
import me.choi.inflearnthejavatest.member.MemberService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StudyServiceTest {


    @Test
    void createStudyService(@Mock MemberService memberService, @Mock StudyRepository studyRepository) {

        StudyService studyService = new StudyService(memberService,studyRepository);

        Member member = new Member();
        member.setId(1L);
        member.setEmail("rownsdn912@gmail.com");
        /*
         * memberId가 1일 때 위에 정의한 member 인스턴스를 리턴해준다.
         * */
        when(memberService.findById(any())).thenReturn(Optional.of(member));

        Optional<Member> findbyId = memberService.findById(1L);
        assertEquals("rownsdn912@gmail.com", findbyId.get().getEmail());


    }

}