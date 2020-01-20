package me.choi;

public class PriorityThread {
    public static void main(String[] args) {
        PriorityThread_2 priorityThread_2 = new PriorityThread_2();
        PriorityThread_3 priorityThread_3 = new PriorityThread_3();

        priorityThread_3.setPriority(1);

        System.out.println("Priority of PriorityThread_2(ㅡ) : "+priorityThread_2.getPriority());
        System.out.println("Priority of PriorityThread_3(|) : "+priorityThread_3.getPriority());

        priorityThread_2.start();
        priorityThread_3.start();
    }
}
class PriorityThread_2 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<300;i++) {
            System.out.print("ㅡ");
            for (int x=0;x<1000000;x++);
        }
    }
}
class PriorityThread_3 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<300;i++) {
            System.out.print("|");
            for (int x=0;x<1000000;x++);
        }
    }
}
