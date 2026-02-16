package cl.kevin;

import java.util.Scanner;

import cl.kevin.servicio.GestorTareas;
import cl.kevin.utils.Utils;

/**
 * Clase principal (Capa de Presentación).
 * Solo se encarga de:
 *  - Mostrar menú
 *  - Leer datos del usuario
 *  - Llamar al servicio GestorTareas
 *
 * NO contiene lógica de negocio.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // El gestor contiene TODA la lógica del sistema
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
     * Solo recoge datos del usuario y delega la acción al gestor.
     */
    public static void agregarTarea(Scanner sc, GestorTareas gestor) {

        System.out.print("Ingrese nombre de la tarea: ");
        String nombre = sc.nextLine();

        int prioridad = Utils.leerEnteroSeguro(
                sc,
                "Ingrese prioridad (1-Alta, 2-Media, 3-Baja): "
        );

        try {
            gestor.crearTarea(nombre, prioridad);
            System.out.println("Tarea creada correctamente.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    // ===================== UI: LISTAR =====================

    public static void listarTareas(GestorTareas gestor) {

        if (gestor.estaVacia()) {
            System.out.println("No hay tareas registradas.");
            return;
        }

        System.out.println("\n═════════ LISTA DE TAREAS ═════════");

        gestor.listar().forEach(t -> {
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

    public static void marcarComoCompletada(Scanner sc, GestorTareas gestor) {

        int id = Utils.leerEnteroSeguro(sc, "Ingrese ID de la tarea: ");
        gestor.marcarComoCompletada(id);

        System.out.println("Operación realizada.");
    }

    // ===================== UI: ELIMINAR =====================

    public static void eliminarTarea(Scanner sc, GestorTareas gestor) {

        int id = Utils.leerEnteroSeguro(sc, "Ingrese ID de la tarea a eliminar: ");
        gestor.eliminar(id);

        System.out.println("Operación realizada.");
    }
}







