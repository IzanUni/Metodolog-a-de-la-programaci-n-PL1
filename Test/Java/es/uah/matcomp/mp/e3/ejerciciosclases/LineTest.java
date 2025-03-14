package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void testConstructorWithPoints() {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(5, 6);
        Line line = new Line(p1, p2);

        assertEquals(p1, line.getBegin());
        assertEquals(p2, line.getEnd());
    }

    @Test
    void testConstructorWithCoordinates() {
        Line line = new Line(1, 2, 4, 5);

        assertEquals(1, line.getBeginX(), 0.01);
        assertEquals(2, line.getBeginY(), 0.01);
        assertEquals(4, line.getEndX(), 0.01);
        assertEquals(5, line.getEndY(), 0.01);
    }

    @Test
    void testSetBegin() {
        Line line = new Line(1, 2, 4, 5);
        Point newBegin = new Point(10, 20);
        line.setBegin(newBegin);

        assertEquals(10, line.getBeginX(), 0.01);
        assertEquals(20, line.getBeginY(), 0.01);
    }

    @Test
    void testSetEnd() {
        Line line = new Line(1, 2, 4, 5);
        Point newEnd = new Point(8, 9);
        line.setEnd(newEnd);

        assertEquals(8, line.getEndX(), 0.01);
        assertEquals(9, line.getEndY(), 0.01);
    }

    @Test
    void testSetBeginXY() {
        Line line = new Line(1, 2, 4, 5);
        line.setBeginXY(7, 8);

        assertEquals(7, line.getBeginX(), 0.01);
        assertEquals(8, line.getBeginY(), 0.01);
    }

    @Test
    void testSetEndXY() {
        Line line = new Line(1, 2, 4, 5);
        line.setEndXY(9, 10);

        assertEquals(9, line.getEndX(), 0.01);
        assertEquals(10, line.getEndY(), 0.01);
    }

    @Test
    void testGetLength() {
        Line line = new Line(1, 1, 4, 5);
        assertEquals(5.0, line.getLength(), 0.01);
    }

    @Test
    void testGetGradient() {
        Line line = new Line(1, 1, 4, 5);
        assertEquals(Math.atan2(4, 3), line.getGradient(), 0.01);
    }

    @Test
    void testToString() {
        Line line = new Line(1, 1, 4, 5);
        assertEquals("Line[begin=(1.0, 1.0), end=(4.0, 5.0)]", line.toString());
    }
}