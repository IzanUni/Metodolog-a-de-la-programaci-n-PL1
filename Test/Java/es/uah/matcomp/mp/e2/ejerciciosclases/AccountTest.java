package es.uah.matcomp.mp.e2.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        customer customer = new customer(1, "David", 'M');
        Account account = new Account(101, customer, 500.0);
        assertEquals(101, account.getId());
    }

    @Test
    void getCustomer() {
        customer customer = new customer(2, "Ana", 'F');
        Account account = new Account(102, customer);
        assertEquals(customer, account.getCustomer());
    }

    @Test
    void getBalance() {
        customer customer = new customer(3, "Carlos", 'M');
        Account account = new Account(103, customer, 1000.0);
        assertEquals(1000.0, account.getBalance(), 0.01);
    }

    @Test
    void setBalance() {
        customer customer = new customer(4, "Elena", 'F');
        Account account = new Account(104, customer, 200.0);
        account.setBalance(300.0);
        assertEquals(300.0, account.getBalance(), 0.01);
    }

    @Test
    void testToString() {
        customer customer = new customer(5, "Luis", 'M');
        Account account = new Account(105, customer, 750.0);
        String expected = "Luis(5) balance=$750.0";
        assertEquals(expected, account.toString());
    }

    @Test
    void getCustomerName() {
        customer customer = new customer(6, "Sofia", 'F');
        Account account = new Account(106, customer, 400.0);
        assertEquals("Sofia", account.getCustomerName());
    }

    @Test
    void deposit() {
        customer customer = new customer(7, "Alberto", 'M');
        Account account = new Account(107, customer, 600.0);
        account.deposit(150.0);
        assertEquals(750.0, account.getBalance(), 0.01);
    }

    @Test
    void withdraw() {
        customer customer = new customer(8, "Lucia", 'F');
        Account account = new Account(108, customer, 500.0);
        account.withdraw(200.0);
        assertEquals(300.0, account.getBalance(), 0.01);
    }
}