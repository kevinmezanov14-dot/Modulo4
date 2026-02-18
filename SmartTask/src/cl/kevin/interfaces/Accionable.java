package cl.kevin.interfaces;

import cl.kevin.objeto.Task;
/**
 * Define el contrato de operaciones básicas que puede realizar
 * cualquier gestor de tareas dentro del sistema.
 * 
 * Aplica el principio SOLID:
 * Dependency Inversion → el sistema depende de abstracciones.
 * Open/Closed → se pueden crear nuevos gestores sin cambiar el código existente.
 * 
 * @author Kevin
 * @version 1.0
 * @since 2026
 */

public interface Accionable {
	
    /**
     * Agrega una nueva tarea al sistema.
     *
     * @param tarea instancia de la tarea a registrar
     */
    void agregar(Task tarea);
    
    /**
     * Elimina una tarea según su identificador único.
     *
     * Si el ID no existe, la operación debe ser ignorada sin provocar errores.
     *
     * @param id identificador de la tarea a eliminar
     */
    void eliminar(int id);
    
    /**
     * Marca una tarea como completada.
     *
     * La implementación debe buscar la tarea por ID y cambiar su estado.
     * Si no existe, no debe lanzar excepciones.
     *
     * @param id identificador de la tarea a actualizar
     */
    void marcarComoCompletada(int id);
}

