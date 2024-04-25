package com.powerpackage;


import org.junit.Test;

public class PowerTest {
    private int base;
    private int power;
    @Test
    public void oneRaisedToOneIsOne() {
        base =1;
        power = 1;
        assert powerFinder.powerCalculator(base,power) == 1;
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        base = 2;
        power = 1;
        assert powerFinder.powerCalculator(base , power) == 2;
    }

    @Test
    public void twoRaisedToTwoIsFour() {
         base = 2;
        power = 2;
        assert powerFinder.powerCalculator(base , power) == 4;
    }

    @Test
    public void threeRaisedToTwoIsNine() {
         base = 3;
        power = 2;
        assert powerFinder.powerCalculator(base , power) == 9;
    }
}
