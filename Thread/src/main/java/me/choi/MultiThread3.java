package me.choi;

import javax.swing.*;

public class MultiThread3 {
    public static void main(String[] args) {
        MultiThread4 multiThread4 = new MultiThread4();
        multiThread4.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요...");
        System.out.println("입력하신 값은 "+input+"입니다.");

    }
}
class MultiThread4 extends Thread {
    @Override
    public void run() {
        for (int i=10;i>0;i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
