package me.oop.uiformaccessprinciple;

import java.util.ArrayList;
import java.util.List;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/05/09
 * Time : 8:20 오후
 */
public class Account {
    public long balance;
    private List<Long> withdraws = new ArrayList<>();
    private List<Long> deposits = new ArrayList<>();


    public void withdraw(long amount) {
        withdraws.add(amount);
        balance -= amount;
    }

    public void deposit(long amount) {
        deposits.add(amount);
        balance += amount;
    }

}
