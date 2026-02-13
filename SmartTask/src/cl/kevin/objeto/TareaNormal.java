package cl.kevin.objeto;

public class TareaNormal extends Task {

    public TareaNormal(int id, String nombre, int prioridad) {
        super(id, nombre, prioridad);
    }

    @Override
    public String tipoTarea() {
        return "NORMAL";
    }
}
