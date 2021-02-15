package me.choi.etc;

public class StringUTF16 {
    static final int HI_BYTE_SHIFT;
    static final int LO_BYTE_SHIFT;
    private static native boolean isBigEndian();

    static {
        if (isBigEndian()) {
            HI_BYTE_SHIFT = 8;
            LO_BYTE_SHIFT = 0;
        } else {
            HI_BYTE_SHIFT = 0;
            LO_BYTE_SHIFT = 8;
        }

    }

    public static boolean equalsCustum(byte[] value, byte[] other) {
        if (value.length == other.length) {
            int len = value.length >> 1;

            for(int i = 0; i < len; ++i) {
                if (getChar(value, i) != getChar(other, i)) {
                    return false;
                }
            }

            return true;
        } else {
            return false;
        }
    }

    static char getChar(byte[] val, int index) {
        assert index >= 0 && index < length(val) : "Trusted caller missed bounds check";

        index <<= 1;
        return (char)((val[index++] & 255) << HI_BYTE_SHIFT | (val[index] & 255) << LO_BYTE_SHIFT);
    }

    public static int length(byte[] value) {
        return value.length >> 1;
    }
}
