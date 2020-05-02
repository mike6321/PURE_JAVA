package me.designpattern.homework.week_01;

import me.designpattern.homework.week_01.Customer.Customer;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/05/02
 * Time : 11:57 오후
 */
public class ShopMain {

    public static String sessionId;

    public static void main(String[] args) {

        String userId = "dynee313";
        Customer customer = new Customer(userId);
        boolean b = customer.checkCustomer(customer);

        sessionId = userId;







        System.out.println(LoginCheck.loginState);






    }

}

