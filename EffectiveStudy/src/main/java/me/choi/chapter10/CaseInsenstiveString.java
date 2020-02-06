package me.choi.chapter10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class CaseInsenstiveString {
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

    // TODO:  junwoochoi 06/02/2020 11:58 오후
    // string과 연동한다는 허황된 꿈을 버려한다는 것이 결론이다.
    public boolean equals(Object obj) {

        return obj instanceof CaseInsenstiveString &&
                    ((CaseInsenstiveString) obj).s.equalsIgnoreCase(s);


//        if (obj instanceof CaseInsenstiveString) {
//            return s.equalsIgnoreCase(
//                    ((CaseInsenstiveString) obj).s);
//        }
//        if (obj instanceof String) {
//            return s.equalsIgnoreCase((String) obj);
//        }
//        return false;
    }
}
