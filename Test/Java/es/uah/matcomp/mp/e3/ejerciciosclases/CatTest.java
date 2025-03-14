package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void testConstructor() {
        Cat cat = new Cat("Garfield");
        assertEquals("Cat[Mammal[ Animal[name=Garfield]]]", cat.toString());
    }

    @Test
    void testToString() {
        Cat cat = new Cat("Whiskers");
        assertEquals("Cat[Mammal[ Animal[name=Whiskers]]]", cat.toString());
    }

    @Test
    void testGreets() {
        Cat cat = new Cat("Tom");
        assertEquals("Meow", cat.greets());
    }
}