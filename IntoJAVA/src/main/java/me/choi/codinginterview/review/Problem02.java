package me.choi.codinginterview.review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:12 오후
 */
public class Problem02 {
    public static List<String> solution(List<List<String>> items, int orderBy, int orderDirection, int pageSize, int pageNumber) {
        final List<Paging> pagings = new ArrayList<>();
        for (List<String> item : items) {
            pagings.add(new Paging(item.get(0), item.get(1), item.get(2)));
        }

        sort(pagings, orderBy, orderDirection);

        int startIdx = pageNumber * pageSize;
        int countOfTotalData = items.size();

        return pagings.stream()
                .map(Paging::getName)
                .skip(startIdx)
                .limit(pageSize)
                .collect(Collectors.toList());
    }

    private static void sort(final List<Paging> pagings, final int orderBy, final int orderDirection) {
        Comparator<Paging> comparator = getComparator(orderBy);
        if (orderDirection == 1) {
            comparator = comparator.reversed();
        }

        Collections.sort(pagings, comparator);
    }

    private static Comparator<Paging> getComparator(final int orderBy) {
        Comparator<Paging> comparator;
        if (orderBy == 0) {
            comparator = Comparator.comparing(Paging::getName);
        } else if (orderBy == 1) {
            comparator = Comparator.comparing(Paging::getDegreeOfRelation);
        } else {
            comparator = Comparator.comparing(Paging::getPrice);
        }
        return comparator;
    }
}

class Paging {
    private final String name;
    private final int degreeOfRelation;
    private final int price;

    public Paging(final String name, final String degreeOfRelation, final String price) {
        this.name = name;
        this.degreeOfRelation = Integer.parseInt(degreeOfRelation);
        this.price = Integer.parseInt(price);
    }

    public String getName() {
        return name;
    }

    public int getDegreeOfRelation() {
        return degreeOfRelation;
    }

    public int getPrice() {
        return price;
    }
}
