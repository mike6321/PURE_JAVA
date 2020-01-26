package me.choi.syncwaitnotify;

import java.util.ArrayList;
import java.util.List;

public class Table {
    String[] dishesName = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;

    private List<String> dishes = new ArrayList<>();

    public void add (String dish) {
        if (dishes.size() >= MAX_FOOD) {
            return;
        }
        dishes.add(dish);
        System.out.println("Dishes :: " +dishes.toString());
    }
    public boolean remove (String dishName) {
        for (int i=0;i<dishes.size();i++) {
            if (dishName.equals(dishes.get(i))) {
                dishes.remove(i);
                return true;
            }
        }
        return false;
    }
    public int dishNum () {
        return dishesName.length;
    }
}
