import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddJUnitTests {

    @Test
    public void checkEvenNumber() {
        assertTrue("Inputted number is not even", EvenOddChecker.check(28));
    }

    @Test
    public void checkOddNumber() {
        assertFalse("Inputted number is not odd", EvenOddChecker.check(19));
    }
}
