package cl.veterinaria.clases;

import cl.veterinaria.interfaces.AnimalInterface;

public abstract class Animal implements AnimalInterface {
	private int id;
	private String nombre;
	private double peso;
	public Animal(int id, String nombre, double peso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.peso = peso;
	}
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if(nombre == null || nombre.trim().isEmpty()) {
			throw new IllegalArgumentException("Error en el ingreso del nombre del animal");
		}
		this.nombre = nombre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if(peso <= 0) {
			System.out.println("Error en el ingreso del peso del animal");
			//excepcion
			throw new IllegalArgumentException("Error en el ingreso del peso del animal");
		}
		this.peso = peso;
	}
	public int getId() {
		return id;
	}
	@Override
	public abstract String hacerRuido();
	@Override
	public void comer() {
		System.out.println(" "+nombre+" está comiendo");
		
	}
	@Override
	public void dormir() {
		System.out.println(" "+nombre+" está dormiendo");
		
	}
	@Override
	public abstract void moverse();
	
	@Override
	public String toString() {
		return "Animal [id=" + id + ", nombre=" + nombre + ", peso=" + peso + "]";
	}
	
}
