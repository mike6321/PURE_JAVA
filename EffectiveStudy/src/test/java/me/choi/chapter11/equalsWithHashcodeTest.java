package me.choi.chapter11;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 10/02/2020
 * Time : 12:13 오전
 */
@RunWith(JUnit4.class)
public class equalsWithHashcodeTest {
    
    @Test
    public void hashCodeOverride()  {
        HashMap<ExtendedPhoneNumber, String> map = new HashMap<>();
        map.put(new ExtendedPhoneNumber(707,867,5307), "제니");

        System.out.println("HashCode of  Instance 1 :: "+ new ExtendedPhoneNumber(707,867,5307).hashCode());
        System.out.println("HashCode of  Instance 2 :: "+ new ExtendedPhoneNumber(707,867,5301).hashCode());

        Assert.assertEquals(map.get(new ExtendedPhoneNumber(707,867,5301)),"제니");


    }
    
    public static class PhoneNumber {
        protected int firsrtNumber;
        protected int secondeNumber;
        protected int thirdNumber;

        public PhoneNumber(int firsrtNumber, int secondeNumber, int thirdNumber) {


        }


        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof PhoneNumber))
                return false;
            
            PhoneNumber p = (PhoneNumber)obj;
            
            return this.firsrtNumber    == p.firsrtNumber   &&
                    this.secondeNumber == p.secondeNumber &&
                    this.thirdNumber   == p.thirdNumber;

        }
    }

    public static class ExtendedPhoneNumber extends PhoneNumber {
        public ExtendedPhoneNumber(int firsrtNumber, int secondeNumber, int thirdNumber) {
            super(firsrtNumber, secondeNumber, thirdNumber);
        }

        @Override
        public int hashCode() {
            return 42;
        }
    }
}
