package cl.kevin.interfaces;

import cl.kevin.objeto.Task;

public interface Accionable {

    void agregar(Task tarea);
    void eliminar(int id);
    void marcarComoCompletada(int id);
}

