package es.uah.matcomp.mp.e2.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        Author A1 = new Author("David", "david@gmail.com", 'H');
        assertEquals("David", A1.getName());
    }

    @Test
    void getEmail() {
        Author A1 = new Author("David", "david@gmail.com", 'H');
        assertEquals("david@gmail.com", A1.getEmail());
    }

    @Test
    void setEmail() {
        Author A1 = new Author("David", "david@gmail.com", 'H');
        A1.setEmail("david@gmail.es");
        assertEquals("david@gmail.es", A1.getEmail());
    }

    @Test
    void getGender() {
        Author A1 = new Author("David", null, 'm');
        assertEquals('m', A1.getGender());
    }

    @Test
    void testToString() {
        Author A1 = new Author("David", null, 'H');
        assertEquals("Author[name= David,email= null,gener= m]", A1.toString());
    }
}