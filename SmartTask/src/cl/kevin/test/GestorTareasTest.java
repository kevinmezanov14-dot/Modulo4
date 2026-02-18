package cl.kevin.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Clases del sistema que vamos a probar
import cl.kevin.objeto.TareaNormal;
import cl.kevin.objeto.TareaUrgente;
import cl.kevin.objeto.Task;
import cl.kevin.servicio.GestorTareas;

/**
 * Suite de pruebas unitarias para GestorTareas.
 * Aquí verificamos que el CRUD funcione correctamente:
 * Crear (agregar)
 * Leer (listar)
 * Actualizar (marcar completada)
 * Eliminar
 */
class GestorTareasTest {

    // Sistema bajo prueba (SUT = System Under Test)
    private GestorTareas gestor;

    // Objetos de apoyo para las pruebas
    private Task tarea1;
    private Task tarea2;

    /**
     * Inicializa un nuevo GestorTareas antes de cada prueba.
     *
     * Esto asegura:
     * Aislamiento entre tests (principio de independencia).
     * Repetibilidad de resultados.
     * Que no exista estado compartido entre ejecuciones.
     */
    @BeforeEach
    void setup() {
        gestor = new GestorTareas(); // gestor nuevo en cada test

        // Creamos tareas de ejemplo reutilizables
        tarea1 = new TareaNormal(1, "Estudiar JUnit", 2);
        tarea2 = new TareaUrgente(2, "Entrega hoy");
    }
    /**
     * No se requiere @AfterEach porque:
     * No usamos base de datos.
     * No abrimos archivos.
     * No hay conexiones de red.
     * No existen recursos externos que liberar.
     *
     * Todas las pruebas trabajan únicamente en memoria.

    // ========================= ESTADO INICIAL =========================

    /**
     * Verifica que el gestor comience vacío.
     * Esto valida el constructor.
     */
    @Test
    void gestorDebeIniciarVacio() {
        assertTrue(gestor.estaVacia());          // debería estar vacío
        assertEquals(0, gestor.listar().size()); // la lista debe tener tamaño 0
    }

    // ========================= AGREGAR =========================

    /**
     * Verifica que una tarea se agregue correctamente.
     */
    @Test
    void agregarTareaTest() {

        gestor.agregar(tarea1); // acción a probar

        // Validamos que se agregó
        assertEquals(1, gestor.listar().size());

        // Validamos que la tarea guardada sea la correcta
        assertEquals("Estudiar JUnit", gestor.listar().get(0).getNombre());
    }

    /**
     * Verifica que el gestor soporte múltiples tareas.
     */
    @Test
    void deberiaAgregarMultiplesTareas() {

        gestor.agregar(tarea1);
        gestor.agregar(tarea2);

        assertEquals(2, gestor.listar().size());
    }
    /**
     * Verifica que el sistema cree automáticamente una TareaUrgente
     * cuando se solicita la creación de una tarea con prioridad 1 (Alta).
     * La tarea creada debe identificarse como "Urgente".
     */
    @Test
    void crearTareaUrgenteTest() {

        gestor.crearTarea("Incidente producción", 1);

        assertEquals("Urgente", gestor.listar().get(0).tipoTarea());
    }
    /**
     * Verifica que el sistema lance una IllegalArgumentException
     * cuando se intenta crear una tarea con un nombre vacío o nulo.
     */

    @Test
    void crearTareaConPrioridadInvalidaDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class,
            () -> gestor.crearTarea("Prueba", 99));
    }




    // ========================= LISTAR =========================

    /**
     * Verifica que listar devuelva correctamente las tareas almacenadas.
     */
    @Test
    void listarTareasTest() {

        gestor.agregar(tarea1);
        gestor.agregar(tarea2);

        assertFalse(gestor.estaVacia());          // ya no debería estar vacío
        assertEquals(2, gestor.listar().size());  // deben existir 2 tareas
    }

    // ========================= MARCAR COMO COMPLETADA =========================

    /**
     * Verifica que una tarea pueda marcarse como completada.
     */
    @Test
    void marcarTareaTest() {

        gestor.agregar(tarea1);

        gestor.marcarComoCompletada(1); // buscamos por ID

        assertTrue(gestor.listar().get(0).isCompletada());
    }

    /**
     * Caso borde:
     * Si se marca dos veces, no debe romperse ni cambiar el resultado.
     */
    @Test
    void marcarTareaYaCompletadaDebeMantenerEstado() {

        gestor.agregar(tarea1);

        gestor.marcarComoCompletada(1);
        gestor.marcarComoCompletada(1); // repetir acción

        assertTrue(gestor.listar().get(0).isCompletada());
    }

    /**
     * Caso borde:
     * Intentar marcar una tarea que NO existe.
     * El sistema debe ignorarlo sin lanzar error.
     */
    @Test
    void marcarTareaInexistenteNoDebeFallar() {

        gestor.agregar(tarea1);

        gestor.marcarComoCompletada(999); // ID inexistente

        assertFalse(gestor.listar().get(0).isCompletada());
    }

    // ========================= ELIMINAR =========================

    /**
     * Verifica que eliminar quite correctamente una tarea por ID.
     */
    @Test
    void eliminarTareaTest() {

        gestor.agregar(tarea1);
        gestor.agregar(tarea2);

        gestor.eliminar(1);

        // Debe quedar solo una tarea
        assertEquals(1, gestor.listar().size());

        // Y debe ser la tarea2
        assertEquals(2, gestor.listar().get(0).getId());
    }

    /**
     * Caso borde:
     * Eliminar algo que no existe no debe afectar la lista.
     */
    @Test
    void eliminarTareaInexistenteNoDebeModificarLista() {

        gestor.agregar(tarea1);

        gestor.eliminar(999);

        assertEquals(1, gestor.listar().size());
    }

    /**
     * Verifica que al eliminar todo, el gestor quede vacío.
     */
    @Test
    void eliminarTodasLasTareasDebeDejarGestorVacio() {

        gestor.agregar(tarea1);
        gestor.agregar(tarea2);

        gestor.eliminar(1);
        gestor.eliminar(2);

        assertTrue(gestor.estaVacia());
    }

    // ========================= POLIMORFISMO =========================

    /**
     * Verifica que el gestor soporte distintos tipos de tareas
     * usando herencia (principio de polimorfismo).
     */
    @Test
    void deberiaAceptarDistintosTiposDeTarea() {

        Task otra = new TareaUrgente(3, "Reunión crítica");

        gestor.agregar(otra);

        assertEquals(1, gestor.listar().size());

        // Validamos comportamiento polimórfico
        assertEquals("Urgente", gestor.listar().get(0).tipoTarea());
    }
}



