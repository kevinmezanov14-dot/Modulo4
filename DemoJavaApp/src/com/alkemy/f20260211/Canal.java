package com.alkemy.f20260211;

public class Canal {
	//atributos
	int id;
	String nombre;
	
	// constructores
	public Canal(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
		
	}
	// metodos
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
	public Canal() {
		super();
	}
	
}
