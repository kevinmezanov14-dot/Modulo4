package cl.kevin.servicio;

import java.util.ArrayList;

import cl.kevin.interfaces.Accionable;
import cl.kevin.objeto.Task;
import cl.kevin.objeto.TareaNormal;
import cl.kevin.objeto.TareaUrgente;

/**
 * Capa de negocio del sistema.
 * Aquí viven TODAS las reglas:
 * Validaciones
 * Creación de tareas
 * Generación de ID
 * Decidir tipos de tarea
 * 
 * @author Kevin
 * @version 1.0
 * @since 2026
 */
public class GestorTareas implements Accionable {
    /**
     * Colección interna de tareas.
     * Se mantiene encapsulada para evitar modificaciones externas.
     */

    private ArrayList<Task> tareas = new ArrayList<>();
    private int contadorId = 1; // Autoincremento interno simula comportamiento base de datos.

    // ===================== CREAR =====================

    /**
     * crea la tarea .
     * Decide si la tarea es normal o urgente.
     * @param nombre descripción de la tarea
     * @param prioridad nivel de prioridad (1 = urgente)
     * @throws IllegalArgumentException si el nombre es inválido
     */
    public void crearTarea(String nombre, int prioridad) {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        
        //validar que la prioridad sea 1,2 o 3   
        if (prioridad < 1 || prioridad > 3) {
            throw new IllegalArgumentException("Prioridad inválida. Debe ser 1, 2 o 3.");
        }


        Task nueva;

        // Polimorfismo el gestor decide la implementación concreta. 
        if (prioridad == 1) {
            nueva = new TareaUrgente(contadorId, nombre);
        } else {
            nueva = new TareaNormal(contadorId, nombre, prioridad);
        }

        tareas.add(nueva);
        contadorId++;
    }

    // ===================== CRUD =====================
    /**
     * Agrega una tarea ya creada.
     *
     * Este método existe para permitir pruebas
     *
     * @param tarea instancia de tarea a registrar
     */

    @Override
    public void agregar(Task tarea) {
        tareas.add(tarea);
    }
    
    /**
     * Elimina una tarea según su identificador.
     *
     * Si el ID no existe, la operación se ignora silenciosamente.
     *
     * @param id identificador de la tarea a eliminar
     */

    @Override
    public void eliminar(int id) {
        tareas.removeIf(t -> t.getId() == id);
    }
    
    /**
     * Marca como completada la tarea indicada.
     *
     * Uso de Streams permite expresar la intención de forma declarativa:
     * "buscar y actualizar" sin exponer iteraciones manuales.
     *
     * Si la tarea no existe, no ocurre ningún cambio.
     *
     * @param id identificador de la tarea
     */

    @Override
    public void marcarComoCompletada(int id) {
        tareas.stream() //Permite filtrar, transformar, ordenar o agrupar datos sin modificar la fuente original
              .filter(t -> t.getId() == id)
              .forEach(t -> t.setCompletada(true));
    }

    // ===================== CONSULTAS =====================

    /**
     * Retorna una copia de la lista de tareas.
     *
     * Se devuelve una NUEVA lista para proteger el encapsulamiento
     * (Defensive Copy). Así evitamos que código externo modifique
     * directamente la colección interna.
     *
     * @return copia de las tareas actuales
     */
    public ArrayList<Task> listar() {
        return new ArrayList<>(tareas); // entrega copia de la lista
    }
    /**
     * Indica si no existen tareas registradas.
     *
     * @return true si el gestor no contiene tareas
     */
    public boolean estaVacia() {
        return tareas.isEmpty();
    }
}



