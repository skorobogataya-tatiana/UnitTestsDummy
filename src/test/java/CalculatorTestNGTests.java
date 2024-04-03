import org.testng.annotations.*;

import static org.testng.AssertJUnit.*;

public class CalculatorTestNGTests {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        assertEquals("The sum result is wrong", 15, calculator.add(10, 5));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals("The subtract result is wrong", 10, calculator.subtract(15, 5));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals("The multiply result is wrong", 20, calculator.multiply(5, 4));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals("The divide result is wrong", 3, calculator.divide(18, 6));
    }
}
