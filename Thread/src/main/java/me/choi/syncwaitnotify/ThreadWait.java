package me.choi.syncwaitnotify;

import java.util.ArrayList;
import java.util.HashMap;

public class ThreadWait {
    public static void main(String[] args) throws Exception {
        Table table = new Table();
        HashMap<String,String> map = new HashMap();

//        Object object = "234";
//        new Thread(new Cook(table), "COOK1").start();
//        new Thread(new Customer(table, "donut"), "CUST1").start();
//        new Thread(new Customer(table, "burger"), "CUST2").start();
//
//        Thread.sleep(100);
//        System.exit(0);

        Integer a = 106079;
        ArrayList<Integer> list = new ArrayList<>();

        //2진수 변
        while (true) {
            if (a<=0)
                break;

            a = a/2;
            list.add(a%2);
        }
        System.out.println("size :: "+list.size());
        for (int i : list) {
            System.out.print(list.get(i));
        }
        //0000000000000000001
        //1111111111111111110

        int i = a.hashCode();
        int i0 = i >>> 16;
        int i1 = i ^ (i >>> 16);
        System.out.println(i);
        System.out.println(i0);
        System.out.println(i1);


    }
}
