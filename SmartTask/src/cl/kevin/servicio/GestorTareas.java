package cl.kevin.servicio;

import java.util.ArrayList;
import cl.kevin.interfaces.Accionable;
import cl.kevin.objeto.Task;

public class GestorTareas implements Accionable {

    private ArrayList<Task> tareas = new ArrayList<>();

    @Override
    public void agregar(Task tarea) {
        tareas.add(tarea);
    }

    @Override
    public void eliminar(int id) {
        tareas.removeIf(t -> t.getId() == id);
    }

    @Override
    public void marcarComoCompletada(int id) {
        for (Task t : tareas) {
            if (t.getId() == id) {
                t.setCompletada(true);
            }
        }
    }

    public ArrayList<Task> listar() {
        return tareas;
    }

    public boolean estaVacia() {
        return tareas.isEmpty();
    }
}

