package me.oop;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/05/03
 * Time : 5:49 오후
 */
public class Main {
    public static void main(String[] args) {
        /*instance  == 객체 */


        //instance-1
        instanceEx instanceEx1 = new instanceEx(2, "123");
        //instance-2
        instanceEx instanceEx2 = new instanceEx(3, "1234");

        instanceEx1.method();
        instanceEx2.method();

    }
}
