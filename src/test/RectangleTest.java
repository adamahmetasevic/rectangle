package test;
import main.Rectangle;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RectangleTest {
    private Rectangle rectangle;

    @Before
    public void setUp() {
        rectangle = new Rectangle(5, 4);
    }

    @Test
    public void testAreaCalculation() {
        assertEquals(20, rectangle.getArea(), 0);
    }

    @Test
    public void testPerimeterCalculation() {
        assertNotEquals(22, rectangle.getPerimeter(), 0);
    }
}
