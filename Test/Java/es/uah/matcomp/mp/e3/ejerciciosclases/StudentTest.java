package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void testConstructor() {
        Student student = new Student("David", "Calle Principal 123", "Informática", 2024, 1500.50);
        assertEquals("David", student.getName());
        assertEquals("Calle Principal 123", student.getAddress());
        assertEquals("Informática", student.getProgram());
        assertEquals(2024, student.getYear());
        assertEquals(1500.50, student.getFee(), 0.01);
    }

    @Test
    void testGetProgram() {
        Student student = new Student("Ana", "Avenida Central 45", "Medicina", 2023, 1800.75);
        assertEquals("Medicina", student.getProgram());
    }

    @Test
    void testSetProgram() {
        Student student = new Student("Carlos", "Plaza Mayor 10", "Ingeniería", 2025, 2000.00);
        student.setProgram("Arquitectura");
        assertEquals("Arquitectura", student.getProgram());
    }

    @Test
    void testGetYear() {
        Student student = new Student("Elena", "Calle Vieja 7", "Derecho", 2022, 1300.00);
        assertEquals(2022, student.getYear());
    }

    @Test
    void testSetYear() {
        Student student = new Student("Luis", "Calle Sol 22", "Psicología", 2020, 1450.00);
        student.setYear(2026);
        assertEquals(2026, student.getYear());
    }

    @Test
    void testGetFee() {
        Student student = new Student("Marcos", "Calle Luna 30", "Física", 2021, 1100.25);
        assertEquals(1100.25, student.getFee(), 0.01);
    }

    @Test
    void testSetFee() {
        Student student = new Student("Paula", "Calle Estrella 5", "Química", 2024, 1200.00);
        student.setFee(1750.75);
        assertEquals(1750.75, student.getFee(), 0.01);
    }

    @Test
    void testToString() {
        Student student = new Student("Clara", "Calle Sol 50", "Biología", 2023, 1600.50);
        assertEquals("Student[Person[name=Clara,address=Calle Sol 50], program=Biología,year=2023,fee=1600.5]", student.toString());
    }
}