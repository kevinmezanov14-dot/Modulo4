package cl.kevin.objeto;

/**
 * Clase abstracta base para cualquier tipo de tarea.
 */
public abstract class Task {

    protected int id;
    protected String nombre;
    protected int prioridad;
    protected boolean completada;

    public Task(int id, String nombre, int prioridad) {
        this.id = id;
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.completada = false;
    }

    public int getId() { return id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getPrioridad() { return prioridad; }

    public void setPrioridad(int prioridad) { this.prioridad = prioridad; }

    public boolean isCompletada() { return completada; }

    public void setCompletada(boolean completada) { this.completada = completada; }

    // MÉTODO POLIMÓRFICO
    public abstract String tipoTarea();
}




