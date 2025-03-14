package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void testConstructor() {
        Dog dog = new Dog("Rex");
        assertEquals("Dog[Mammal[ Animal[name=Rex]]]", dog.toString());
    }

    @Test
    void testToString() {
        Dog dog = new Dog("Bobby");
        assertEquals("Dog[Mammal[ Animal[name=Bobby]]]", dog.toString());
    }

    @Test
    void testGreets() {
        Dog dog = new Dog("Rocky");

        // Capturar la salida de System.out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        dog.greets(); // Llamamos al método que imprime "Woof"

        System.out.flush(); // Aseguramos que la salida se escriba completamente
        System.setOut(originalOut); // Restauramos salida estándar

        assertEquals("Woof" + System.lineSeparator(), outContent.toString()); // Comparación con separación de línea del sistema
    }

    @Test
    void testGreetsAnotherDog() {
        Dog dog1 = new Dog("Luna");
        Dog dog2 = new Dog("Thor");

        // Capturar la salida de System.out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        dog1.greets(dog2); // Llamamos al método que imprime "Wooooof"

        System.out.flush(); // Aseguramos que la salida se escriba completamente
        System.setOut(originalOut); // Restauramos salida estándar

        assertEquals("Wooooof" + System.lineSeparator(), outContent.toString()); // Comparación con separación de línea del sistema
    }
}