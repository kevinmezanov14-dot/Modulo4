package com.alkemy.f20260205;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // objeto Scanner para leer entrada del usuario
        boolean continuar = true; // controla la ejecucion global del programa

        // ===== EJECUCION GLOBAL =====
        do {

            mostrarMenu(); // muestra el menu de opciones

            int opcion;

            // validacion para evitar letras en la opcion del menu
            try {
                opcion = sc.nextInt(); // lee la opcion seleccionada por el usuario
            } catch (Exception e) {
                System.err.println("Error: Debe ingresar un numero.");
                sc.nextLine(); // limpia el buffer del Scanner
                continue; // vuelve a mostrar el menu
            }

            if (opcion == 0) {
                System.out.println("Saliendo de la calculadora. Hasta luego!");
                break; // finaliza el programa
            }

            if (opcion < 1 || opcion > 4) {
                System.err.println("Opcion invalida.");
                continue; // vuelve a mostrar el menu
            }

            ArrayList<Double> numeros = ingresarNumeros(sc); // llama al metodo para ingresar numeros
            double resultado; // variable para almacenar el resultado

            // estructura de decision para seleccionar la operacion
            switch (opcion) {
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

            // pregunta si el usuario desea continuar
            System.out.println("¿Quieres continuar con otra operación?");
            System.out.println("(1) SI");
            System.out.println("(2) NO");

            int opcionContinuar;

            // validacion para evitar letras en la opcion continuar
            try {
                opcionContinuar = sc.nextInt(); // lee la opcion de continuar
            } catch (Exception e) {
                System.out.println("Entrada invalida. Saliendo del programa.");
                break;
            }

            if (opcionContinuar != 1) {
                continuar = false; // cambia el estado global
                System.out.println("Saliendo de la calculadora. Hasta luego!");
            }

        } while (continuar);

        sc.close(); // cierra el Scanner
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

        int cantidad;

        // validacion para evitar letras en la cantidad de numeros
        while (true) {
            System.out.print("Ingrese la cantidad de numeros a operar: ");
            try {
                cantidad = sc.nextInt(); // lee la cantidad de numeros a operar
                if (cantidad < 2) {
                    System.out.println("Debe ingresar al menos 2 numeros.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.err.println("Error: Debe ingresar un numero valido.");
                sc.nextLine(); // limpia el buffer
            }
        }

        ArrayList<Double> numeros = new ArrayList<>(); // lista para almacenar los numeros

        for (int i = 0; i < cantidad; i++) { // ciclo para ingresar los numeros
            while (true) {
                System.out.print("Ingrese el numero " + (i + 1) + ": "); // pide el numero
                try {
                    String entrada = sc.next(); // lee el dato como texto
                    entrada = entrada.replace(",", "."); // permite 0,5 o 0.5
                    numeros.add(Double.parseDouble(entrada)); // agrega el numero a la lista
                    break;
                } catch (Exception e) {
                    System.err.println("Error: Debe ingresar un numero valido.");
                }
            }
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
                System.err.println("Error: Division por cero."); // mensaje de error
                return 0;
            }
            resultado /= numeros.get(i); // divide el resultado por el numero actual
        }
        return resultado; // retorna el resultado de la division
    }
}




