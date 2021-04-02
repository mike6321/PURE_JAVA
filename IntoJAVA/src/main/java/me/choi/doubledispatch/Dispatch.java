package me.choi.doubledispatch;

import java.util.Arrays;
import java.util.List;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment : 메서드 디스패치
 * Time : 10:32 오후
 */
public class Dispatch {

    static abstract class Service {
        abstract void run();
    }

    static class MyService1 extends Service {
        @Override
        void run() {
            System.out.println("MyService1.run");
        }
    }

    static class MyService2 extends Service {
        @Override
        void run() {
            System.out.println("MyService2.run");
        }
    }

    public static void main(String[] args) {
        Service service = new MyService1();
        service.run(); // receiver parameter

        List<Service> services = Arrays.asList(new MyService1(), new MyService2());
        services.forEach(Service::run);
    }
}
