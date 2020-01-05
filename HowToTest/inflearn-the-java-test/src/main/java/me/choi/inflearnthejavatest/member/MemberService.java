package me.choi.inflearnthejavatest.member;

import me.choi.inflearnthejavatest.domain.Member;

public interface MemberService {
    void validate(Long memberId) throws InvaildMemberException;

    Member findById(Long memberId) throws MemberNotFoundException;
}
