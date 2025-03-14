package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testDefaultConstructor() {
        Square square = new Square();
        assertEquals(1.0, square.getSide(), 0.01);
        assertEquals("red", square.getColor());
        assertTrue(square.isFilled());
    }

    @Test
    void testConstructorWithSide() {
        Square square = new Square(5.0);
        assertEquals(5.0, square.getSide(), 0.01);
        assertEquals("red", square.getColor());
        assertTrue(square.isFilled());
    }

    @Test
    void testConstructorWithSideColorAndFilled() {
        Square square = new Square(4.5, "blue", false);
        assertEquals(4.5, square.getSide(), 0.01);
        assertEquals("blue", square.getColor());
        assertFalse(square.isFilled());
    }

    @Test
    void testGetSide() {
        Square square = new Square(3.0);
        assertEquals(3.0, square.getSide(), 0.01);
    }

    @Test
    void testSetSide() {
        Square square = new Square();
        square.setSide(6.5);
        assertEquals(6.5, square.getSide(), 0.01);
    }

    @Test
    void testGetArea() {
        Square square = new Square(4.0);
        assertEquals(16.0, square.getArea(), 0.01);
    }

    @Test
    void testGetPerimeter() {
        Square square = new Square(4.0);
        assertEquals(16.0, square.getPerimeter(), 0.01);
    }

    @Test
    void testToString() {
        Square square = new Square(3.0, "green", true);
        assertEquals("Square[Rectangle[Shape[color=green,filled=true], width=3.0, length=3.0]]", square.toString());
    }
}