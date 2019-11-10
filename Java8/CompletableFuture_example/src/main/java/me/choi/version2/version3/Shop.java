package me.choi.version2.version3;

import java.util.Random;

import static me.choi.version2.Util.delay;
import static me.choi.version2.Util.format;

public class Shop {
    private final String name;
    private final Random random;

    public Shop(String name) {
        this.name = name;
        random = new Random(name.charAt(0) * name.charAt(1) * name.charAt(2));
    }

    /*return 형식을 살짝 바꿔보자!
    * name + ":" + price + ":" + code
    * */
    public String getPrice(String product) {
        double price = calculatePrice(product);
        Discount.Code code = Discount.Code.values()[random.nextInt(Discount.Code.values().length)];
        return name + ":" + price + ":" + code;
    }
    public Double getPrice2(String product) {
        double price = calculatePrice(product);
        return price;
    }

    public double calculatePrice(String product) {
        delay();
        return format(random.nextDouble() * product.charAt(0) + product.charAt(1));
    }

    public String getName() {
        return name;
    }

}
