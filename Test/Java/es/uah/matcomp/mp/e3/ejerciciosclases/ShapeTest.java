package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void testDefaultConstructor() {
        Shape shape = new Shape();
        assertEquals("red", shape.getColor());
        assertTrue(shape.isFilled());
    }

    @Test
    void testConstructorWithParameters() {
        Shape shape = new Shape("blue", false);
        assertEquals("blue", shape.getColor());
        assertFalse(shape.isFilled());
    }

    @Test
    void testGetColor() {
        Shape shape = new Shape("green", true);
        assertEquals("green", shape.getColor());
    }

    @Test
    void testSetColor() {
        Shape shape = new Shape();
        shape.setColor("yellow");
        assertEquals("yellow", shape.getColor());
    }

    @Test
    void testIsFilled() {
        Shape shape = new Shape("black", false);
        assertFalse(shape.isFilled());
    }

    @Test
    void testSetFilled() {
        Shape shape = new Shape();
        shape.setFilled(false);
        assertFalse(shape.isFilled());
    }

    @Test
    void testToString() {
        Shape shape = new Shape("purple", true);
        assertEquals("Shape[color=purple,filled=true]", shape.toString());
    }
}