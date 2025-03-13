package es.uah.matcomp.mp.e2.ejerciciosclases;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {
    //Pruebo la función getradius que me devuelve el valor del radio del circulo creado
    @org.junit.jupiter.api.Test
    void getRadius() {
        MyCircle c1 = new MyCircle();
        assertEquals(c1.getRadius(), 1);

    }
    //Pruebo la función setRadius
    @org.junit.jupiter.api.Test
    void setRadius() {
        MyCircle c1 = new MyCircle();
        c1.setRadius(2);
        assertEquals(c1.getRadius(), 2);
    }

    @org.junit.jupiter.api.Test
    void getCenterX() {
        MyCircle c1 = new MyCircle();
        assertEquals(c1.getCenterX(), 0);
    }

    @org.junit.jupiter.api.Test
    void setCenterX() {
        MyCircle c1 = new MyCircle();
        c1.setCenterX(2);
        assertEquals(c1.getCenterX(), 2);
    }

    @org.junit.jupiter.api.Test
    void getCenterY() {
        MyCircle c1 = new MyCircle();
        assertEquals(c1.getCenterY(), 0);
    }

    @org.junit.jupiter.api.Test
    void setCenterY() {
        MyCircle c1 = new MyCircle();
        c1.setCenterY(2);
        assertEquals(c1.getCenterY(), 2);
    }

    @org.junit.jupiter.api.Test
    void getCenterXY() {
        MyCircle c1 = new MyCircle();
        int[] expected = {0, 0};
        assertArrayEquals(expected,c1.getCenterXY());
    }


    @org.junit.jupiter.api.Test
    void setCenterXY() {
        MyCircle c1 = new MyCircle();
        c1.setCenterXY(2,2);
        int[] expected = {2, 2};
        assertArrayEquals(expected,c1.getCenterXY());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        MyCircle c1 = new MyCircle();
        assertEquals(c1.toString(), "MyCircle[radius= 1, center= (0,0)]");

    }

    @org.junit.jupiter.api.Test
    void getArea() {
        MyCircle c1 = new MyCircle();
        assertEquals(c1.getArea(), Math.PI* c1.getRadius()*c1.getRadius());
    }

    @org.junit.jupiter.api.Test
    void getCircumference() {
        MyCircle c1 = new MyCircle();
        assertEquals(c1.getCircumference(), 2*Math.PI* c1.getRadius());
    }

    @org.junit.jupiter.api.Test
    void distance() {
        MyCircle c1 = new MyCircle();
        MyCircle c2 = new MyCircle();
        assertEquals(c1.distance(c2),0);
    }
}