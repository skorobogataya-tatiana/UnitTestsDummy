import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RectangleTestNGTests {
    @Test
    public void checkAreaWithInitialSize() {
        Rectangle rectangle = new Rectangle(5.7, 8.2);
        assertEquals(rectangle.getArea(), 46.74, 0.001, "Area value is not correctly calculated");
    }

    @Test
    public void checkGetterSetterForWidth() {
        Rectangle rectangle = new Rectangle(5.7, 8.2);
        rectangle.setWidth(9.0);
        assertEquals(rectangle.getWidth(), 9.0, 0.001, "Width value is not correctly set");
    }

    @Test
    public void checkGetterSetterForLength() {
        Rectangle rectangle = new Rectangle(5.7, 8.2);
        rectangle.setLength(6.2);
        assertEquals(rectangle.getLength(), 6.2, 0.001, "Length value is not correctly set");
    }
}
