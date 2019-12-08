package me.choi.chapter01.FlyWeightPattern;

import java.util.HashMap;

public class CoffeeFactory {
    private HashMap<String,Coffee> flavors = new HashMap<>();

    public Coffee getCoffeeFlavor(String flavorName) {
        Coffee flavor = flavors.get(flavorName);

        if (flavor == null) {

            flavor = new Coffee(flavorName);
            flavors.put(flavorName,flavor);
        }
        return flavor;
    }

    public int getTotalCoffeeFlavorsMade() {
        return flavors.size();
    }
}
