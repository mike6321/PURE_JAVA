package me.choi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DeamonThreadEx2 {
    public static void main(String[] args) {
        DeamonThreadEx2_1 t1 = new DeamonThreadEx2_1("Thread1");
        DeamonThreadEx2_2 t2 = new DeamonThreadEx2_2("Thread2");
        t1.start();
        t2.start();
    }
}
class DeamonThreadEx2_1 extends Thread {

    DeamonThreadEx2_1 (String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class DeamonThreadEx2_2 extends Thread {
    DeamonThreadEx2_2(String name) {
        super(name);
    }

    @Override
    public void run() {
        Map map = getAllStackTraces();
        Iterator it = map.keySet().iterator();

        int x = 0;
        while (it.hasNext()){
            Object obj = it.next();
            Thread th = (Thread) obj;
            StackTraceElement[] ste = (StackTraceElement[]) map.get(obj);
            System.out.println("["+ ++x +"] name : " + th.getName()
                                + ", group : "+th.getThreadGroup().getName()
                                + ", deamon : "+th.isDaemon());

            for (int i=0;i<ste.length;i++) {
                System.out.println(ste[i]);
            }

            System.out.println();
        }

    }
}