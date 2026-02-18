package cl.kevin.utils;

import java.util.Scanner;

/**
 * Clase utilitaria del sistema.
 *
 * Contiene métodos auxiliares reutilizables relacionados con la
 * interacción por consola, evitando duplicar lógica en otras clases.
 *
 * No representa una entidad del dominio, por lo que:
 * - No debe instanciarse.
 * - Todos sus métodos son estáticos.
 */
public final class Utils {

    /**
     * Constructor privado para evitar la creación de instancias.
     * Esta clase solo debe usarse de forma estática.
     */
    private Utils() {
        // Previene instanciación accidental
    }

    /**
     * Lee un número entero de forma segura desde la consola.
     *
     * El método valida la entrada del usuario y repite la solicitud
     * hasta que se ingrese un valor numérico correcto, evitando que
     * la aplicación termine por InputMismatchException.
     *
     * Además limpia el buffer del Scanner después de cada lectura,
     * previniendo errores comunes al mezclar nextInt() y nextLine().
     *
     * @param sc Scanner utilizado para leer la entrada
     * @param mensaje texto mostrado al usuario solicitando el dato
     * @return número entero válido ingresado por el usuario
     */
    public static int leerEnteroSeguro(Scanner sc, String mensaje) {

        while (true) { // se repite hasta obtener un valor válido
            System.out.print(mensaje);

            try {
                int valor = sc.nextInt(); // intenta leer un entero
                sc.nextLine();           // limpia el buffer pendiente
                return valor;

            } catch (Exception e) {
                System.err.println("Error: debe ingresar un número.");
                sc.nextLine(); // limpia buffer para evitar bucle infinito
            }
        }
    }
}


