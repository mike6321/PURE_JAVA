package me.choi.chapter10;

import java.util.Objects;

public class CaseInsenstiveString {
    private final String s;

    public static void main(String[] args) {
        CaseInsenstiveString cs = new CaseInsenstiveString("choi");
        boolean result = cs.equals("cHoi");

        System.out.println(result);

        String s = new String("cHoi");
        boolean result2 = s.equals(cs);

        System.out.println(result2);
    }

    public CaseInsenstiveString(String s) {
        Objects.requireNonNull(this.s = s);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CaseInsenstiveString) {
            return s.equalsIgnoreCase(
                    ((CaseInsenstiveString) obj).s);
        }
        if (obj instanceof String) {
            return s.equalsIgnoreCase((String) obj);
        }
        return false;
    }
}
