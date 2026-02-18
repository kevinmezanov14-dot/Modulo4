package cl.kevin.objeto;

/**
 * Representa una tarea crítica que requiere atención inmediata.
 *
 * A diferencia de TareaNormal, este tipo de tarea posee
 * prioridad fija ALTA (valor = 1), definida automáticamente por el sistema.
 *
 * El usuario no puede modificar su prioridad, ya que responde
 * a una regla de negocio: toda tarea urgente debe tratarse
 * antes que cualquier otra.
 *
 */
public class TareaUrgente extends Task {

    /**
     * Crea una tarea urgente con prioridad forzada a 1 (Alta).
     *
     * @param id identificador único generado por el sistema
     * @param nombre descripción de la tarea crítica
     */
    public TareaUrgente(int id, String nombre) {
        super(id, nombre, 1); // prioridad fija (alta)
    }

    /**
     * Identifica el tipo concreto de tarea dentro del sistema.
     * Utilizado para comportamiento polimórfico sin validaciones condicionales.
     *
     * @return "Urgente"
     */
    @Override
    public String tipoTarea() {
        return "Urgente";
    }
}

