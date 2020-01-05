package me.choi.lombokdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MemberTest {

    @Test
    public void getterSetter() {
        Member member = new Member();
        member.setAge(30);
        member.setName("choijunwoo");
        assertEquals(member.getAge(),30);

    }
}