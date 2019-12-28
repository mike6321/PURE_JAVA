package me.choi;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class MemberTest {
    private String name;
    private int age;

    @Test
    public void getterSetter() {
        Member member = new Member();
        member.setName("choi");

        Assert.assertEquals(member.getName(),"choi");

    }

}