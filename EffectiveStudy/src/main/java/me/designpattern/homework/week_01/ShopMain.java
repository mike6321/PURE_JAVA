package me.designpattern.homework.week_01;

import me.designpattern.homework.week_01.Customer.Customer;
import me.designpattern.homework.week_01.order.EmployeeCustomerOrderCheck;
import me.designpattern.homework.week_01.order.OrderCheck;

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

        String userId = "mike6321";
        Customer customer = new Customer(userId);
        boolean checkCustomer = customer.checkCustomer(customer);

        checkLogin(userId, checkCustomer);
        System.out.println(LoginCheck.loginState);

        OrderCheck orderCheck = new EmployeeCustomerOrderCheck();
        orderCheck.checkOrder(userId);



    }

    // TODO: [로그인 체킹] junwoochoi 2020/05/06 2:11 오전
    private static void checkLogin(String userId, boolean checkCustomer) {
        if (checkCustomer) {
            System.out.println(userId+" 님  환영합니다!");
            sessionId = userId;
        } else {
            System.out.println("회원이 아니십니다!");
        }
    }

}

