package me.choi.chapter02.pizza.staticex;

public class StudentIDTest {
    public static void main(String[] args) {

        Student studentChoi = new Student("choi");


        System.out.println(Student.serialNum);
        Student studentLee = new Student("lee");
        System.out.println(Student.serialNum);

        System.out.println("학번 check");
        System.out.println(studentChoi.getStudentID());
        System.out.println(studentLee.getStudentID());



    }
}
