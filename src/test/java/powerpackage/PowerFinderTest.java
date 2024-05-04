package powerpackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PowerFinderTest {

    @Test
    public void oneRaisedToOneIsOne() {
        int result = PowerFinder.of(1, 1);
        assertEquals(1,result);
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        int result = PowerFinder.of(2, 1);
        assertEquals(2,result);
    }

    @Test
    public void twoRaisedToTwoIsFour() {
        int result = PowerFinder.of(2, 2);
        assertEquals(4,result); ;
    }

    @Test
    public void twoRaisedToThreeIsNine() {
        int result = PowerFinder.of(3, 2);
        assertEquals(3 * 3,result); ;
    }
}
