package me.choi.etc;

public class StringLatin1 {

    public static boolean equalsCustum(byte[] value, byte[] other) {
        if (value.length == other.length) {
            for (int i=0 ;i< value.length;i++) {
                if(value[i] != other[i]) {
                    return false;
                }
            }
            return true;
        }else {
            return true;
        }
    }
}
