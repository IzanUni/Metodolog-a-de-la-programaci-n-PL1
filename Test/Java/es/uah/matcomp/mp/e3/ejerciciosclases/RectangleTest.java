package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testDefaultConstructor() {
        Rectangle rectangle = new Rectangle();
        assertEquals(1.0, rectangle.getWidth(), 0.01);
        assertEquals(1.0, rectangle.getLength(), 0.01);
        assertEquals("red", rectangle.getColor());
        assertTrue(rectangle.isFilled());
    }

    @Test
    void testConstructorWithWidthAndLength() {
        Rectangle rectangle = new Rectangle(5.0, 7.5);
        assertEquals(5.0, rectangle.getWidth(), 0.01);
        assertEquals(7.5, rectangle.getLength(), 0.01);
        assertEquals("red", rectangle.getColor()); // Usa el constructor de `Shape`
        assertTrue(rectangle.isFilled());
    }

    @Test
    void testConstructorWithWidthLengthColorAndFilled() {
        Rectangle rectangle = new Rectangle(4.5, 8.0, "blue", false);
        assertEquals(4.5, rectangle.getWidth(), 0.01);
        assertEquals(8.0, rectangle.getLength(), 0.01);
        assertEquals("blue", rectangle.getColor());
        assertFalse(rectangle.isFilled());
    }

    @Test
    void testGetWidth() {
        Rectangle rectangle = new Rectangle(2.0, 3.5);
        assertEquals(2.0, rectangle.getWidth(), 0.01);
    }

    @Test
    void testSetWidth() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(6.5);
        assertEquals(6.5, rectangle.getWidth(), 0.01);
    }

    @Test
    void testGetLength() {
        Rectangle rectangle = new Rectangle(2.5, 4.0);
        assertEquals(4.0, rectangle.getLength(), 0.01);
    }

    @Test
    void testSetLength() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5.5);
        assertEquals(5.5, rectangle.getLength(), 0.01);
    }

    @Test
    void testGetArea() {
        Rectangle rectangle = new Rectangle(3.0, 6.0);
        assertEquals(18.0, rectangle.getArea(), 0.01);
    }

    @Test
    void testGetPerimeter() {
        Rectangle rectangle = new Rectangle(3.0, 6.0);
        assertEquals(18.0, rectangle.getPerimeter(), 0.01);
    }

    @Test
    void testToString() {
        Rectangle rectangle = new Rectangle(3.0, 6.0, "green", true);
        assertEquals("Rectangle[Shape[color=green,filled=true], width=3.0, length=6.0]", rectangle.toString());
    }
}