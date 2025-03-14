package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    @Test
    void testDefaultConstructor() {
        Cylinder cylinder = new Cylinder();
        assertEquals(1.0, cylinder.getRadius(), 0.01);
        assertEquals("red", cylinder.getColor());
        assertEquals(1.0, cylinder.getHeight(), 0.01);
    }

    @Test
    void testConstructorWithHeight() {
        Cylinder cylinder = new Cylinder(5.0);
        assertEquals(1.0, cylinder.getRadius(), 0.01); // Hereda radio por defecto de Circle
        assertEquals("red", cylinder.getColor());
        assertEquals(5.0, cylinder.getHeight(), 0.01);
    }

    @Test
    void testConstructorWithRadiusAndHeight() {
        Cylinder cylinder = new Cylinder(3.5, 7.0);
        assertEquals(3.5, cylinder.getRadius(), 0.01);
        assertEquals("red", cylinder.getColor());
        assertEquals(7.0, cylinder.getHeight(), 0.01);
    }

    @Test
    void testGetHeight() {
        Cylinder cylinder = new Cylinder(10.0);
        assertEquals(10.0, cylinder.getHeight(), 0.01);
    }

    @Test
    void testGetVolume() {
        Cylinder cylinder = new Cylinder(2.0, 5.0);
        assertEquals(Math.PI * 2.0 * 2.0 * 5.0, cylinder.getVolume(), 0.01);
    }

    @Test
    void testToString() {
        Cylinder cylinder = new Cylinder(2.0, 5.0);
        assertEquals("Cylinder: subclass of Circle[Shape[color=red,filled=true],radius=2.0] height:5.0", cylinder.toString());
    }
}