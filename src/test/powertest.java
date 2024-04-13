package com.powerpackage;


import org.junit.Test;

public class PowertTest {
    @Test
    public void oneRaisedToOneIsOne() {
        assert powerFinder.of(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneIs2() {
        assert powerFinder.of(2,1) == 2;
    }

    @Test
    public void twoPower2Is4() {
        assert powerFinder.of(2, 2) == 4;
    }

    @Test
    public void powerOf2And3IsSix() {
        assert powerFinder.of(3, 2) == 3*3;
    }
}
