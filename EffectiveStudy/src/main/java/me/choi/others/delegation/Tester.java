package me.choi.others.delegation;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/04/07
 * Time : 11:55 오후
 */
class RealPrinter {
    void print() {
        System.out.println("The Delegate");
    }
}

class Printer {
    RealPrinter realPrinter = new RealPrinter();

    void print() {
        realPrinter.print();
    }
}

public class Tester {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }
}
