package cl.kevin.objeto;

/**
 * Representa una tarea dentro del sistema SmartTask.
 * Cada tarea tiene un id, nombre, prioridad y estado.
 * @author kevin
 * @version 1.0
 * @since 2026-02-09
 */
public class Task {

    private int id;              // identificador de la tarea
    private String nombre;       // nombre de la tarea
    private int prioridad;       // prioridad (1 = alta, 2 = media, 3 = baja)
    private boolean completada;  // estado de la tarea

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

	public int getId() {
		return id;
	}

	//public void setId(int id) {
		//this.id = id;
	//}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public boolean isCompletada() {
		return completada;
	}

	public void setCompletada(boolean completada) {
		this.completada = completada;
	}
    
}



