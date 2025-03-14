package es.uah.matcomp.mp.e4.ejerciciosclases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void testDefaultConstructor() {
        Square square = new Square();
        assertEquals(1.0, square.getSide(), 0.01);
        assertEquals("red", square.getColor()); // Suponiendo que Shape tiene color "red" por defecto
        assertTrue(square.isFilled()); // Suponiendo que Shape tiene `filled = true` por defecto
    }

    @Test
    void testConstructorWithSide() {
        Square square = new Square(4.5);
        assertEquals(4.5, square.getSide(), 0.01);
    }

    @Test
    void testConstructorWithAllAttributes() {
        Square square = new Square(6.0, "blue", false);
        assertEquals(6.0, square.getSide(), 0.01);
        assertEquals("blue", square.getColor());
        assertFalse(square.isFilled());
    }

    @Test
    void testSetSide() {
        Square square = new Square();
        square.setSide(5.5);
        assertEquals(5.5, square.getSide(), 0.01);
    }

    @Test
    void testSetWidth() {
        Square square = new Square();
        square.setWidth(7.5);
        assertEquals(7.5, square.getSide(), 0.01);
    }

    @Test
    void testSetLength() {
        Square square = new Square();
        square.setLength(8.5);
        assertEquals(8.5, square.getLength(), 0.01);
    }

    @Test
    void testGetArea() {
        Square square = new Square(3.0);
        assertEquals(9.0, square.getArea(), 0.01);
    }

    @Test
    void testGetPerimeter() {
        Square square = new Square(4.0);
        assertEquals(16.0, square.getPerimeter(), 0.01);
    }

    @Test
    void testToString() {
        Square square = new Square(2.5, "green", true);
        assertEquals("Square[Rectangle[Shape[color=green, filled=true], width=2.5, length=2.5]]", square.toString());
    }
}
