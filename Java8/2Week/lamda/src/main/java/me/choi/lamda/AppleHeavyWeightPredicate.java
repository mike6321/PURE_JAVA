package me.choi.lamda;

public class AppleHeavyWeightPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeitght() < 150;
    }
}
