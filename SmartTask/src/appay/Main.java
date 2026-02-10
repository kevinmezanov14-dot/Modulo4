package appay;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Task> tareas = new ArrayList<>();
        int contadorId = 1;
        boolean continuar = true;

        do {
            mostrarMenu();

            int opcion = Utils.leerEnteroSeguro(sc, "Seleccione una opcion (0-4): ");

            switch (opcion) {
                case 1:
                    agregarTarea(sc, tareas, contadorId);
                    contadorId++;
                    break;

                case 2:
                    listarTareas(tareas);
                    break;

                case 3:
                    marcarComoCompletada(sc, tareas);
                    break;

                case 4:
                    eliminarTarea(sc, tareas);
                    break;

                case 0:
                    continuar = false;
                    System.out.println("Saliendo de SmartTask.");
                    break;

                default:
                    System.err.println("Opcion invalida.");
            }

        } while (continuar);

        sc.close();
    }
    // ===================== MENU =====================

    public static void mostrarMenu() {
        System.out.println(" ╔═════════════════════════════════╗");
        System.out.println(" ║          SMART TASK             ║");
        System.out.println(" ╠═════════════════════════════════╣");
        System.out.println(" ║ 0. Salir                        ║");
        System.out.println(" ║ 1. Agregar tarea                ║");
        System.out.println(" ║ 2. Listar tareas                ║");
        System.out.println(" ║ 3. Marcar tarea como completada ║");
        System.out.println(" ║ 4. Eliminar tarea               ║");
        System.out.println(" ╚═════════════════════════════════╝");
    }

    // ===================== FUNCIONES =====================

    public static void agregarTarea(Scanner sc, ArrayList<Task> tareas, int id) {

        sc.nextLine(); // limpiar buffer antes de leer texto

        System.out.print("Ingrese nombre de la tarea: ");
        String nombre = sc.nextLine().trim();

        if (nombre.isEmpty()) {
            System.err.println("Debe ingresar nombre.");
            return;
        }

        int prioridad = Utils.leerEnteroSeguro(
            sc,
            "Ingrese prioridad (1-Alta, 2-Media, 3-Baja): "
        );

        Task nueva = new Task(id, nombre, prioridad);
        tareas.add(nueva);

        System.out.println("Tarea agregada correctamente.");
    }


    public static void listarTareas(ArrayList<Task> tareas) {

        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }

        System.out.println("\n═════════ LISTA DE TAREAS ═════════");

        for (Task t : tareas) {
            String estado = t.isCompletada() ? "SI" : "NO";

            System.out.println(
                "ID: " + t.getId() +
                " | Nombre: " + t.getNombre() +
                " | Prioridad: " + t.getPrioridad() +
                " | Completada: " + estado
            );
        }

        System.out.println("══════════════════════════════════\n");
    }

    public static void marcarComoCompletada(Scanner sc, ArrayList<Task> tareas) {
    	// validar si hay tareas
    	if (tareas.isEmpty()) {
    	    System.out.println("No hay tareas registradas.");
    	    return;
    	}


        int id = Utils.leerEnteroSeguro(sc, "Ingrese ID de la tarea: ");

        for (Task t : tareas) {
            if (t.getId() == id) {

                if (t.isCompletada()) {
                    System.out.println("La tarea ya está completada.");
                } else {
                    t.setCompletada(true);
                    System.out.println("Tarea marcada como completada.");
                }
                return;
            }
        }

        System.err.println("Tarea no encontrada.");
    }

    public static void eliminarTarea(Scanner sc, ArrayList<Task> tareas) {
        //  Validar si hay tareas
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas para eliminar.");
            return;
        }
        // leer ID de forma segura
        int id = Utils.leerEnteroSeguro(sc, "Ingrese ID de la tarea a eliminar: ");
        // buscar y eliminar
        for (int i = 0; i < tareas.size(); i++) { // i es el indice tareas.size me devuelve cuantas tareas hay y el i++ pasa a la siguiente
        	if (tareas.get(i).getId() == id) { // compara el id ingresado con el de la tarea si coincide se encuentra la tarea
        		tareas.remove(i); // elimina la tarea en la posición i y se desplaza todas las otras
        		System.out.println("Tarea eliminada correctamente.");
        		return;
        	}
        }
        // si no se encontro la tarea
        System.err.println("Tarea no encontrada.");
    }
}




