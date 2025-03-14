import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectanguloEj3Test {

    @Test
    void getLenght() {
        RectanguloEj3 Rectangulo = new RectanguloEj3();
        assertEquals(Rectangulo.getLenght(), 2.0f);
    }

    @Test
    void setLenght() {
        RectanguloEj3 Rectangulo = new RectanguloEj3();
        Rectangulo.setLenght(2.0f);
        assertEquals(Rectangulo.getLenght(), 2.0f);
    }

    @Test
    void getWidht() {
        RectanguloEj3 Rectangulo = new RectanguloEj3();
        assertEquals(Rectangulo.getWidht(), 3.0f);
    }

    @Test
    void setWidth() {
        RectanguloEj3 Rectangulo = new RectanguloEj3();
        Rectangulo.setLenght(3.0f);
        assertEquals(Rectangulo.getWidht(), 3.0f);
    }

    @Test
    void getArea() {
        RectanguloEj3 Rectangulo = new RectanguloEj3();
        assertEquals(Rectangulo.getArea(), Rectangulo.getLenght() * Rectangulo.getWidht());
    }

    @Test
    void getPerimeter() {
        RectanguloEj3 Rectangulo = new RectanguloEj3();
        assertEquals(Rectangulo.getPerimeter(), 2 * Rectangulo.getLenght() + 2 * Rectangulo.getWidht());
    }

    @Test
    void testToString() {
        RectanguloEj3 Rectangulo = new RectanguloEj3();
        assertEquals(Rectangulo.toString(), "Rectangule[lenght = 2.0, width = 3.0]");
    }
}