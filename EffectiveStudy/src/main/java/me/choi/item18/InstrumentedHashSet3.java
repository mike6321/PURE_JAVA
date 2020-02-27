package me.choi.item18;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/27
 * Time : 9:54 오후
 */
public class InstrumentedHashSet3<E> extends InstrumentedHashSet2<E>{
    private int addCount = 0;

    public InstrumentedHashSet3(Set set) {
        super(set);
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
class Main2 {
    public static void main(String[] args) {
        InstrumentedHashSet3<String> instrumentedHashSet3 = new InstrumentedHashSet3<String>(new HashSet());
        instrumentedHashSet3.addAll(List.of("choi","jun","woo"));

        System.out.println(instrumentedHashSet3.getAddCount());
    }
}
