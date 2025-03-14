package es.uah.matcomp.mp.e2.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getName() {
        Book b1 = new Book("libro", new Author[0], 6);
        assertEquals("libro", b1.getName());
    }

    @Test
    void getAuthors() {
        Author[] authors = {new Author("David", "David@gmail.com", 'h')};
        Book b1 = new Book("libro", authors, 6);
        assertArrayEquals(authors, b1.getAuthors());
    }

    @Test
    void getPrice() {
        Book b1 = new Book("libro", new Author[0], 6);
        assertEquals(6, b1.getPrice());
    }

    @Test
    void setPrice() {
        Book b1 = new Book("libro", new Author[0], 6);
        b1.setPrice(10);
        assertEquals(10, b1.getPrice());
    }


    @Test
    void getQty() {
        Book b1 = new Book("libro", new Author[0], 6, 8);
        assertEquals(8, b1.getQty());
    }

    @Test
    void setQty() {
        Book b1 = new Book("libro", new Author[0], 6, 8);
        b1.setQty(10);
        assertEquals(10, b1.getQty());
    }

    @Test
    void testToString() {
        Book b1 = new Book("libro", new Author[0], 6);
        assertEquals("Book[name= libro,authors = {[]}, price= 6.0,qty= 0]", b1.toString());
    }

    @Test
    void getAuthorsNames() {
        Author[] authors = {new Author("David", "David@gmail.com", 'h')};
        Book b1 = new Book("libro", authors, 6);
        assertEquals("David", b1.getAuthorsNames());

    }
}