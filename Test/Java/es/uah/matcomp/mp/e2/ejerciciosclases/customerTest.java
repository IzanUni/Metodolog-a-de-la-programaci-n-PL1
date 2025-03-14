package es.uah.matcomp.mp.e2.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class customerTest {

    @Test
    void getId() {
        customer c = new customer(1, "izan",'h');
        assertEquals(1,c.getId());
    }

    @Test
    void getName() {
        customer c = new customer(1, "izan",'h');
        assertEquals("izan",c.getName());
    }

    @Test
    void getGender() {
        customer c = new customer(1, "David", 'm');
        assertEquals('m', c.getGender());
    }

    @Test
    void testToString() {
        customer c = new customer(1, "David", 'm');
        assertEquals("David(1)", c.toString());
    }
}