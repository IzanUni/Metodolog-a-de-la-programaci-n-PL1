import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DateTest {

    @Test
    void testGetDay() {
        Date date = new Date(14, 3, 2025); // Crear un objeto Date
        assertEquals(14, date.getDay()); // Verificar que el día es 14
    }

    @Test
    void testGetMonth() {
        Date date = new Date(14, 3, 2025); // Crear un objeto Date
        assertEquals(3, date.getMonth()); // Verificar que el mes es 3 (marzo)
    }

    @Test
    void testGetYear() {
        Date date = new Date(14, 3, 2025); // Crear un objeto Date
        assertEquals(2025, date.getYear()); // Verificar que el año es 2025
    }

    @Test
    void testSetDay() {
        Date date = new Date(14, 3, 2025); // Crear un objeto Date
        date.setDay(15); // Cambiar el día a 15
        assertEquals(15, date.getDay()); // Verificar que el día se ha cambiado a 15
    }

    @Test
    void testSetMonth() {
        Date date = new Date(14, 3, 2025); // Crear un objeto Date
        date.setMonth(5); // Cambiar el mes a 5 (mayo)
        assertEquals(5, date.getMonth()); // Verificar que el mes se ha cambiado a 5
    }

    @Test
    void testSetYear() {
        Date date = new Date(14, 3, 2025); // Crear un objeto Date
        date.setYear(2026); // Cambiar el año a 2026
        assertEquals(2026, date.getYear()); // Verificar que el año se ha cambiado a 2026
    }

    @Test
    void testSetDate() {
        Date date = new Date(14, 3, 2025); // Crear un objeto Date
        date.setDate(1, 1, 2026); // Cambiar la fecha a 01/01/2026
        assertEquals(1, date.getDay()); // Verificar que el día es 1
        assertEquals(1, date.getMonth()); // Verificar que el mes es 1 (enero)
        assertEquals(2026, date.getYear()); // Verificar que el año es 2026
    }

    @Test
    void testToString() {
        Date date = new Date(14, 3, 2025); // Crear un objeto Date
        assertEquals("14/3/2025", date.toString()); // Verificar que el formato es correcto
    }
}
