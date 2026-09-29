package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidadorDniTest {

    private final ValidadorDni validador = new ValidadorDni();

    @Test
    void dniValidoConLetraCorrecta() {
        assertTrue(validador.esValido("12345678Z"));
    }

    @Test
    void dniConLetraIncorrecta() {
        assertFalse(validador.esValido("12345678A"));
    }

    @Test
    void dniAceptaLetraMinuscula() {
        assertTrue(validador.esValido("12345678z"));
    }

    @Test
    void dniConLongitudIncorrecta() {
        assertFalse(validador.esValido("1234567Z"));
    }

    @Test
    void calcularLetraDevuelveLaCorrecta() {
        assertEquals('Z', validador.calcularLetra("12345678"));
    }
}