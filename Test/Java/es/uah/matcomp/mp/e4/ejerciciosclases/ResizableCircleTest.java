package es.uah.matcomp.mp.e4.ejerciciosclases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ResizableCircleTest {

    @Test
    void testConstructor() {
        ResizableCircle circle = new ResizableCircle(5.0);
        assertEquals(5.0, circle.getRadius(), 0.01);
    }

    @Test
    void testResizeIncrease() {
        ResizableCircle circle = new ResizableCircle(10.0);
        circle.resize(150); // Aumenta el tamaño en un 150% (1.5 veces)
        assertEquals(15.0, circle.getRadius(), 0.01);
    }

    @Test
    void testResizeDecrease() {
        ResizableCircle circle = new ResizableCircle(20.0);
        circle.resize(50); // Reduce el tamaño al 50%
        assertEquals(10.0, circle.getRadius(), 0.01);
    }

    @Test
    void testToString() {
        ResizableCircle circle = new ResizableCircle(7.0);
        assertEquals("ResizableCircle[Circle[ Shape[color=red, filled=true],radius=7.0 ]]", circle.toString());
    }
}
