package com.alkemy.f20260212;
/**
 * Molde o plantilla
 */
public class Coche {
	//atributos
	protected String color;
	protected String marca;
	protected String modelo;
	protected String combustible;
	//constructores
	//permite asignar valores iniciales a los atributos (estado)
	//constructor vacio, asignar o cambiar el estado a posterior
	
	
	public Coche(String color, String marca, String modelo, String combustible) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.combustible = combustible;
	}
	public Coche() {
		super();
	}
	// metodo
	
	public void encender() {
		System.out.println("el coche ya esta encendido");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCombustible() {
		return combustible;
	}
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	
	
}

