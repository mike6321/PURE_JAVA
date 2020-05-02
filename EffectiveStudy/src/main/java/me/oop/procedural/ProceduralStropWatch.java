package me.oop.procedural;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/05/02
 * Time : 9:07 오후
 */
public class ProceduralStropWatch {
    public long startTime;
    public long stopTime;

    public long startNanoTime;
    public long stopNanoTime;

    public long getElapsedTime() {
        return stopTime - startTime;
    }

    public long getElapsedNamoTime() {
        return stopNanoTime - startNanoTime;
    }
}
