import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BallTest {

    @Test
    void testGetX() {
        Ball ball = new Ball(5.0f, 10.0f, 3, 1.0f, 2.0f); // Crear un objeto Ball
        assertEquals(5.0f, ball.getX()); // Verificar que la coordenada X es 5.0
    }

    @Test
    void testSetX() {
        Ball ball = new Ball(5.0f, 10.0f, 3, 1.0f, 2.0f); // Crear un objeto Ball
        ball.setX(7.0f); // Cambiar la coordenada X a 7.0
        assertEquals(7.0f, ball.getX()); // Verificar que la coordenada X ha cambiado a 7.0
    }

    @Test
    void testGetY() {
        Ball ball = new Ball(5.0f, 10.0f, 3, 1.0f, 2.0f); // Crear un objeto Ball
        assertEquals(10.0f, ball.getY()); // Verificar que la coordenada Y es 10.0
    }

    @Test
    void testSetY() {
        Ball ball = new Ball(5.0f, 10.0f, 3, 1.0f, 2.0f); // Crear un objeto Ball
        ball.setY(12.0f); // Cambiar la coordenada Y a 12.0
        assertEquals(12.0f, ball.getY()); // Verificar que la coordenada Y ha cambiado a 12.0
    }

    @Test
    void testGetRadius() {
        Ball ball = new Ball(5.0f, 10.0f, 3, 1.0f, 2.0f); // Crear un objeto Ball
        assertEquals(3, ball.getRadius()); // Verificar que el radio es 3
    }

    @Test
    void testSetRadius() {
        Ball ball = new Ball(5.0f, 10.0f, 3, 1.0f, 2.0f); // Crear un objeto Ball
        ball.setRadius(5); // Cambiar el radio a 5
        assertEquals(5, ball.getRadius()); // Verificar que el radio se ha cambiado a 5
    }

    @Test
    void testGetXDelta() {
        Ball ball = new Ball(5.0f, 10.0f, 3, 1.0f, 2.0f); // Crear un objeto Ball
        assertEquals(1.0f, ball.getXDelta()); // Verificar que la velocidad en X es 1.0
    }

    @Test
    void testSetXDelta() {
        Ball ball = new Ball(5.0f, 10.0f, 3, 1.0f, 2.0f); // Crear un objeto Ball
        ball.setXDelta(3.0f); // Cambiar la velocidad en X a 3.0
        assertEquals(3.0f, ball.getXDelta()); // Verificar que la velocidad en X se ha cambiado a 3.0
    }

    @Test
    void testGetYDelta() {
        Ball ball = new Ball(5.0f, 10.0f, 3, 1.0f, 2.0f); // Crear un objeto Ball
        assertEquals(2.0f, ball.getYDelta()); // Verificar que la velocidad en Y es 2.0
    }

    @Test
    void testSetYDelta() {
        Ball ball = new Ball(5.0f, 10.0f, 3, 1.0f, 2.0f); // Crear un objeto Ball
        ball.setYDelta(4.0f); // Cambiar la velocidad en Y a 4.0
        assertEquals(4.0f, ball.getYDelta()); // Verificar que la velocidad en Y se ha cambiado a 4.0
    }

    @Test
    void testMove() {
        Ball ball = new Ball(5.0f, 10.0f, 3, 1.0f, 2.0f); // Crear un objeto Ball
        ball.move(); // Mover la pelota
        assertEquals(6.0f, ball.getX()); // Verificar que la coordenada X se ha movido a 6.0
        assertEquals(12.0f, ball.getY()); // Verificar que la coordenada Y se ha movido a 12.0
    }

    @Test
    void testReflectHorizontal() {
        Ball ball = new Ball(5.0f, 10.0f, 3, 1.0f, 2.0f); // Crear un objeto Ball
        ball.reflectHorizontal(); // Reflejar horizontalmente
        assertEquals(-1.0f, ball.getXDelta()); // Verificar que la velocidad en X se ha invertido
    }

    @Test
    void testReflectVertical() {
        Ball ball = new Ball(5.0f, 10.0f, 3, 1.0f, 2.0f); // Crear un objeto Ball
        ball.reflectVertical(); // Reflejar verticalmente
        assertEquals(-2.0f, ball.getYDelta()); // Verificar que la velocidad en Y se ha invertido
    }

    @Test
    void testToString() {
        Ball ball = new Ball(5.0f, 10.0f, 3, 1.0f, 2.0f); // Crear un objeto Ball
        assertEquals("Ball[(5.0,10.0), speed=(1.0,2.0)]", ball.toString()); // Verificar que el formato es correcto
    }
}
