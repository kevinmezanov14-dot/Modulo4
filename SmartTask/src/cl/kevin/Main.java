package cl.kevin;

import java.util.Scanner;

import cl.kevin.servicio.GestorTareas;
import cl.kevin.utils.Utils;

/**
 * Punto de entrada de la aplicación SmartTask.
 *
 * Esta clase representa la CAPA DE PRESENTACIÓN (UI por consola).
 * Su única responsabilidad es interactuar con el usuario:
 *
 * Mostrar el menú
 * Leer datos desde consola
 * Delegar las operaciones al servicio GestorTareas
 * 
 *
 * No contiene lógica de negocio ni reglas del sistema.
 * Todas las decisiones (creación de tareas, validaciones, IDs, etc.)
 * se encuentran en la capa de servicio.
 *
 * Este diseño aplica el principio de Separación de Responsabilidades (SRP),
 * permitiendo que la UI pueda cambiar sin afectar la lógica interna.
 * 
 * @author Kevin
 * @version 1.0
 * @since 2026
 */
public class Main {
	
	/**
	 * Método principal que inicia la aplicación.
	 *
	 * Controla el ciclo de vida del programa:
	 * Crea los recursos necesarios (Scanner y GestorTareas)
	 * Muestra el menú en bucle
	 * Deriva la acción seleccionada al método correspondiente
	 * Finaliza cuando el usuario decide salir
	 */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();

        boolean continuar = true;

        do {
            mostrarMenu();

            int opcion = Utils.leerEnteroSeguro(sc, "Seleccione una opción (0-4): ");

            switch (opcion) {

                case 1:
                    agregarTarea(sc, gestor);
                    break;

                case 2:
                    listarTareas(gestor);
                    break;

                case 3:
                    marcarComoCompletada(sc, gestor);
                    break;

                case 4:
                    eliminarTarea(sc, gestor);
                    break;

                case 0:
                    continuar = false;
                    System.out.println("Saliendo de SmartTask...");
                    break;

                default:
                    System.err.println("Opción inválida.");
            }

        } while (continuar);

        sc.close();
    }

    // ===================== UI: MENÚ =====================
    
    /**
     * Muestra el menú principal de opciones al usuario.
     *
     * Solo imprime información en pantalla.
     * No contiene ninguna lógica del sistema.
     */
    public static void mostrarMenu() {
        System.out.println("\n╔═════════════════════════════════╗");
        System.out.println("║          SMART TASK             ║");
        System.out.println("╠═════════════════════════════════╣");
        System.out.println("║ 0. Salir                        ║");
        System.out.println("║ 1. Agregar tarea                ║");
        System.out.println("║ 2. Listar tareas                ║");
        System.out.println("║ 3. Marcar como completada       ║");
        System.out.println("║ 4. Eliminar tarea               ║");
        System.out.println("╚═════════════════════════════════╝");
    }

    // ===================== UI: AGREGAR =====================

    /**
     * Solicita los datos necesarios para crear una tarea y delega
     * la operación al GestorTareas.
     *
     * Este método NO decide qué tipo de tarea se crea.
     * Esa responsabilidad pertenece a la capa de negocio.
     *
     * @param sc      Scanner usado para leer desde consola
     * @param gestor  Servicio que gestiona las tareas
     */
    public static void agregarTarea(Scanner sc, GestorTareas gestor) { 

        System.out.print("Ingrese nombre de la tarea: ");
        String nombre = sc.nextLine();

        int prioridad = Utils.leerEnteroSeguro(
                sc,
                "Ingrese prioridad (1-Alta, 2-Media, 3-Baja): "
        );

        try {// Delegamos la regla de negocio al gestor y si no es valida la prioridad el programa no se cae.
            gestor.crearTarea(nombre, prioridad);
            System.out.println("Tarea creada correctamente.");
        } catch (IllegalArgumentException e) { // si el usuario ingresa una prioridad inválida lanza el mensaje de error.
            System.err.println(e.getMessage());
        }
    }

    // ===================== UI: LISTAR =====================
    
    /**
     * Muestra todas las tareas registradas.
     *
     * Obtiene los datos desde el gestor y los formatea para su
     * visualización en consola. No modifica el estado del sistema.
     *
     * @param gestor servicio que contiene las tareas
     */
    public static void listarTareas(GestorTareas gestor) {

        if (gestor.estaVacia()) {
            System.out.println("No hay tareas registradas.");
            return;
        }

        System.out.println("\n═════════ LISTA DE TAREAS ═════════");

        gestor.listar().forEach(t -> { // recorro la lista
            String estado = t.isCompletada() ? "SI" : "NO"; 

            System.out.println(
                    "ID: " + t.getId() +
                    " | Nombre: " + t.getNombre() +
                    " | Tipo: " + t.tipoTarea() +
                    " | Prioridad: " + t.getPrioridad() +
                    " | Completada: " + estado
            );
        });

        System.out.println("══════════════════════════════════\n");
    }

    // ===================== UI: COMPLETAR =====================
    
    /**
     * Solicita el ID de una tarea y delega la actualización al gestor.
     *
     * @param sc      Scanner de entrada
     * @param gestor  servicio de negocio
     */


    public static void marcarComoCompletada(Scanner sc, GestorTareas gestor) {

        int id = Utils.leerEnteroSeguro(sc, "Ingrese ID de la tarea: ");
        gestor.marcarComoCompletada(id);

        System.out.println("Operación realizada.");
    }

    // ===================== UI: ELIMINAR =====================
    
    /**
     * Solicita el ID de una tarea a eliminar y delega la operación.
     *
     * La validación y eliminación real son responsabilidad del gestor.
     *
     * @param sc      Scanner de entrada
     * @param gestor  servicio de negocio
     */


    public static void eliminarTarea(Scanner sc, GestorTareas gestor) {

        int id = Utils.leerEnteroSeguro(sc, "Ingrese ID de la tarea a eliminar: ");
        gestor.eliminar(id);

        System.out.println("Operación realizada.");
    }
}







