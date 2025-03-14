package es.uah.matcomp.mp.e4.ejerciciosclases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MovablePointTest {

    @Test
    void testConstructor() {
        MovablePoint point = new MovablePoint(3, 4, 2, 2);
        assertEquals("(3,4) Speed=(2,2)", point.toString());
    }

    @Test
    void testMoveUp() {
        MovablePoint point = new MovablePoint(3, 4, 2, 2);
        point.MoveUp();
        assertEquals("(3,2) Speed=(2,2)", point.toString());
    }

    @Test
    void testMoveDown() {
        MovablePoint point = new MovablePoint(3, 4, 2, 2);
        point.MoveDown();
        assertEquals("(3,6) Speed=(2,2)", point.toString());
    }

    @Test
    void testMoveLeft() {
        MovablePoint point = new MovablePoint(3, 4, 2, 2);
        point.MoveLeft();
        assertEquals("(1,4) Speed=(2,2)", point.toString());
    }

    @Test
    void testMoveRight() {
        MovablePoint point = new MovablePoint(3, 4, 2, 2);
        point.MoveRight();
        assertEquals("(5,4) Speed=(2,2)", point.toString());
    }

    @Test
    void testToString() {
        MovablePoint point = new MovablePoint(5, 7, 3, 4);
        assertEquals("(5,7) Speed=(3,4)", point.toString());
    }
}
