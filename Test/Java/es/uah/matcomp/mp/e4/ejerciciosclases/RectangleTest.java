package es.uah.matcomp.mp.e4.ejerciciosclases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void testDefaultConstructor() {
        Rectangle rectangle = new Rectangle();
        assertEquals(1.0, rectangle.getWidth(), 0.01);
        assertEquals(1.0, rectangle.getLength(), 0.01);
        assertEquals("red", rectangle.getColor()); // Suponiendo que Shape tiene color "red" por defecto
        assertTrue(rectangle.isFilled()); // Suponiendo que Shape tiene `filled = true` por defecto
    }

    @Test
    void testConstructorWithWidthAndLength() {
        Rectangle rectangle = new Rectangle(3.5, 4.5);
        assertEquals(3.5, rectangle.getWidth(), 0.01);
        assertEquals(4.5, rectangle.getLength(), 0.01);
    }

    @Test
    void testConstructorWithAllAttributes() {
        Rectangle rectangle = new Rectangle(5.0, 7.0, "blue", false);
        assertEquals(5.0, rectangle.getWidth(), 0.01);
        assertEquals(7.0, rectangle.getLength(), 0.01);
        assertEquals("blue", rectangle.getColor());
        assertFalse(rectangle.isFilled());
    }

    @Test
    void testSetWidth() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(6.5);
        assertEquals(6.5, rectangle.getWidth(), 0.01);
    }

    @Test
    void testSetLength() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(8.0);
        assertEquals(8.0, rectangle.getLength(), 0.01);
    }

    @Test
    void testGetArea() {
        Rectangle rectangle = new Rectangle(2.0, 5.0);
        assertEquals(10.0, rectangle.getArea(), 0.01);
    }

    @Test
    void testGetPerimeter() {
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        assertEquals(14.0, rectangle.getPerimeter(), 0.01);
    }

    @Test
    void testToString() {
        Rectangle rectangle = new Rectangle(2.5, 4.5, "green", true);
        assertEquals("Rectangle[Shape[color=green, filled=true], width=2.5, length=4.5]", rectangle.toString());
    }
}
