package me.choi.chapter17;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 11/02/2020
 * Time : 12:50 오전
 */
public final class ImmutableEx {

    final String name;
    final int id;

    public ImmutableEx(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
