package me.choi.inflearnthejavatest.member;

import me.choi.inflearnthejavatest.domain.Member;

import java.util.Optional;

public interface MemberService {
    Optional<Member> findById(Long memberId) throws MemberNotFoundException;
}
