package powerpackage;


import org.junit.Test;

public class PowertTest {
    @Test
    public void oneRaisedToOneIsOne() {
        assert powerFinder.OF(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneIs2() {
        assert powerFinder.OF(2,1) == 2;
    }

    @Test
    public void twoPower2Is4() {
        assert powerFinder.OF(2, 2) == 4;
    }

    @Test
    public void powerOf2And3IsSix() {
        assert powerFinder.OF(3, 2) == 3*3;
    }
}
