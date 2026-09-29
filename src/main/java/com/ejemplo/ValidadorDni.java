package com.ejemplo;

public class ValidadorDni {

    private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public boolean esValido(String dni) {
        if (dni == null) {
            return false;
        }
        String limpio = dni.trim().toUpperCase();
        if (!limpio.matches("\\d{8}[A-Z]")) {
            return false;
        }
        String numero = limpio.substring(0, 8);
        char letraEsperada = calcularLetra(numero);
        char letraDada = limpio.charAt(8);
        return letraEsperada == letraDada;
    }

    public char calcularLetra(String numero) {
        int valor = Integer.parseInt(numero);
        return LETRAS.charAt(valor % 23);
    }
}