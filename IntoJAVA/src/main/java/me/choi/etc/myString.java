package me.choi.etc;

import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;
import java.lang.invoke.MethodHandles;
import java.util.Optional;

public class myString implements java.io.Serializable, Comparable<String>, CharSequence,
        Constable, ConstantDesc {

    static final boolean COMPACT_STRINGS = true;
    private final byte coder;
    private final byte[] value;
    private int hash;


    public myString(byte coder, byte[] value) {
        this.coder = coder;
        this.value = value;
    }

    public myString(myString myString) {
        this.value = myString.value;
        this.coder = myString.coder;
        this.hash = myString.hash;
    }




    private boolean isLatin1() {
        return COMPACT_STRINGS && this.coder == 0;
    }

    byte coder() {
        return COMPACT_STRINGS ? this.coder : 1;
    }

    public boolean equalsCustum(Object object) {
        if (this == object) {
            return true;
        } else {
            if (object instanceof myString) {
                myString aString = (myString) object;
                if (this.coder() == aString.coder()) {
                    return this.isLatin1() ? StringLatin1.equalsCustum(this.value, aString.value) : StringUTF16.equalsCustum(this.value,aString.value);
                }
            }
            return false;
        }

    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public Optional<? extends ConstantDesc> describeConstable() {
        return Optional.empty();
    }

    @Override
    public Object resolveConstantDesc(MethodHandles.Lookup lookup) throws ReflectiveOperationException {
        return null;
    }
}
