package me.oop.uiformaccessprinciple;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/05/09
 * Time : 8:20 오후
 */
public class AccountTest {

    @Test
    public void deposit() {
        Account account = new Account();
        account.balance  += 3000;
        account.balance  += 2000;

        assertEquals(5000, account.balance);
    }

    @Test
    public void withdraw() {
        Account account = new Account();
        account.deposit(3000);
        account.withdraw(1000);


        assertEquals(2000, account.balance);
    }

    @Test
    public void EncapsulateBreak() {
        Account account = new Account();
        account.deposit(3000);
        account.withdraw(1000);

        account.balance = 5000;

        assertEquals(2000, account.balance);
    }

}