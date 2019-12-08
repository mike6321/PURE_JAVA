package me.choi.chapter02;

public class NutritionFactsNofinal {
    public static final int servingSize=100;
    private int serving;
    private int calories;
    private int fat;
    private int sodium;
    private int carbohydrate;

    public NutritionFactsNofinal() {}
    public class Builder {
        public final int servingSize;
        private final int serving;

        public Builder(int servingSize, int serving) {
            this.servingSize = servingSize;
            this.serving = serving;
        }
    }
//    public NutritionFactsNofinal(int servingSize, int serving) {
//    }
//    public NutritionFactsNofinal(int servingSize, int serving, int calories) {
//    }
//
//    public NutritionFactsNofinal(int servingSize, int serving, int calories, int fat) {
//    }
//    public NutritionFactsNofinal(int servingSize, int serving, int calories, int fat, int sodium) {
//    }
    
    public NutritionFactsNofinal( int serving, int calories, int fat, int sodium, int carbohydrate) {

        this.serving = serving;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
}
