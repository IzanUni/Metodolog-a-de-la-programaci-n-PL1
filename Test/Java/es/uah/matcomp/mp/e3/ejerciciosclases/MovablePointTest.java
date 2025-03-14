package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void testDefaultConstructor() {
        MovablePoint point = new MovablePoint();
        assertEquals(0.0f, point.getX(), 0.01);
        assertEquals(0.0f, point.getY(), 0.01);
        assertEquals(0.0f, point.getXSpeed(), 0.01);
        assertEquals(0.0f, point.getYSpeed(), 0.01);
    }

    @Test
    void testConstructorWithSpeed() {
        MovablePoint point = new MovablePoint(2.5f, 3.5f);
        assertEquals(0.0f, point.getX(), 0.01);
        assertEquals(0.0f, point.getY(), 0.01);
        assertEquals(2.5f, point.getXSpeed(), 0.01);
        assertEquals(3.5f, point.getYSpeed(), 0.01);
    }

    @Test
    void testConstructorWithPositionAndSpeed() {
        MovablePoint point = new MovablePoint(1.5f, 2.5f, 3.0f, 4.0f);
        assertEquals(1.5f, point.getX(), 0.01);
        assertEquals(2.5f, point.getY(), 0.01);
        assertEquals(3.0f, point.getXSpeed(), 0.01);
        assertEquals(4.0f, point.getYSpeed(), 0.01);
    }

    @Test
    void testGetXSpeed() {
        MovablePoint point = new MovablePoint(5.5f, 6.5f);
        assertEquals(5.5f, point.getXSpeed(), 0.01);
    }

    @Test
    void testSetXSpeed() {
        MovablePoint point = new MovablePoint();
        point.setXSpeed(8.2f);
        assertEquals(8.2f, point.getXSpeed(), 0.01);
    }

    @Test
    void testGetYSpeed() {
        MovablePoint point = new MovablePoint(4.2f, 7.3f);
        assertEquals(7.3f, point.getYSpeed(), 0.01);
    }

    @Test
    void testSetYSpeed() {
        MovablePoint point = new MovablePoint();
        point.setYSpeed(9.8f);
        assertEquals(9.8f, point.getYSpeed(), 0.01);
    }

    @Test
    void testSetSpeed() {
        MovablePoint point = new MovablePoint();
        point.setSpeed(3.1f, 4.5f);
        assertEquals(3.1f, point.getXSpeed(), 0.01);
        assertEquals(4.5f, point.getYSpeed(), 0.01);
    }

    @Test
    void testGetSpeed() {
        MovablePoint point = new MovablePoint(3.3f, 6.6f);
        assertArrayEquals(new float[]{3.3f, 6.6f}, point.getSpeed(), 0.01f);
    }

    @Test
    void testMove() {
        MovablePoint point = new MovablePoint(2.0f, 3.0f, 1.0f, 1.5f);
        point.move();
        assertEquals(3.0f, point.getX(), 0.01);
        assertEquals(4.5f, point.getY(), 0.01);
    }

    @Test
    void testToString() {
        MovablePoint point = new MovablePoint(2.5f, 3.5f, 4.0f, 5.0f);
        assertEquals("(2.5, 3.5),Speed=(4.0,5.0)", point.toString());
    }
}