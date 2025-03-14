package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    @Test
    void testConstructor() {
        Mammal mammal = new Mammal("Elefante");
        assertEquals("Mammal[ Animal[name=Elefante]]", mammal.toString());
    }

    @Test
    void testToString() {
        Mammal mammal = new Mammal("Delfín");
        assertEquals("Mammal[ Animal[name=Delfín]]", mammal.toString());
    }
}