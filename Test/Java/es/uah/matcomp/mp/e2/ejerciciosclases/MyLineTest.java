package es.uah.matcomp.mp.e2.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {

    @Test
    void testGetBegin() {
        Mypoint begin = new Mypoint(1, 2);
        Mypoint end = new Mypoint(3, 4);
        MyLine line = new MyLine(begin, end);
        assertEquals(begin, line.getBegin());
    }

    @Test
    void testSetBegin() {
        MyLine line = new MyLine(0, 0, 5, 5);
        Mypoint newBegin = new Mypoint(2, 3);
        line.setBegin(newBegin);
        assertEquals(newBegin, line.getBegin());
    }

    @Test
    void testGetEnd() {
        Mypoint begin = new Mypoint(1, 2);
        Mypoint end = new Mypoint(3, 4);
        MyLine line = new MyLine(begin, end);
        assertEquals(end, line.getEnd());
    }

    @Test
    void testSetEnd() {
        MyLine line = new MyLine(0, 0, 5, 5);
        Mypoint newEnd = new Mypoint(6, 7);
        line.setEnd(newEnd);
        assertEquals(newEnd, line.getEnd());
    }

    @Test
    void testGetBeginX() {
        MyLine line = new MyLine(3, 4, 7, 8);
        assertEquals(3, line.getBeginX());
    }

    @Test
    void testSetBeginX() {
        MyLine line = new MyLine(1, 1, 5, 5);
        line.setBeginX(10);
        assertEquals(10, line.getBeginX());
    }

    @Test
    void testGetBeginY() {
        MyLine line = new MyLine(3, 4, 7, 8);
        assertEquals(4, line.getBeginY());
    }

    @Test
    void testSetBeginY() {
        MyLine line = new MyLine(1, 1, 5, 5);
        line.setBeginY(20);
        assertEquals(20, line.getBeginY());
    }

    @Test
    void testGetEndX() {
        MyLine line = new MyLine(3, 4, 7, 8);
        assertEquals(7, line.getEndX());
    }

    @Test
    void testSetEndX() {
        MyLine line = new MyLine(1, 1, 5, 5);
        line.setEndX(15);
        assertEquals(15, line.getEndX());
    }

    @Test
    void testGetEndY() {
        MyLine line = new MyLine(3, 4, 7, 8);
        assertEquals(8, line.getEndY());
    }

    @Test
    void testSetEndY() {
        MyLine line = new MyLine(1, 1, 5, 5);
        line.setEndY(25);
        assertEquals(25, line.getEndY());
    }

    @Test
    void testGetBeginXY() {
        MyLine line = new MyLine(5, 6, 10, 12);
        assertArrayEquals(new int[]{5, 6}, line.getBeginXY());
    }

    @Test
    void testSetBeginXY() {
        MyLine line = new MyLine(1, 1, 5, 5);
        line.setBeginXY(12, 14);
        assertArrayEquals(new int[]{12, 14}, line.getBeginXY());
    }

    @Test
    void testGetEndXY() {
        MyLine line = new MyLine(5, 6, 10, 12);
        assertArrayEquals(new int[]{10, 12}, line.getEndXY());
    }

    @Test
    void testSetEndXY() {
        MyLine line = new MyLine(1, 1, 5, 5);
        line.setEndXY(18, 20);
        assertArrayEquals(new int[]{18, 20}, line.getEndXY());
    }

    @Test
    void testGetLength() {
        MyLine line = new MyLine(0, 0, 3, 4); // Distancia entre (0,0) y (3,4) = 5.0
        assertEquals(5.0, line.getLength(), 0.01);
    }

    @Test
    void testGetGradient() {
        MyLine line = new MyLine(0, 0, 3, 3);
        assertEquals(Math.atan2(3, 3), line.getGradient(), 0.01);
    }

    @Test
    void testToString() {
        MyLine line = new MyLine(3, 4, 7, 8);
        assertEquals("MyLine[Begin=(3,4), End=(7,8)]", line.toString());
    }
}