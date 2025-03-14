package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Point3DTest {

    @Test
    void testDefaultConstructor() {
        Point3D point = new Point3D();
        assertEquals(0.0f, point.getX(), 0.01);
        assertEquals(0.0f, point.getY(), 0.01);
        assertEquals(0.0f, point.getZ(), 0.01);
    }

    @Test
    void testConstructorWithParameters() {
        Point3D point = new Point3D(3.5f, 7.2f, 1.8f);
        assertEquals(3.5f, point.getX(), 0.01);
        assertEquals(7.2f, point.getY(), 0.01);
        assertEquals(1.8f, point.getZ(), 0.01);
    }

    @Test
    void testGetZ() {
        Point3D point = new Point3D(4.4f, 2.3f, 5.6f);
        assertEquals(5.6f, point.getZ(), 0.01);
    }

    @Test
    void testSetZ() {
        Point3D point = new Point3D();
        point.setZ(9.1f);
        assertEquals(9.1f, point.getZ(), 0.01);
    }

    @Test
    void testSetXYZ() {
        Point3D point = new Point3D();
        point.setXYZ(1.2f, 4.5f, 7.3f);
        assertEquals(1.2f, point.getX(), 0.01);
        assertEquals(4.5f, point.getY(), 0.01);
        assertEquals(7.3f, point.getZ(), 0.01);
    }

    @Test
    void testGetXYZ() {
        Point3D point = new Point3D(2.5f, 8.3f, 4.2f);
        assertArrayEquals(new float[]{2.5f, 8.3f, 4.2f}, point.getXYZ(), 0.01f);
    }

    @Test
    void testToString() {
        Point3D point = new Point3D(5.6f, 3.9f, 2.2f);
        assertEquals("(5.6, 3.9, 2.2)", point.toString());
    }
}