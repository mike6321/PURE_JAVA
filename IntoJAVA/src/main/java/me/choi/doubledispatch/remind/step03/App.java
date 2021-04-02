package me.choi.doubledispatch.remind.step03;

import java.util.Arrays;
import java.util.List;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:56 오전
 */
public class App {
    public static void main(String[] args) {
        List<BookStore> bookStores = Arrays.asList(new Bandi(), new Kyobo());
        bookStores.forEach(bs -> {
            //Sales.sales(bs);
            if (bs instanceof Bandi) {
                Sales.sales((Bandi) bs);
            }
            if (bs instanceof Kyobo) {
                Sales.sales((Kyobo) bs);
            }
        });
    }
}
