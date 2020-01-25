package me.choi.deamonthread;

import java.util.HashMap;

public class DeamonThreadEx implements Runnable{
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread th = new Thread(new DeamonThreadEx());

        HashMap <String,String> map = new HashMap<>();

        map.put("choi", "jun");
        map.put("choi2", "junwoo");

        //th.setDaemon(true);
        th.start();

        for (int i=0;i<10;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            System.out.println(i);
            if(i==5) {
                autoSave = true;
            }
        }
        System.out.println("프로그램을 종료합니다...");
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1*1000);
            } catch (InterruptedException e) {
            }
            if (autoSave) {
                autoSave();
            }
        }
    }

    public void autoSave() {
        System.out.println("작업이 자동 저장 되었습니다.");
    }
}
