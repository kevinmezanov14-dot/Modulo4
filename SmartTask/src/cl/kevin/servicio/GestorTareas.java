package cl.kevin.servicio;

import java.util.ArrayList;

import cl.kevin.interfaces.Accionable;
import cl.kevin.objeto.Task;
import cl.kevin.objeto.TareaNormal;
import cl.kevin.objeto.TareaUrgente;

/**
 * Capa de negocio del sistema.
 * Aquí viven TODAS las reglas:
 *  - Validaciones
 *  - Creación de tareas
 *  - Generación de ID
 *  - Decidir tipos de tarea
 */
public class GestorTareas implements Accionable {

    private ArrayList<Task> tareas = new ArrayList<>();
    private int contadorId = 1; // Autoincremento interno

    // ===================== CREAR =====================

    /**
     * Regla de negocio para crear tareas.
     * Decide si la tarea es normal o urgente.
     */
    public void crearTarea(String nombre, int prioridad) {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }

        Task nueva;

        // POLIMORFISMO CONTROLADO POR EL DOMINIO
        if (prioridad == 1) {
            nueva = new TareaUrgente(contadorId, nombre);
        } else {
            nueva = new TareaNormal(contadorId, nombre, prioridad);
        }

        tareas.add(nueva);
        contadorId++;
    }

    // ===================== CRUD =====================

    @Override
    public void agregar(Task tarea) {
        tareas.add(tarea);
    }

    @Override
    public void eliminar(int id) {
        tareas.removeIf(t -> t.getId() == id);
    }

    @Override
    public void marcarComoCompletada(int id) {
        tareas.stream()
              .filter(t -> t.getId() == id)
              .forEach(t -> t.setCompletada(true));
    }

    // ===================== CONSULTAS =====================

    public ArrayList<Task> listar() {
        return new ArrayList<>(tareas); // entrega copia de la lista
    }

    public boolean estaVacia() {
        return tareas.isEmpty();
    }
}



