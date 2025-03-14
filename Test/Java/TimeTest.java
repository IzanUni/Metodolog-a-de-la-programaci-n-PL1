import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TimeTest {

    @Test
    void testGetHour() {
        Time time = new Time(10, 30, 45); // Crear un objeto Time
        assertEquals(10, time.getHour()); // Verificar que la hora es 10
    }

    @Test
    void testGetMinute() {
        Time time = new Time(10, 30, 45); // Crear un objeto Time
        assertEquals(30, time.getMinute()); // Verificar que el minuto es 30
    }

    @Test
    void testGetSecond() {
        Time time = new Time(10, 30, 45); // Crear un objeto Time
        assertEquals(45, time.getSecond()); // Verificar que el segundo es 45
    }

    @Test
    void testSetHour() {
        Time time = new Time(10, 30, 45); // Crear un objeto Time
        time.setHour(15); // Cambiar la hora a 15
        assertEquals(15, time.getHour()); // Verificar que la hora se ha cambiado a 15
    }

    @Test
    void testSetMinute() {
        Time time = new Time(10, 30, 45); // Crear un objeto Time
        time.setMinute(45); // Cambiar el minuto a 45
        assertEquals(45, time.getMinute()); // Verificar que el minuto se ha cambiado a 45
    }

    @Test
    void testSetSecond() {
        Time time = new Time(10, 30, 45); // Crear un objeto Time
        time.setSecond(50); // Cambiar el segundo a 50
        assertEquals(50, time.getSecond()); // Verificar que el segundo se ha cambiado a 50
    }

    @Test
    void testSetTime() {
        Time time = new Time(10, 30, 45); // Crear un objeto Time
        time.setTime(12, 45, 30); // Cambiar la hora, minuto y segundo
        assertEquals(12, time.getHour()); // Verificar que la hora es 12
        assertEquals(45, time.getMinute()); // Verificar que el minuto es 45
        assertEquals(30, time.getSecond()); // Verificar que el segundo es 30
    }

    @Test
    void testToString() {
        Time time = new Time(10, 30, 45); // Crear un objeto Time
        assertEquals("10:30:45", time.toString()); // Verificar que el formato es correcto
    }

    @Test
    void testNextSecond() {
        Time time = new Time(10, 30, 45); // Crear un objeto Time
        Time nextTime = time.nextSecond(); // Obtener el siguiente segundo
        assertEquals("10:30:46", nextTime.toString()); // Verificar que el siguiente segundo es 10:30:46
    }

    @Test
    void testPreviousSecond() {
        Time time = new Time(10, 30, 45); // Crear un objeto Time
        Time prevTime = time.previousSecond(); // Obtener el segundo anterior
        assertEquals("10:30:44", prevTime.toString()); // Verificar que el segundo anterior es 10:30:44
    }
}
