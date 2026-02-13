package cl.kevin.objeto;

public class TareaUrgente extends Task {

    public TareaUrgente(int id, String nombre) {
        super(id, nombre, 1); // siempre prioridad alta
    }

    @Override
    public String tipoTarea() {
        return "URGENTE";
    }
}
