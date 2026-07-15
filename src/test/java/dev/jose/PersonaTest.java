package dev.jose;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.Year;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    private Persona persona;

    @BeforeEach
    void setUp() {
        // Inicializamos un objeto común antes de cada test
        persona = new Persona("José", "Pérez Gómez", "12345678A", 1990);
    }

    @Test
    void testConstructorYGetters() {
        // Comprobamos que el constructor asigna bien los valores iniciales
        assertEquals("José", persona.getNombre());
        assertEquals("Pérez Gómez", persona.getApellidos());
        assertEquals("12345678A", persona.getDni());
        assertEquals(1990, persona.getNacimiento());
    }

    @Test
    void testSetters() {
        // Modificamos los valores con los setters
        persona.setNombre("Carlos");
        persona.setApellidos("Sánchez");
        persona.setDni("87654321B");
        persona.setNacimiento(2000);

        // Verificamos que se hayan actualizado correctamente
        assertEquals("Carlos", persona.getNombre());
        assertEquals("Sánchez", persona.getApellidos());
        assertEquals("87654321B", persona.getDni());
        assertEquals(2000, persona.getNacimiento());
    }

    @Test
    void testCalcularEdad() {
        // Obtenemos el año actual dinámicamente para que el test no falle en el futuro
        int anioActual = Year.now().getValue();
        int edadEsperada = anioActual - 1990;

        assertEquals(edadEsperada, persona.calcularEdad(), "La edad calculada no es correcta");
    }

    @Test
    void testGetEdad() {
        // getEdad() internamente llama a calcularEdad(), así que debe devolver lo mismo
        int anioActual = Year.now().getValue();
        int edadEsperada = anioActual - 1990;

        assertEquals(edadEsperada, persona.getEdad(), "getEdad() debería devolver la edad calculada");
    }

    @Test
    void testToString() {
        int edadActual = persona.getEdad();
        String cadenaEsperada = "Persona{nombre='José', apellidos='Pérez Gómez', dni=12345678A, nacimiento=1990, edad=" + edadActual + "}";
        
        assertEquals(cadenaEsperada, persona.toString(), "El método toString no genera el formato esperado");
    }
}