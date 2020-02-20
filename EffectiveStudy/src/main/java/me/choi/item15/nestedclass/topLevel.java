package me.choi.item15.nestedclass;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/17
 * Time : 11:47 오후
 */
class topLevel {
    public static void main(String[] args) {
        nestedClass nestedClass = new topLevel.nestedClass();
        nestedClass.test();

    }

    private static class nestedClass {
        void test() {
            System.out.println("nested class starting....");
        }
    }
}
