package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testDefaultConstructor() {
        Circle circle = new Circle();
        assertEquals(1.0, circle.getRadius(), 0.01);
        assertEquals("red", circle.getColor());
        assertTrue(circle.isFilled());
    }

    @Test
    void testConstructorWithRadius() {
        Circle circle = new Circle(5.0);
        assertEquals(5.0, circle.getRadius(), 0.01);
        assertEquals("red", circle.getColor()); // Usa el constructor de `Shape`
        assertTrue(circle.isFilled());
    }

    @Test
    void testConstructorWithRadiusColorAndFilled() {
        Circle circle = new Circle(3.5, "blue", false);
        assertEquals(3.5, circle.getRadius(), 0.01);
        assertEquals("blue", circle.getColor());
        assertFalse(circle.isFilled());
    }

    @Test
    void testGetRadius() {
        Circle circle = new Circle(2.0);
        assertEquals(2.0, circle.getRadius(), 0.01);
    }

    @Test
    void testSetRadius() {
        Circle circle = new Circle();
        circle.setRadius(4.5);
        assertEquals(4.5, circle.getRadius(), 0.01);
    }

    @Test
    void testGetArea() {
        Circle circle = new Circle(2.0);
        assertEquals(Math.PI * 2.0 * 2.0, circle.getArea(), 0.01);
    }

    @Test
    void testGetPerimeter() {
        Circle circle = new Circle(2.0);
        assertEquals(2 * Math.PI * 2.0, circle.getPerimeter(), 0.01);
    }

    @Test
    void testToString() {
        Circle circle = new Circle(2.0, "red", true);
        assertEquals("Circle[Shape[color=red,filled=true],radius=2.0]", circle.toString());
    }
}