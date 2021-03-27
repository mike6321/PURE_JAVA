package me.choi.codinginterview.review;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:11 오후
 */
public class Problem01 {
    private static final int BORROW_INDEX = 0;
    private static final int LEND_INDEX = 1;
    private static final int POINT_INDEX = 2;

    public static List<String> solution(List<List<String>> arr) {
        final Map<String, Integer> map = new HashMap<>();

        for (List<String> persons : arr) {
            final String borrower = persons.get(BORROW_INDEX);
            final String lender = persons.get(LEND_INDEX);
            final int point = Integer.parseInt(persons.get(POINT_INDEX));

            if (map.containsKey(borrower)) {
                map.put(borrower, map.get(borrower) - point);
            } else {
                map.put(borrower, map.getOrDefault(borrower, 0) - point);
            }

            if (map.containsKey(lender)) {
                map.put(lender, map.get(lender) + point);
            } else {
                map.put(lender, map.getOrDefault(lender, 0) + point);
            }

        }

        return answer(map);
    }

    private static List<String> answer(final Map<String, Integer> map) {
        final int min = min(map);
        if (min >= 0) {
            return new ArrayList<>(Arrays.asList("None"));
        }

        return map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == min)
                .map(Map.Entry::getKey)
                .sorted(Comparator.comparing(Object::toString))
                .collect(Collectors.toList());
    }

    private static int min(final Map<String, Integer> map) {
        return map.entrySet()
                .stream()
                .min(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getValue)
                .get();
    }
}
