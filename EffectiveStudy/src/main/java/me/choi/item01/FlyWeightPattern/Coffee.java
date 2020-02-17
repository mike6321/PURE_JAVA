package me.choi.item01.FlyWeightPattern;

public class Coffee implements CoffeImpl{
    private final String flavor;

    public Coffee(String flavor) {
        this.flavor = flavor;
        System.out.println("커피가 만들어 졌습니다..."+flavor);
    }

    @Override
    public void serveCoffee(CoffeeContext coffeeContext) {
        System.out.println(coffeeContext.getTable()+"테이블에"+flavor+"맛의 커피가 배달됩니다...");
    }
}
