package com.powerpackage;

public class PowerFinder {
    public static int find(int base, int power) {
        int powerValue = 1;
        for (int number = 0; number<power; number++) {
            powerValue *= base;
        }
        return powerValue;
    }
}
