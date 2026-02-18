package cl.kevin.objeto;

/**
 * Representa una tarea común definida por el usuario.
 * La prioridad puede variar.
 */
public class TareaNormal extends Task {


    /**
     * Crea una tarea normal con prioridad configurable.
     *
     * @param id identificador único generado por el sistema
     * @param nombre descripción de la tarea
     * @param prioridad nivel de prioridad definido por el usuario
     */
    public TareaNormal(int id, String nombre, int prioridad) {
        super(id, nombre, prioridad);
    }

    /**
     * Devuelve el tipo concreto de tarea.
     * Este método es utilizado por el sistema para aplicar polimorfismo
     * sin necesidad de validar con instanceof.
     *
     * @return "Normal"
     */
    @Override
    public String tipoTarea() {
        return "Normal"; 
    }
}

