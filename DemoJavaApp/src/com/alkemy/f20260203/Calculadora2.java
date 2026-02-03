package com.alkemy.f20260203;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // objeto Scanner para leer entrada del usuario
        mostrarMenu(); // muestra el menu de opciones

        int opcion = sc.nextInt(); // lee la opcion seleccionada por el usuario

        if (opcion < 0 || opcion > 4) {
            System.out.println("Opcion invalida.");
            sc.close();
            return;
        }

        if (opcion == 0) {
            System.out.println("Saliendo de la calculadora. Hasta luego!");
            sc.close();
            return;
        }

        ArrayList<Double> numeros = ingresarNumeros(sc); // llama al metodo para ingresar numeros

        double resultado = 0; // variable para almacenar el resultado

        switch (opcion) { // estructura switch para seleccionar la operacion
            case 1:
                resultado = sumar(numeros);
                System.out.println("Resultado de la suma: " + resultado);
                break;

            case 2:
                resultado = restar(numeros);
                System.out.println("Resultado de la resta: " + resultado);
                break;

            case 3:
                resultado = multiplicar(numeros);
                System.out.println("Resultado de la multiplicacion: " + resultado);
                break;

            case 4:
                resultado = dividir(numeros);
                System.out.println("Resultado de la division: " + resultado);
                break;
        }

        sc.close();
    }

    // ================= MÉTODOS =================

    public static void mostrarMenu() {
        System.out.println(" ╔══════════════════════════════╗");
        System.out.println(" ║      CALCULADORA JAVA        ║");
        System.out.println(" ╠══════════════════════════════╣");
        System.out.println(" ║ 0. Salir                     ║");
        System.out.println(" ║ 1. Suma                      ║");
        System.out.println(" ║ 2. Resta                     ║");
        System.out.println(" ║ 3. Multiplicacion            ║");
        System.out.println(" ║ 4. Division                  ║");
        System.out.println(" ╚══════════════════════════════╝");
        System.out.print("Seleccione una opcion (0-4): ");
    }

    public static ArrayList<Double> ingresarNumeros(Scanner sc) { // metodo para ingresar numeros

        System.out.print("Ingrese la cantidad de numeros a operar: ");
        int cantidad = sc.nextInt(); // lee la cantidad de numeros a operar

        if (cantidad < 2) {
            System.out.println("Debe ingresar al menos 2 numeros.");
            System.exit(0); // termina el programa si la cantidad es menor a 2
        }

        ArrayList<Double> numeros = new ArrayList<>(); // lista para almacenar los numeros

        for (int i = 0; i < cantidad; i++) { // ciclo para ingresar los numeros
            System.out.print("Ingrese el numero " + (i + 1) + ": "); // pide el numero
            numeros.add(sc.nextDouble()); // agrega el numero a la lista
        }

        return numeros; // retorna la lista de numeros ingresados
    }

    public static double sumar(ArrayList<Double> numeros) { // metodo para sumar los numeros
        double resultado = 0; // inicializa el resultado en 0
        for (double n : numeros) { // ciclo para sumar los numeros
            resultado += n; // suma el numero actual al resultado
        }
        return resultado; // retorna el resultado de la suma
    }

    public static double restar(ArrayList<Double> numeros) { // metodo para restar los numeros
        double resultado = numeros.get(0); // inicializa el resultado con el primer numero
        for (int i = 1; i < numeros.size(); i++) { // ciclo para restar los numeros
            resultado -= numeros.get(i); // resta el numero actual al resultado
        }
        return resultado; // retorna el resultado de la resta
    }

    public static double multiplicar(ArrayList<Double> numeros) { // metodo para multiplicar los numeros
        double resultado = 1; // inicializa el resultado en 1
        for (double n : numeros) { // ciclo para multiplicar los numeros
            resultado *= n; // multiplica el resultado por el numero actual
        }
        return resultado; // retorna el resultado de la multiplicacion
    }

    public static double dividir(ArrayList<Double> numeros) { // metodo para dividir los numeros
        double resultado = numeros.get(0); // inicializa el resultado con el primer numero
        for (int i = 1; i < numeros.size(); i++) { // ciclo para dividir los numeros
            if (numeros.get(i) == 0) { // verifica si el numero es cero
                System.out.println("Error: Division por cero."); // verifica division por cero
                System.exit(0); // termina el programa si hay division por cero
            }
            resultado /= numeros.get(i); // divide el resultado por el numero actual
        }
        return resultado; // retorna el resultado de la division
    }
}
