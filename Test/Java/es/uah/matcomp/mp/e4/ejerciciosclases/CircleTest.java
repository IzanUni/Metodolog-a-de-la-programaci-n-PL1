package es.uah.matcomp.mp.e4.ejerciciosclases;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @org.junit.jupiter.api.Test
    void getRadius() {
        Circle circle = new Circle(3.5);
        assertEquals(3.5, circle.getRadius(), 0.01);
    }

    @org.junit.jupiter.api.Test
    void setRadius() {
        Circle circle = new Circle();
        circle.setRadius(5.5);
        assertEquals(5.5, circle.getRadius(), 0.01);
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        Circle circle = new Circle(2.0);
        assertEquals(Math.PI * 4, circle.getArea(), 0.01);
    }

    @org.junit.jupiter.api.Test
    void getPerimeter() {
        Circle circle = new Circle(3.0);
        assertEquals(2 * Math.PI * 3, circle.getPerimeter(), 0.01);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Circle circle = new Circle(2.5, "green", true);
        assertEquals("Circle[ Shape[color=green, filled=true],radius=2.5 ]", circle.toString());
    }
}