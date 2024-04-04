import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EvenOddTestNGTests {

    @Test
    public void checkEvenNumber() {
        assertTrue(EvenOddChecker.check(8), "The inputted number is not even");
    }

    @Test
    public void checkOddNumber() {
        assertFalse(EvenOddChecker.check(11), "The inputted number is not odd");
    }
}
