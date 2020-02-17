package me.choi.item17;

import java.math.BigInteger;
import java.util.BitSet;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 11/02/2020
 * Time : 10:23 오후
 */
public class mainTest {
    public static void main(String[] args) {
        ImmutableEx im = new ImmutableEx(15,20l);

        ImmutableEx plus = im.plus(new ImmutableEx(20,30l));

        double v = plus.realPart();
        System.out.println(v);

        BigInteger bigInteger = new BigInteger("200");
        BigInteger negate = bigInteger.negate();
        System.out.println(negate);

        BitSet bitSet = new BitSet(111111);
        bitSet.flip(3);

    }
}
