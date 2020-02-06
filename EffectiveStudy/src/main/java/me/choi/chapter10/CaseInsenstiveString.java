package me.choi.chapter10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CaseInsenstiveString {
    private final String s;


    public static void main(String[] args) {

        // TODO: [main] junwoochoi 06/02/2020 11:04 오후
        // 대칭성 위배 - String , List (1)
       CaseInsenstiveString cs = new CaseInsenstiveString("choi");
        boolean result = cs.equals("cHoi");
        System.out.println(result);

        String s = new String("cHoi");
        boolean result2 = s.equals(cs);
        System.out.println(result2);

        List<CaseInsenstiveString> list = new ArrayList<>();
        list.add(cs);

        boolean result3 = list.contains(s);
        System.out.println(result3);


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
