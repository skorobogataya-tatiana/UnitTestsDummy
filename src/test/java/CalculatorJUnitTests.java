import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorJUnitTests {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        assertEquals("The sum result is wrong", 15, calculator.add(10, 5));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals("The subtract result is wrong", 15, calculator.subtract(20, 5));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals("The multiply result is wrong", 18, calculator.multiply(3, 6));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals("The divide result is wrong", 3, calculator.divide(18, 6));
    }
}
