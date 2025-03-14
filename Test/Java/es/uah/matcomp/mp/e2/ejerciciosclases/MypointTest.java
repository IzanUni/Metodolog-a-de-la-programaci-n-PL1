package es.uah.matcomp.mp.e2.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MypointTest {

    @Test
    void testGetX() {
        Mypoint point = new Mypoint(3, 5);
        assertEquals(3, point.getX());
    }

    @Test
    void testSetX() {
        Mypoint point = new Mypoint();
        point.setX(7);
        assertEquals(7, point.getX());
    }

    @Test
    void testGetY() {
        Mypoint point = new Mypoint(2, 8);
        assertEquals(8, point.getY());
    }

    @Test
    void testSetY() {
        Mypoint point = new Mypoint();
        point.setY(9);
        assertEquals(9, point.getY());
    }

    @Test
    void testGetXY() {
        Mypoint point = new Mypoint(4, 6);
        assertArrayEquals(new int[]{4, 6}, point.getXY());
    }

    @Test
    void testSetXY() {
        Mypoint point = new Mypoint();
        point.setXY(10, 15);
        assertArrayEquals(new int[]{10, 15}, point.getXY());
    }

    @Test
    void testToString() {
        Mypoint point = new Mypoint(5, 7);
        assertEquals("(5,7)", point.toString());
    }

    @Test
    void testDistanceToPoint() {
        Mypoint point1 = new Mypoint(3, 4);
        Mypoint point2 = new Mypoint(6, 8);
        assertEquals(5.0, point1.distance(point2), 0.01);
    }

    @Test
    void testDistanceToCoordinates() {
        Mypoint point = new Mypoint(3, 4);
        assertEquals(5.0, point.distance(6, 8), 0.01);
    }

    @Test
    void testDistanceToOrigin() {
        Mypoint point = new Mypoint(3, 4);
        assertEquals(5.0, point.distance(), 0.01);
    }
}