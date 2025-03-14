package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testConstructor() {
        Animal animal = new Animal("León");
        assertEquals("León", animal.toString().split("=")[1].replace("]", ""));
    }

    @Test
    void testToString() {
        Animal animal = new Animal("Tigre");
        assertEquals("Animal[name=Tigre]", animal.toString());
    }
}