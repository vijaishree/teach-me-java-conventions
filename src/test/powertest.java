package com.powerpackage;


import org.junit.Test;

public class PowertTest {
    @Test
    public void oneRaisedToOneIsOne() {
        assert powerFinder.powerCalculator(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        assert powerFinder.powerCalculator(2,1) == 2;
    }

    @Test
    public void twoRaisedToTwoIsFour() {
        assert powerFinder.powerCalculator(2, 2) == 4;
    }

    @Test
    public void ThreeRaisedToTwoIsNine() {
        assert powerFinder.powerCalculator(3, 2) == 3*3;
    }
}
