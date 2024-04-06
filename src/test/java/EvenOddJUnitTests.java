import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddJUnitTests {

    @Test
    public void checkEvenNumber() {
        assertTrue("Inputted number 28 is not even", EvenOddChecker.check(28));
    }

    @Test
    public void checkOddNumber() {
        assertFalse("Inputted number 19 is not odd", EvenOddChecker.check(19));
    }
}
