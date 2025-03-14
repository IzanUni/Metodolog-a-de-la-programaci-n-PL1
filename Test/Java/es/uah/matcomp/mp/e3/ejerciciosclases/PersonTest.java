package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testConstructor() {
        Person person = new Person("David", "Calle Principal 123");
        assertEquals("David", person.getName());
        assertEquals("Calle Principal 123", person.getAddress());
    }

    @Test
    void testGetName() {
        Person person = new Person("Ana", "Avenida Central 45");
        assertEquals("Ana", person.getName());
    }

    @Test
    void testGetAddress() {
        Person person = new Person("Carlos", "Plaza Mayor 10");
        assertEquals("Plaza Mayor 10", person.getAddress());
    }

    @Test
    void testSetAddress() {
        Person person = new Person("Elena", "Calle Vieja 7");
        person.setAddress("Calle Nueva 99");
        assertEquals("Calle Nueva 99", person.getAddress());
    }

    @Test
    void testToString() {
        Person person = new Person("Luis", "Calle Sol 22");
        assertEquals("Person[name=Luis,address=Calle Sol 22]", person.toString());
    }
}