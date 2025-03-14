import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FinanciasTest {

    @Test
    void getId() {
        Financias Empleo = new Financias(1, "Sergio", "Marti", 2500);
        assertEquals(Empleo.getId(), 1);
    }

    @Test
    void getFirstName() {
        Financias Empleo = new Financias(1, "Sergio", "Marti", 2500);
        assertEquals(Empleo.getFirstName(), "Sergio");
    }

    @Test
    void lastName() {
        Financias Empleo = new Financias(1, "Sergio", "Marti", 2500);
        assertEquals(Empleo.getLastName(), "Marti");
    }

    @Test
    void getSalary() {
        Financias Empleo = new Financias(1, "Sergio", "Marti", 2500);
        assertEquals(Empleo.getSalary(), 2500);
    }

    @Test
    void setSalary() {
        Financias Empleo = new Financias(1, "Sergio", "Marti", 10000);
        Empleo.setSalary(3500);
        assertEquals(Empleo.getSalary(), 3500);
    }

    @Test
    void getAnnualSalary() {
        Financias Empleo = new Financias(1, "Sergio", "Marti", 2500);
        assertEquals(Empleo.getAnnualSalary(), 12 * Empleo.getSalary());
    }

    @Test
    void raiseSalary() {
        Financias Empleo = new Financias(1, "Sergio", "Marti", 2500);
        assertEquals(Empleo.raiseSalary(25), Empleo.getSalary() + (25 * Empleo.getSalary() / 100));
    }

    @Test
    void testToString() {
        Financias Empleo = new Financias(1, "Sergio", "Marti", 2500);
        assertEquals(Empleo.toString(), "Financias[id = 1, firtsName = Sergio, lastName = Marti, salary = 2500]");
    }
}