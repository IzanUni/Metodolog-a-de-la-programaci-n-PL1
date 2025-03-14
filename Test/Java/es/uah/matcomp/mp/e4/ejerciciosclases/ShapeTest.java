package es.uah.matcomp.mp.e4.ejerciciosclases;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @org.junit.jupiter.api.Test
    void testDefaultConstructor() {
        Circle shape = new Circle(); // Usamos Circle porque Shape es abstracta
        assertEquals("red", shape.getColor());
        assertTrue(shape.isFilled());
    }

    @org.junit.jupiter.api.Test
    void testParameterizedConstructor() {
        Circle shape = new Circle(2.0, "blue", false);
        assertEquals("blue", shape.getColor());
        assertFalse(shape.isFilled());
    }

    @org.junit.jupiter.api.Test
    void testSetColor() {
        Circle shape = new Circle();
        shape.setColor("yellow");
        assertEquals("yellow", shape.getColor());
    }

    @org.junit.jupiter.api.Test
    void testSetFilled() {
        Circle shape = new Circle();
        shape.setFilled(false);
        assertFalse(shape.isFilled());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Circle shape = new Circle(3.0, "green", true);
        assertEquals("Circle[ Shape[color=green, filled=true],radius=3.0 ]", shape.toString());
    }
}
