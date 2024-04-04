import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleJUnitTests {

    @Test
    public void checkAreaWithInitialSize() {
        Rectangle rectangle = new Rectangle(5.7, 8.2);
        assertEquals("Area value is not correctly calculated", 46.74, rectangle.getArea(), 0.001);
    }

    @Test
    public void checkGetterSetterForWidth() {
        Rectangle rectangle = new Rectangle(5.7, 8.2);
        rectangle.setWidth(9.0);
        assertEquals("Width value is not correctly set", 9.0, rectangle.getWidth(), 0.001);
    }

    @Test
    public void checkGetterSetterForLength() {
        Rectangle rectangle = new Rectangle(5.7, 8.2);
        rectangle.setLength(6.2);
        assertEquals("Length value is not correctly set", 6.2, rectangle.getLength(), 0.001);
    }
}
