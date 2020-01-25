package me.choi.interrupt;

import javax.swing.*;

public class ThreadInterrupt {
    public static void main(String[] args) {
        ThreadInterrupt_1 th1 = new ThreadInterrupt_1();
        th1.start();
        System.out.println("isInterrupted() : "+ th1.isInterrupted());

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
        System.out.println("입력하신 값은 "+input+"입니다.");
        th1.interrupt();
        System.out.println("isInterrupted() : "+ th1.isInterrupted());
    }
}
class ThreadInterrupt_1 extends Thread{
    @Override
    public void run() {
        int i = 10;

        while (i != 0 && !isInterrupted()){
            System.out.println(i--);
            for (long x =0 ;x<2500000000L;x++); //시간지연
        }
        System.out.println("카운트가 종료되었습니다.");
    }
}
class ThreadInterrupt_2 extends Thread{
    @Override
    public void run() {

    }
}