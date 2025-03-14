package es.uah.matcomp.mp.e2.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @Test
    void testToString() {
        MyTriangle triangle = new MyTriangle(1, 1, 4, 1, 2, 3);
        assertEquals("MyTriangle[v1=(1,1), v2=(4,1), v3=(2,3)]", triangle.toString());
    }

    @Test
    void testGetPerimeter() {
        MyTriangle triangle = new MyTriangle(0, 0, 3, 0, 0, 4);
        assertEquals(12.0, triangle.getPerimeter(), 0.01); // 3 + 4 + 5 = 12
    }

    @Test
    void testGetTypeEquilateral() {
        MyTriangle triangle = new MyTriangle(0, 0, 0, 0, 0, 0);
        assertEquals("Equilateral", triangle.getType());
    }

    @Test
    void testGetTypeIsosceles() {
        MyTriangle triangle = new MyTriangle(0, 0, 3, 3, 6, 0);
        assertEquals("Isosceles", triangle.getType());
    }

    @Test
    void testGetTypeScalene() {
        MyTriangle triangle = new MyTriangle(0, 0, 2, 5, 6, 1);
        assertEquals("Scalene", triangle.getType());
    }
}