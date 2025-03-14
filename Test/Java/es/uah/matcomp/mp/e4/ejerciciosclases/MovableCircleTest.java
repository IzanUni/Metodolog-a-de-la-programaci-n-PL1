package es.uah.matcomp.mp.e4.ejerciciosclases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MovableCircleTest {

    @Test
    void testConstructor() {
        MovableCircle circle = new MovableCircle(3, 4, 2, 2, 5);
        assertEquals("(3,4) Speed=(2,2),radius=5", circle.toString());
    }

    @Test
    void testMoveUp() {
        MovableCircle circle = new MovableCircle(3, 4, 2, 2, 5);
        circle.moveUp();
        assertEquals("(3,2) Speed=(2,2),radius=5", circle.toString());
    }

    @Test
    void testMoveDown() {
        MovableCircle circle = new MovableCircle(3, 4, 2, 2, 5);
        circle.moveDown();
        assertEquals("(3,6) Speed=(2,2),radius=5", circle.toString());
    }

    @Test
    void testMoveLeft() {
        MovableCircle circle = new MovableCircle(3, 4, 2, 2, 5);
        circle.moveLeft();
        assertEquals("(1,4) Speed=(2,2),radius=5", circle.toString());
    }

    @Test
    void testMoveRight() {
        MovableCircle circle = new MovableCircle(3, 4, 2, 2, 5);
        circle.moveRight();
        assertEquals("(5,4) Speed=(2,2),radius=5", circle.toString());
    }

    @Test
    void testToString() {
        MovableCircle circle = new MovableCircle(5, 7, 3, 4, 10);
        assertEquals("(5,7) Speed=(3,4),radius=10", circle.toString());
    }
}
