package me.choi.chapter01.FlyWeightPattern;

public class FlyWeightMain {
    private static Coffee[] coffees = new Coffee[20];
    private static CoffeeContext[] tables = new CoffeeContext[20];
    private static int ordersCount = 0;
    private static CoffeeFactory coffeeFactory;


    public static void takeOrder(String flavoin, int table) {

        coffees[ordersCount] = coffeeFactory.getCoffeeFlavor(flavoin);
        tables[ordersCount] = new CoffeeContext(table);
        ordersCount++;
    }
    public static void main(String[] args) {
        coffeeFactory = new CoffeeFactory();

        takeOrder("딸기맛커피",2);
        takeOrder("딸기맛커피",2);
        takeOrder("키위맛커피",1);
        takeOrder("빨간맛커피",1);
        takeOrder("체리맛커피",1);
        takeOrder("감맛커피",1);

        for (int i=0;i<ordersCount;i++){
            coffees[i].serveCoffee(tables[i]);
        }

        System.out.println("만들어진 커피(객체)는 :::" + coffeeFactory.getTotalCoffeeFlavorsMade());
    }
}
