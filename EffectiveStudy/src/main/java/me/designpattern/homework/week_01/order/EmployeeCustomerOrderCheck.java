package me.designpattern.homework.week_01.order;

import me.designpattern.homework.week_01.Customer.Customer;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/05/03
 * Time : 2:02 오전
 */
public class EmployeeCustomerOrderCheck extends OrderCheck{

    @Override
    protected boolean authorizationCheck(String userId) {
        Customer customer = new Customer(userId);

        return customer.pointCheck(userId);

    }
}
