package me.choi.others;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 08/02/2020
 * Time : 9:11 오후
 */
public class GetClassEx {

    public static void main(String[] args) {
        GetClassEx getCassEx = new GetClassEx();
        ExtendedClassA extendedClassA = getCassEx.new ExtendedClassA();
        extendedClassA.printThisClass();
        extendedClassA.printClass();


    }
    public class ClassA {
        public void printThisClass () {
            System.out.println(getClass());
        }
    }
    public class ExtendedClassA extends ClassA {
        public void printClass() {
            printClass();
        }
    }

}
