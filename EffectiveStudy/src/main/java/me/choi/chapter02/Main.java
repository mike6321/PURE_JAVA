package me.choi.chapter02;

public class Main {

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts(4,2,0,3);

        System.out.println(nutritionFacts.getServingSize());

        NutritionFactsWithBuilder cocaCola = new NutritionFactsWithBuilder.Builder(240,8)
                .calories(100).build();
        System.out.println(cocaCola);



    }
}
