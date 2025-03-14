import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineaFacturaTest {

    @Test
    void getId() {
        LineaFactura Factura = new LineaFactura("Gonza", "15%", 25, 20);
        assertEquals(Factura.getId(), "Gonza");
    }

    @Test
    void getDesc() {
        LineaFactura Factura = new LineaFactura("Gonza", "15%", 25, 20);
        assertEquals(Factura.getDesc(), "15%");
    }

    @Test
    void getQti() {
        LineaFactura Factura = new LineaFactura("Gonza", "15%", 25, 20);
        assertEquals(Factura.getQti(), 25);
    }

    @Test
    void setQti() {
        LineaFactura Factura = new LineaFactura("Gonza", "15%", 25, 20);
        Factura.setQti(25);
        assertEquals(Factura.getQti(), 25);
    }

    @Test
    void getUnitPrice() {
        LineaFactura Factura = new LineaFactura("Gonza", "15%", 25, 20);
        assertEquals(Factura.getUnitPrice(), 20);
    }

    @Test
    void setUnitPrice() {
        LineaFactura Factura = new LineaFactura("Gonza", "15%", 25, 20);
        Factura.setUnitPrice(20);
        assertEquals(Factura.getUnitPrice(), 20);
    }

    @Test
    void getTotal() {
        LineaFactura Factura = new LineaFactura("Gonza", "15%", 25, 20);
        assertEquals(Factura.getTotal(), Factura.getUnitPrice() * Factura.getQti());
    }

    @Test
    void testToString() {
        LineaFactura Factura = new LineaFactura("Gonza", "15%", 25, 20);
        assertEquals(Factura.toString(), "LineaFactura[id=Gonza, desc=15%, qti=25, unitPrice=20.0]");
    }
}