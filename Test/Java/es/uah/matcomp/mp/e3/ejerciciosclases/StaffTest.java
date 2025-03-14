package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void testConstructor() {
        Staff staff = new Staff("David", "Calle Principal 123", "UAH", 2500.50);
        assertEquals("David", staff.getName());
        assertEquals("Calle Principal 123", staff.getAddress());
        assertEquals("UAH", staff.getSchool());
        assertEquals(2500.50, staff.getPay(), 0.01);
    }

    @Test
    void testGetSchool() {
        Staff staff = new Staff("Ana", "Avenida Central 45", "Instituto Central", 1800.75);
        assertEquals("Instituto Central", staff.getSchool());
    }

    @Test
    void testSetSchool() {
        Staff staff = new Staff("Carlos", "Plaza Mayor 10", "Escuela Técnica", 2000.00);
        staff.setSchool("Universidad Nacional");
        assertEquals("Universidad Nacional", staff.getSchool());
    }

    @Test
    void testGetPay() {
        Staff staff = new Staff("Elena", "Calle Vieja 7", "Colegio San Pablo", 1300.00);
        assertEquals(1300.00, staff.getPay(), 0.01);
    }

    @Test
    void testSetPay() {
        Staff staff = new Staff("Luis", "Calle Sol 22", "Academia de Artes", 1450.00);
        staff.setPay(3000.75);
        assertEquals(3000.75, staff.getPay(), 0.01);
    }

    @Test
    void testToString() {
        Staff staff = new Staff("Clara", "Calle Luna 30", "Escuela de Negocios", 1600.50);
        assertEquals("Staff[Person[name=Clara,address=Calle Luna 30], school=Escuela de Negocios,pay=1600.5]", staff.toString());
    }
}