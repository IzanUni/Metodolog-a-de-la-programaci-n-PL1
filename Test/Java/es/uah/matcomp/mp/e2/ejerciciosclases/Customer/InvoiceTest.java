package es.uah.matcomp.mp.e2.ejerciciosclases.Customer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class InvoiceTest {

    @Test
    void getId() {
        Customer c = new Customer(1, "David", 10); // Suponiendo que `Customer` tiene `getDiscount()`
        Invoice i = new Invoice(101, c, 200.0);
        assertEquals(101, i.getId());
    }

    @Test
    void getCustomer() {
        Customer c = new Customer(1, "David", 10); // Suponiendo que `Customer` tiene `getDiscount()`
        Invoice i = new Invoice(101, c, 200.0);
        assertEquals(c, i.getCustomer());
    }

    @Test
    void setCustomer() {
        Customer c = new Customer(1, "David", 10); // Suponiendo que `Customer` tiene `getDiscount()`
        Invoice i = new Invoice(101, new Customer(2, "hola", 5), 200.0);
        i.setCustomer(c);
        assertEquals(c, i.getCustomer());
    }

    @Test
    void getAmount() {
        Customer c = new Customer(1, "David", 10); // Suponiendo que `Customer` tiene `getDiscount()`
        Invoice i = new Invoice(101, new Customer(2, "hola", 5), 200.0);
        assertEquals(200.0, i.getAmount(), 0.01);
    }

    @Test
    void setAmount() {
        Customer c = new Customer(1, "David", 10); // Suponiendo que `Customer` tiene `getDiscount()`
        Invoice i = new Invoice(101, new Customer(2, "hola", 5), 200.0);
        i.setAmount(300.0);
        assertEquals(300.0, i.getAmount(), 0.01);
    }

    @Test
    void getCustomerId() {
        Customer c = new Customer(1, "David", 10); // Suponiendo que `Customer` tiene `getDiscount()`
        Invoice i = new Invoice(101, new Customer(2, "hola", 5), 200.0);
        assertEquals(2, i.getCustomerId());
    }

    @Test
    void getCustomerName() {
        Customer c = new Customer(1, "David", 10); // Suponiendo que `Customer` tiene `getDiscount()`
        Invoice i = new Invoice(101, new Customer(2, "hola", 5), 200.0);
        assertEquals("hola", i.getCustomerName());
    }

    @Test
    void getCustomerDiscount() {
        Customer c = new Customer(1, "David", 10); // Suponiendo que `Customer` tiene `getDiscount()`
        Invoice i = new Invoice(101, new Customer(2, "hola", 5), 200.0);
        assertEquals(5, i.getCustomerDiscount());
    }

    @Test
    void getAmountAfterDiscount() {
        Customer c = new Customer(1, "David", 10); // Suponiendo que `Customer` tiene `getDiscount()`
        Invoice i = new Invoice(101, new Customer(2, "hola", 5), 200.0);
        assertEquals(190.00, i.getAmountAfterDiscount(), 0.01);
    }

    @Test
    void testToString() {
        Customer c = new Customer(1, "David", 10); // Suponiendo que `Customer` tiene `getDiscount()`
        Invoice i = new Invoice(101, new Customer(2, "hola", 5), 200.0);
        String expected = "Invoice[id= 101, customer= hola(2) (5%), amount= 200.0]";
        assertEquals(expected, i.toString());
    }
}