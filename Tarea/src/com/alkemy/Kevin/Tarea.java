package com.alkemy.Kevin;

/**
 * Representa una tarea dentro del sistema SmartTask.
 * Cada tarea tiene un id, nombre, prioridad y estado.
 * @author kevin
 * @version 1.0
 * @since 2026-02-09
 */
public class Tarea {
	//atributos
	int id; 
	String nombre; 
	String descripcion; 
	String prioridad;
	boolean completado;
	//constructores
	public Tarea() {
	}
	public Tarea(int id, String nombre, String descripcion, String prioridad, boolean completado) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.prioridad = prioridad;
		this.completado = completado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}
	public boolean isCompletado() {
		return completado;
	}
	public void setCompletado(boolean completado) {
		this.completado = completado;
	}
	
	//métodos (comportamientos)
}