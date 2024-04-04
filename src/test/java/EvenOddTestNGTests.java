import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class EvenOddTestNGTests {

    @Test
    public void checkEvenNumber() {
        assertTrue("The inputted number is not even", EvenOddChecker.check(8));
    }

    @Test
    public void checkOddNumber() {
        assertFalse("The inputted number is not odd", EvenOddChecker.check(11));
    }
}
