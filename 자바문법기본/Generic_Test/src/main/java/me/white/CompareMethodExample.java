package me.white;

public class CompareMethodExample {
    public static void main(String[] args) {
        Pair<Integer,String> p1 = new Pair<Integer, String>(1,"apple");
        Pair<Integer,String> p2 = new Pair<Integer, String>(1,"apple");

        boolean result = Util.<Integer,String>compare(p1,p2);
        if (result){
            System.out.println("논리적으로 동등한 객체입니다.");
        }else {
            System.out.println("논리적으로 동등한 객체가 아닙니다.");
        }
        Pair<String,String> p3 = new Pair<String, String>("User1","choi");
        Pair<String,String> p4 = new Pair<String, String>("User1","choi");


        boolean result2 = Util.<Integer,String>compare(p1,p2);
        if (result2){
            System.out.println("논리적으로 동등한 객체입니다.");
        }else {
            System.out.println("논리적으로 동등한 객체가 아닙니다.");
        }
    }
}
