import org.testng.annotations.*;

import static org.testng.Assert.*;

public class CalculatorTestNGTests {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.add(10, 5), 15, "The sum result is wrong");
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.subtract(15, 5), 10, "The subtract result is wrong");
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.multiply(5, 4), 20, "The multiply result is wrong");
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.divide(18, 6), 3, "The divide result is wrong");
    }
}
