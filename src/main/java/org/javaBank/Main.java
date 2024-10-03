package org.javaBank;

public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Genera excepción
                System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero!");
        }
    }
}