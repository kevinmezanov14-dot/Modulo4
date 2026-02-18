package cl.kevin.objeto;

/**
 * Clase abstracta que representa el concepto general de una tarea.
 * No se puede instanciar directamente.
 *
 * Sirve como base para aplicar HERENCIA y POLIMORFISMO,
 * permitiendo que existan distintos tipos de tareas (Normal, Urgente, etc.)
 * 
 * @author Kevin
 * @version 1.0
 * @since 2026
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
     * Constructor base utilizado por todas las subclases.
     *
     * Centraliza la inicialización del estado común de cualquier tarea.
     * Toda tarea creada inicia automáticamente como pendiente
     *
     * @param id identificador único generado por el sistema
     * @param nombre descripción de la tarea
     * @param prioridad nivel de prioridad asignado
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
    /**
     * @return identificador único de la tarea
     */
    public int getId() { 
    	return id; }

    /**
     * @return nombre o descripción de la tarea
     */
    public String getNombre() { 
    	return nombre; }

    /**
     * Permite modificar la descripción.
     *
     * @param nombre nuevo nombre de la tarea
     */
    public void setNombre(String nombre) { 
    	this.nombre = nombre; }

    /**
     * @return prioridad asignada
     */
    public int getPrioridad() { 
    	return prioridad; }

    /**
     * Permite cambiar la prioridad según reglas del negocio.
     *
     * @param prioridad nuevo nivel de prioridad
     */
    public void setPrioridad(int prioridad) { 
    	this.prioridad = prioridad; }

    /**
     * @return true si la tarea fue completada
     */
    public boolean isCompletada() { 
    	return completada; }
    
     /**
     * Cambia el estado de la tarea.
     *
     * @param completada nuevo estado
     */
    public void setCompletada(boolean completada) { 
    	this.completada = completada; }

    /**
     * Define el tipo concreto de tarea.
     *
     * Este método obliga a cada subclase a identificarse,
     * permitiendo al sistema trabajar de forma polimórfica
     * 
     * El sistema NO necesita preguntar con instanceof,
     * cumpliendo el principio Open/Closed.
     *
     * @return nombre lógico del tipo de tarea
     */
    public abstract String tipoTarea();
}





