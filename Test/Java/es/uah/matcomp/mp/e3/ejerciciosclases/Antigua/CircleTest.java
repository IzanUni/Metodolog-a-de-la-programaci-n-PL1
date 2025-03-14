package es.uah.matcomp.mp.e3.ejerciciosclases.Antigua;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testDefaultConstructor() {
        Circle circle = new Circle();
        assertEquals(1.0, circle.getRadius(), 0.01);
        assertEquals("red", circle.getColor());
    }

    @Test
    void testConstructorWithRadius() {
        Circle circle = new Circle(5.0);
        assertEquals(5.0, circle.getRadius(), 0.01);
        assertEquals("red", circle.getColor());
    }

    @Test
    void testConstructorWithRadiusAndColor() {
        Circle circle = new Circle(3.5, "blue");
        assertEquals(3.5, circle.getRadius(), 0.01);
        assertEquals("blue", circle.getColor());
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
    void testGetColor() {
        Circle circle = new Circle(3.0, "green");
        assertEquals("green", circle.getColor());
    }

    @Test
    void testSetColor() {
        Circle circle = new Circle();
        circle.setColor("yellow");
        assertEquals("yellow", circle.getColor());
    }

    @Test
    void testGetArea() {
        Circle circle = new Circle(2.0);
        assertEquals(Math.PI * 2.0 * 2.0, circle.getArea(), 0.01);
    }

    @Test
    void testToString() {
        Circle circle = new Circle(2.0, "red");
        assertEquals("Circle[radius=2.0,color=red]", circle.toString());
    }
}