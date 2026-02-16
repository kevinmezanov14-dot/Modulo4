package cl.kevin.objeto;

/**
 * Representa una tarea crítica o urgente.
 * Siempre tiene prioridad alta automáticamente.
 */
public class TareaUrgente extends Task {

    /**
     * Constructor:
     * No pide prioridad porque SIEMPRE será prioridad 1.
     */
    public TareaUrgente(int id, String nombre) {
        super(id, nombre, 1); // prioridad fija (alta)
    }

    /**
     * Implementación del método polimórfico.
     */
    @Override
    public String tipoTarea() {
        return "Urgente";
    }
}

