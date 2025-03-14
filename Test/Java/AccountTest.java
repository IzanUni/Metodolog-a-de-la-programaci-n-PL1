import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Account Cuenta = new Account("Marin_trj", "ElGonza", 10000);
        assertEquals(Cuenta.getId(), "Marin_trj");
    }

    @Test
    void getName() {
        Account Cuenta = new Account("Marin_trj", "ElGonza", 10000);
        assertEquals(Cuenta.getName(), "ElGonza");
    }

    @Test
    void getBalance() {
        Account Cuenta = new Account("Marin_trj", "ElGonza", 10000);
        assertEquals(Cuenta.getBalance(), 10000);
    }

    @Test
    void credit() {
        Account Cuenta = new Account("Marin_trj", "ElGonza", 10000);
        assertEquals(Cuenta.credit(50), 50 + Cuenta.getBalance());
    }

    @Test
    void debit() {
        Account Cuenta = new Account("Marin_trj", "ElGonza", 10000);
        assertEquals(1000, Cuenta.debit(9000), "El saldo no se actualizó correctamente después de debitar 200");
        assertEquals(1000, Cuenta.debit(11000), "El saldo no debería cambiar si el monto excede el balance");
        assertEquals(0, Cuenta.debit(1000), "El saldo no se redujo correctamente a 0");
    }

    @Test
    void transferto() {
        Account sender = new Account("AAA111", "Mario", 1000);
        Account receiver = new Account("BBB222", "Clara", 800);

        sender.transferto(receiver, 300);

        assertEquals(700, sender.getBalance());
        assertEquals(800, receiver.getBalance());
    }

    @Test
    void testToString() {
        Account Cuenta = new Account("Marin_trj", "ElGonza", 10000);
        assertEquals(Cuenta.toString(), "Account[Id = Marin_trj, Name = ElGonza, Balance = 10000]");
    }
}