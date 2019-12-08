package me.choi.chapter02;

public class NutritionFactsJavaBeans {
    private  int servingSize;
    private  int serving;
    private  int calories;
    private  int fat;
    private  int sodium;
    private  int carbohydrate;


    public NutritionFactsJavaBeans() {
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServing(int serving) {
        this.serving = serving;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
}
