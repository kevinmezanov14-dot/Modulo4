package cl.kevin;

import java.util.Scanner;

import cl.kevin.objeto.Task;
import cl.kevin.objeto.TareaNormal;
import cl.kevin.objeto.TareaUrgente;
import cl.kevin.servicio.GestorTareas;
import cl.kevin.utils.Utils;

/**
 * Clase principal de la aplicación SmartTask.
 * Solo maneja la interacción con el usuario (UI de consola).
 * La lógica del sistema está delegada a GestorTareas.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();

        int contadorId = 1;
        boolean continuar = true;

        do {
            mostrarMenu();

            int opcion = Utils.leerEnteroSeguro(sc, "Seleccione una opción (0-4): ");

            switch (opcion) {

                case 1:
                    contadorId = agregarTarea(sc, gestor, contadorId);
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

    // ===================== MENÚ =====================

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

    // ===================== AGREGAR =====================

    public static int agregarTarea(Scanner sc, GestorTareas gestor, int idActual) {

        System.out.print("Ingrese nombre de la tarea: ");
        String nombre = sc.nextLine().trim();

        if (nombre.isEmpty()) {
            System.err.println("El nombre no puede estar vacío.");
            return idActual;
        }

        int prioridad = Utils.leerEnteroSeguro(
                sc,
                "Ingrese prioridad (1-Alta [Urgente], 2-Media, 3-Baja): "
        );

        Task nueva;

        // POLIMORFISMO
        if (prioridad == 1) {
            nueva = new TareaUrgente(idActual, nombre);
        } else {
            nueva = new TareaNormal(idActual, nombre, prioridad);
        }

        gestor.agregar(nueva);

        System.out.println("Tarea agregada correctamente.");
        return idActual + 1;
    }

    // ===================== LISTAR =====================

    public static void listarTareas(GestorTareas gestor) {

        if (gestor.estaVacia()) {
            System.out.println("No hay tareas registradas.");
            return;
        }

        System.out.println("\n═════════ LISTA DE TAREAS ═════════");

        for (Task t : gestor.listar()) {

            String estado = t.isCompletada() ? "SI" : "NO";

            System.out.println(
                    "ID: " + t.getId() +
                    " | Nombre: " + t.getNombre() +
                    " | Tipo: " + t.tipoTarea() +
                    " | Prioridad: " + t.getPrioridad() +
                    " | Completada: " + estado
            );
        }

        System.out.println("══════════════════════════════════\n");
    }

    // ===================== COMPLETAR =====================

    public static void marcarComoCompletada(Scanner sc, GestorTareas gestor) {

        if (gestor.estaVacia()) {
            System.out.println("No hay tareas registradas.");
            return;
        }

        int id = Utils.leerEnteroSeguro(sc, "Ingrese ID de la tarea: ");
        gestor.marcarComoCompletada(id);

        System.out.println("Operación realizada.");
    }

    // ===================== ELIMINAR =====================

    public static void eliminarTarea(Scanner sc, GestorTareas gestor) {

        if (gestor.estaVacia()) {
            System.out.println("No hay tareas para eliminar.");
            return;
        }

        int id = Utils.leerEnteroSeguro(sc, "Ingrese ID de la tarea a eliminar: ");
        gestor.eliminar(id);

        System.out.println("Si el ID existía, la tarea fue eliminada.");
    }
}





