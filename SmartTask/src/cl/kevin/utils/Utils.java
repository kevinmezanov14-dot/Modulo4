package cl.kevin.utils;

import java.util.Scanner;

/**
 * Clase utilitaria.
 * Contiene métodos reutilizables para entrada segura por consola.
 * No representa un objeto.
 */
public class Utils {

    /**
     * Lee un número entero de forma segura desde consola.
     * Repite la pregunta hasta que el usuario ingrese un número válido.
     *
     * @param sc Scanner utilizado para leer la entrada
     * @param mensaje Mensaje que se muestra al usuario
     * @return número entero válido ingresado por el usuario
     */
    public static int leerEnteroSeguro(Scanner sc, String mensaje) {

        while (true) { // se repite hasta que el ingreso sea válido
            System.out.print(mensaje);

            try {
                int valor = sc.nextInt(); // intenta leer un entero
                sc.nextLine(); // limpia el buffer
                return valor; // sale del método con un valor válido

            } catch (Exception e) {
                System.err.println("Error: debe ingresar un número.");
                sc.nextLine(); // limpiar buffer para evitar bucle infinito
            }
        }
    }
}

