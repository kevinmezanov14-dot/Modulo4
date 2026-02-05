package appay;

/**
 * Representa una tarea dentro del sistema SmartTask.
 * Cada tarea tiene un id, nombre, prioridad y estado.
 */
public class Task {

    int id;              // identificador de la tarea
    String nombre;       // nombre de la tarea
    int prioridad;       // prioridad (1 = alta, 2 = media, 3 = baja)
    boolean completada;  // estado de la tarea

    /**
     * Constructor de la clase Tarea
     * @param id identificador único
     * @param nombre nombre de la tarea
     * @param prioridad prioridad de la tarea
     */
    public Task(int id, String nombre, int prioridad) {
        this.id = id;
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.completada = false;
    }
}


