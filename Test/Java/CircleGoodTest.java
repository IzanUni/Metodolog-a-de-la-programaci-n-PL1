import static org.junit.jupiter.api.Assertions.*;

class CircleGoodTest {

    //Pruebo la función getradius que me devuelve el valor del radio del circulo creado
    @org.junit.jupiter.api.Test
    void getRadius() {
        CircleGood circle = new CircleGood();
        assertEquals(circle.getRadius(),1);
    }

    //Pruebo la funcion setRadius
    @org.junit.jupiter.api.Test
    void setRadius() {
        CircleGood circle = new CircleGood();
        circle.setRadius(2);
        assertEquals(circle.getRadius(),2);
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        CircleGood circle = new CircleGood();
        assertEquals(circle.getArea(), Math.PI * circle.getRadius() * circle.getRadius());
    }

    @org.junit.jupiter.api.Test
    void getPerimeter() {
        CircleGood circle = new CircleGood();
        assertEquals(circle.getPerimeter(), 2 * Math.PI * circle.getRadius());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        CircleGood circle = new CircleGood();
        assertEquals(circle.toString(), "CircleGood[radius=1.0]");
    }
}