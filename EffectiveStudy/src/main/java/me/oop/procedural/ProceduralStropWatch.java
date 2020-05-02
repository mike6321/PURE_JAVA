package me.oop.procedural;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/05/02
 * Time : 9:07 오후
 */
public class ProceduralStropWatch {
    private long startTime;
    private long stopTime;


    public void start() {
        this.startTime = System.nanoTime();
    }
    public void stop() {
        this.stopTime = System.nanoTime();
    }

    public long ElapsedTime() {
        return stopTime - startTime;
    }


}
