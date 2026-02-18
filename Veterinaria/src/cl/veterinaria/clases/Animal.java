package cl.veterinaria.clases;
/**
 * Super Clase Padre
 */
public abstract class Animal implements AnimalBase{
	private String nombre;
	private double peso;
//constructor	
	protected Animal(String nombre, double peso) {
		//this.nombre = nombre;
		//this.peso = peso;
		setNombre(nombre);
		setPeso(peso);
	}
	
//getters & setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre == null || nombre.trim().isEmpty()) {
			System.err.println("Error en el ingreso del nombre");
			throw new IllegalArgumentException("Error en el ingreso del nombre");
		}
		
		this.nombre = nombre.trim();
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso <= 0) {
			throw new IllegalArgumentException("El peso debe ser mayor a cero");
		}
		this.peso = peso;
	}
//metodos
	@Override
	public abstract void comer();
	
	public abstract void dormir();

	@Override
	public String toString() {
		return getClass().getSimpleName() +" nombre=" + nombre + ", peso=" + peso ;
	}
	
	
	
}
