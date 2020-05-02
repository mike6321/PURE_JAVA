package me.designpattern.homework.week_01.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/05/02
 * Time : 11:55 오후
 */
public class Product {
    private static final Map<Integer, Product> product;

    static {
        product = new HashMap<>();
        product.put(111111, new Product(111111, 20000, 12345, 10));
        product.put(222222, new Product(222222,10000, 0, 40));
        product.put(333333, new Product(333333, 10000, 0, 0));
    }


    private final long prdCd;
    private final long prdPrc;
    private final long giftNo;
    private final int stock;

    public Product(long prdCd, long prdPrc, long giftNo, int stock) {
        this.prdCd = prdCd;
        this.prdPrc = prdPrc;
        this.giftNo = giftNo;
        this.stock = stock;
    }
}
