

import me.choi.inflearnthejavatest.domain.Member;
import me.choi.inflearnthejavatest.domain.Study;
import me.choi.inflearnthejavatest.member.MemberService;
import me.choi.inflearnthejavatest.study.StudyRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StudyServiceTest {


    @Test
    void createStudyService(@Mock MemberService memberService, @Mock StudyRepository studyRepository) {

        Study study = new Study(10,"test");
        Member member = new Member();

        // TODO memberService 객체에 findById 메소드를 1L 값으로 호출하면 member 객체를 리턴하도록 stubbing
        when(memberService.findById(1L)).thenReturn(Optional.of(member));


        // TODO studyRepository 객체에 save 메소드를 study 객체로 호출하면 study 객체를 그대로 리턴하도록 stubbing
        when(studyRepository.save(study)).thenReturn(study);


    }

}