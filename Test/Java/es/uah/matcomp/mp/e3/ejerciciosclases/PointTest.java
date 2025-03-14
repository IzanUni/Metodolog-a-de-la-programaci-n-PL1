package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void testDefaultConstructor() {
        Point point = new Point();
        assertEquals(0.0f, point.getX(), 0.01);
        assertEquals(0.0f, point.getY(), 0.01);
    }

    @Test
    void testConstructorWithParameters() {
        Point point = new Point(3.5f, 7.2f);
        assertEquals(3.5f, point.getX(), 0.01);
        assertEquals(7.2f, point.getY(), 0.01);
    }

    @Test
    void testGetX() {
        Point point = new Point(4.4f, 2.3f);
        assertEquals(4.4f, point.getX(), 0.01);
    }

    @Test
    void testSetX() {
        Point point = new Point();
        point.setX(9.1f);
        assertEquals(9.1f, point.getX(), 0.01);
    }

    @Test
    void testGetY() {
        Point point = new Point(6.7f, 5.8f);
        assertEquals(5.8f, point.getY(), 0.01);
    }

    @Test
    void testSetY() {
        Point point = new Point();
        point.setY(3.3f);
        assertEquals(3.3f, point.getY(), 0.01);
    }

    @Test
    void testSetXY() {
        Point point = new Point();
        point.setXY(1.2f, 4.5f);
        assertEquals(1.2f, point.getX(), 0.01);
        assertEquals(4.5f, point.getY(), 0.01);
    }

    @Test
    void testGetXY() {
        Point point = new Point(2.5f, 8.3f);
        assertArrayEquals(new float[]{2.5f, 8.3f}, point.getXY(), 0.01f);
    }

    @Test
    void testToString() {
        Point point = new Point(5.6f, 3.9f);
        assertEquals("(5.6, 3.9)", point.toString());
    }
}