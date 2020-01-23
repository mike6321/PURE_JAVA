package me.choi;

public class DeamonThreadEx implements Runnable{
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread th = new Thread(new DeamonThreadEx());
        th.setDaemon(true);
        th.start();

        for (int i=0;i<10;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(i);

                if(i==5) {
                    autoSave = true;
                }
            }
        }
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3*1000);
            } catch (InterruptedException e) {
                if (autoSave) {
                    autoSave();
                }
            }
        }
    }

    public void autoSave() {
        System.out.println("작업이 자동 저장 되었습니다.");
    }
}
