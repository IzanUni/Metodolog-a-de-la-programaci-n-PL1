package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    @Test
    void testDefaultConstructor() {
        Cylinder cylinder = new Cylinder();
        assertEquals(1.0, cylinder.getRadius(), 0.01);
        assertEquals(1.0, cylinder.getHeight(), 0.01);
        assertEquals("red", cylinder.getColor());
    }

    @Test
    void testConstructorWithHeight() {
        Cylinder cylinder = new Cylinder(5.0);
        assertEquals(1.0, cylinder.getRadius(), 0.01);
        assertEquals(5.0, cylinder.getHeight(), 0.01);
        assertEquals("red", cylinder.getColor());
    }

    @Test
    void testConstructorWithRadiusAndHeight() {
        Cylinder cylinder = new Cylinder(3.0, 7.5);
        assertEquals(3.0, cylinder.getRadius(), 0.01);
        assertEquals(7.5, cylinder.getHeight(), 0.01);
        assertEquals("red", cylinder.getColor());
    }

    @Test
    void testGetHeight() {
        Cylinder cylinder = new Cylinder(4.5);
        assertEquals(4.5, cylinder.getHeight(), 0.01);
    }

    @Test
    void testGetVolume() {
        Cylinder cylinder = new Cylinder(2.0, 5.0);
        assertEquals(Math.PI * 2.0 * 2.0 * 5.0, cylinder.getVolume(), 0.01);
    }

    @Test
    void testToString() {
        Cylinder cylinder = new Cylinder(2.0, 4.0);
        assertEquals("Cylinder: subclass of Circle[Shape[color=red,filled=true],radius=2.0] height:4.0", cylinder.toString());
    }
}