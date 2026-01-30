package com.alkemy.f20260130;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingresa el primer numero: ");
            int numero1 = Integer.parseInt(sc.nextLine());

            System.out.print("Ingresa el segundo numero: ");
            int numero2 = Integer.parseInt(sc.nextLine());

            int suma = numero1 + numero2;
            int resta = numero1 - numero2;
            int multiplicacion = numero1 * numero2;

            System.out.printf("El resultado de la suma es: %d%n", suma);
            System.out.printf("El resultado de la resta es: %d%n", resta);
            System.out.printf("El resultado de la multiplicacion es: %d%n", multiplicacion);

            if (numero2 != 0) {
                double division = (double) numero1 / numero2;
                System.out.printf("El resultado de la division es: %.2f%n", division);
            } else {
                System.out.println("No se puede dividir por cero");
            }

            // 🔹 PAR / IMPAR del primer número
            if (numero1 % 2 == 0) {
                System.out.println("El primer numero es par");
            } else {
                System.out.println("El primer numero es impar");
            }

            // 🔹 POSITIVO / NEGATIVO / CERO del primer número
            if (numero1 > 0) {
                System.out.println("El primer numero es positivo");
            } else if (numero1 < 0) {
                System.out.println("El primer numero es negativo");
            } else {
                System.out.println("El primer numero es cero");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: debes ingresar solo numeros");
        } finally {
            sc.close();
        }
    }
}


