package cl.kevin.objeto;

/**
 * Representa una tarea común definida por el usuario.
 * La prioridad puede variar.
 */
public class TareaNormal extends Task {

    /**
     * Constructor que permite definir prioridad libremente.
     */
    public TareaNormal(int id, String nombre, int prioridad) {
        super(id, nombre, prioridad);
    }

    /**
     * Implementación del comportamiento polimórfico.
     */
    @Override
    public String tipoTarea() {
        return "Normal"; 
    }
}

