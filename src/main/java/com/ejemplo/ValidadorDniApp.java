package com.ejemplo;

public class ValidadorDniApp {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java -jar validador-dni.jar <DNI>");
            return;
        }
        ValidadorDni validador = new ValidadorDni();
        boolean valido = validador.esValido(args[0]);
        System.out.println(args[0] + " -> " + (valido ? "VÁLIDO" : "NO VÁLIDO"));
    }
}