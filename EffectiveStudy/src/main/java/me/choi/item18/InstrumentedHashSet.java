package me.choi.item18;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/27
 * Time : 8:31 오후
 */
public class InstrumentedHashSet<E> extends HashSet<E> {

    private int addCount = 0;


    public InstrumentedHashSet() {

    }

    public InstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
class Main {
    public static void main(String[] args) {
        InstrumentedHashSet instance = new InstrumentedHashSet();
        instance.addAll(List.of("choi","jun","woo"));

        System.out.println(instance.getAddCount());
    }
}