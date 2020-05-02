package me.oop.procedural;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/05/02
 * Time : 9:08 오후
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ProceduralStropWatch proceduralStropWatch = new ProceduralStropWatch();
        proceduralStropWatch.startTime = System.currentTimeMillis();
        Thread.sleep(10);

        proceduralStropWatch.stopTime = System.currentTimeMillis();


        System.out.println(proceduralStropWatch.getElapsedTime());


    }
}
