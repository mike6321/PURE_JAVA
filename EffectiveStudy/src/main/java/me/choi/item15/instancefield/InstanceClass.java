package me.choi.item15.instancefield;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/20
 * Time : 10:31 오후
 */
public class InstanceClass {

    private static testClass[] PRIVATE_VALUES = {};

//    public static final List<testClass> VALUES =
//            Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));
    public static final testClass[] values() {
        return PRIVATE_VALUES.clone();
    }


    public testClass testClass;


}
class testClass {
    private void test() {}
}
class test {

    public static void main(String[] args) {
        InstanceClass instanceClass =new InstanceClass();
        //instanceClass.testClass.test();
    }
}
