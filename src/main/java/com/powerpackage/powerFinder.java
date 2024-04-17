package com.powerpackage;

public class powerFinder {
    public static int powerCalculator(int base, int power) {
        int powerValue = 1;
        for (int number = 0; number<power; number++) {
            powerValue *= base;
        }
        return powerValue;
    }
}
