# SmartTask — Gestor de Tareas en Consola (Java)

**SmartTask** es una aplicación de consola desarrollada en Java que permite gestionar tareas personales de forma simple y escalable.
El proyecto fue construido como base educativa para aplicar fundamentos de programación, buenas prácticas de diseño y pruebas unitarias.

---

## Objetivo del Proyecto

Desarrollar una herramienta de gestión de tareas que permita:

* Agregar tareas con prioridad.
* Listar tareas registradas.
* Marcar tareas como completadas.
* Eliminar tareas por ID.
* Aplicar Programación Orientada a Objetos (POO).
* Implementar pruebas unitarias con JUnit 5.
* Mantener una arquitectura modular preparada para escalar a GUI o Web.

---

## Tecnologías Utilizadas

* **Java JDK 8+**
* **Programación Orientada a Objetos**
* **JUnit 5**
* **JavaDoc**
* **Aplicación de consola (CLI)**

---

## Estructura del Proyecto

```
SmartTask/
│
├── src/
│   ├── cl.kevin/
│   │   ├── Main.java                → Punto de entrada (UI consola)
│   │
│   ├── cl.kevin.objeto/
│   │   ├── Task.java                → Clase abstracta base
│   │   ├── TareaNormal.java         → Implementación estándar
│   │   └── TareaUrgente.java        → Implementación prioritaria
│   │
│   ├── cl.kevin.interfaces/
│   │   └── Accionable.java          → Contrato de operaciones
│   │
│   ├── cl.kevin.servicio/
│   │   └── GestorTareas.java        → Lógica del sistema (CRUD)
│   │
│   ├── cl.kevin.utils/
│   │   └── Utils.java               → Validaciones de entrada
│   │
│   └── cl.kevin.test/
│       └── GestorTareasTest.java    → Pruebas unitarias
│
└── README.md
```

---

## Conceptos Aplicados

*  Encapsulamiento
*  Herencia
*  Polimorfismo
*  Interfaces
*  Principio de Responsabilidad Única (SRP)
*  Bajo acoplamiento
*  Manejo de excepciones
*  Arquitectura modular
*  Testing automatizado

---

##   Cómo Ejecutar el Proyecto

### * Ejecutar desde el `.jar`

```bash
java -jar SmartTask.jar
```

---

###   Ejecutar desde un IDE (Eclipse / VSCode)

1. Importar el proyecto como **Existing Java Project**.
2. Ejecutar la clase:

```
Main.java
```

---

##   Funcionalidades Disponibles

```
╔═════════════════════════════════╗
║          SMART TASK             ║
╠═════════════════════════════════╣
║ 0. Salir                        ║
║ 1. Agregar tarea                ║
║ 2. Listar tareas                ║
║ 3. Marcar como completada       ║
║ 4. Eliminar tarea               ║
╚═════════════════════════════════╝
```

---

##   Pruebas Unitarias

El proyecto incluye pruebas automatizadas sobre:

* Creación de tareas
* Eliminación
* Marcado de completado
* Polimorfismo
* Casos borde
* Validaciones del sistema

### Ejecutar Tests

```
Run As → JUnit Test
```

Cobertura esperada: **≥ 80% del código base**

---

## Documentación Técnica

La documentación fue generada con:

```
JavaDoc
```

Incluye descripción de clases, métodos y arquitectura del sistema.

---

##   Posibles Mejoras Futuras

* Persistencia en Base de Datos (JPA / JDBC)
* Exportación a JSON
* Sistema de usuarios
* Fechas límite y recordatorios
* Notificaciones

---

## Autor

**Kevin**

Proyecto desarrollado como práctica integral del módulo
**Fundamentos de Programación en Java**.

---

## Licencia

Uso educativo — libre para aprendizaje, mejora y ampliación del proyecto.
