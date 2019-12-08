package me.choi.chapter02.pizza.staticex;

public class Student {
    public static int serialNum = 10000;
    private int studentID;
    public String studentName;
    public String address;
    int kkk;

    public Student(String studentName) {
        this.studentName = studentName;
        serialNum++;
        studentID = serialNum;

    }

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        serialNum++;
        studentID = serialNum;
    }

    public int getStudentID() {
        return studentID;
    }

    public static int getSerialNum() {
        int i = 0;
//        kkk = 1;
//        studentName = "Jun";

        return serialNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}

