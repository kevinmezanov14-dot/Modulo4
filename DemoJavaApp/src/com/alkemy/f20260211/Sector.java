package com.alkemy.f20260211;

public class Sector {
	
	// atributos
	private int id;
	private String nombre;
	// constructores
	public Sector(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	// metodos
	public Sector() {
		super();
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
	@Override
	public String toString() {
		return "Sector [id=" + id + ", nombre=" + nombre + "]";
	}
	
	

}
