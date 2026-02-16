package cl.kevin.objeto;

/**
 * Clase abstracta que representa el concepto general de una tarea.
 * No se puede instanciar directamente.
 *
 * Sirve como base para aplicar HERENCIA y POLIMORFISMO,
 * permitiendo que existan distintos tipos de tareas (Normal, Urgente, etc.)
 */
public abstract class Task {

    /**
     * Identificador único de la tarea.
     */
    protected int id;

    /**
     * Nombre o descripción de la tarea.
     */
    protected String nombre;

    /**
     * Nivel de prioridad de la tarea.
     * Mientras menor el número, mayor prioridad.
     */
    protected int prioridad;

    /**
     * Estado de la tarea:
     * false = pendiente
     * true  = completada
     */
    protected boolean completada;

    /**
     * Constructor base utilizado por las subclases.
     */
    public Task(int id, String nombre, int prioridad) {
        this.id = id;
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.completada = false; // toda tarea inicia pendiente
    }

    // =========================
    // GETTERS Y SETTERS
    // =========================

    public int getId() { return id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getPrioridad() { return prioridad; }

    public void setPrioridad(int prioridad) { this.prioridad = prioridad; }

    public boolean isCompletada() { return completada; }

    public void setCompletada(boolean completada) { this.completada = completada; }

    /**
     * Método ABSTRACTO que obliga a cada tipo de tarea
     * a definir cómo se identifica.
     *
     * Aquí ocurre el POLIMORFISMO.
     */
    public abstract String tipoTarea();
}





