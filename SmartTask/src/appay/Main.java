package appay;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal del sistema SmartTask.
 * Permite agregar, listar, completar y eliminar tareas
 * mediante un menu interactivo por consola.
 * @author kevin
 * @version 1.0
 * @since 2026-02-09
 * 
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Scanner para entrada de datos
		ArrayList<Task> tareas = new ArrayList<>(); // lista de tareas
		int contadorId = 1; // genera IDs automaticos
		boolean continuar = true; // controla el ciclo del programa

		// menu principal (igual a la calculadora)
		do {

			mostrarMenu();

			int opcion;
			try {
				opcion = sc.nextInt();
			} catch (Exception e) {
				System.err.println("Error: debe ingresar un numero.");
				sc.nextLine();
				continue;
			}

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

	/**
	 * Muestra el menu principal por consola.
	 */ 
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
		System.out.print("Seleccione una opcion (0-4): ");
	}


	/**
	 * Permite agregar una nueva tarea.
	 */
	public static void agregarTarea(Scanner sc, ArrayList<Task> tareas, int id) {
		sc.nextLine(); // limpiar buffer

		System.out.print("Ingrese nombre de la tarea: ");
		String nombre = sc.nextLine().trim();
		if (nombre.isEmpty()) {
			System.err.println("Debe ingresar nombre.");
			return;
		}

		System.out.print("Ingrese prioridad (1-Alta, 2-Media, 3-Baja): ");
		int prioridad = sc.nextInt();

		Task nueva = new Task(id, nombre, prioridad);
		tareas.add(nueva);

		System.out.println("Tarea agregada correctamente.");
	}

	/**
	 * Lista todas las tareas registradas.
	 */
	public static void listarTareas(ArrayList<Task> tareas) {
		if (tareas.isEmpty()) {
			System.out.println("No hay tareas registradas.");
			return;
		}

		for (Task t : tareas) {
			System.out.println(
					"ID: " + t.id +
					" | Nombre: " + t.nombre +
					" | Prioridad: " + t.prioridad +
					" | Completada: " + t.completada
					);
		}
	}

	/**
	 * Marca una tarea como completada usando su ID.
	 */
	public static void marcarComoCompletada(Scanner sc, ArrayList<Task> tareas) {
		System.out.print("Ingrese ID de la tarea: ");
		int id = sc.nextInt();

		for (Task t : tareas) {
			if (t.id == id) {
				t.completada = true;
				System.out.println("Tarea marcada como completada.");
				return;
			}
		}

		System.err.println("Tarea no encontrada.");
	}

	/**
	 * Elimina una tarea por su ID.
	 */
	public static void eliminarTarea(Scanner sc, ArrayList<Task> tareas) {
		System.out.print("Ingrese ID de la tarea a eliminar: ");
		int id = sc.nextInt();

		for (int i = 0; i < tareas.size(); i++) {
			if (tareas.get(i).id == id) {
				tareas.remove(i);
				System.out.println("Tarea eliminada.");
				return;
			}
		}

		System.err.println("Tarea no encontrada.");
	}
}

