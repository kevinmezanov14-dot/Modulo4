package Clases;

public class Animal {

    // Atributos
    private String nombre;
    private double peso;

    // Constructor
    public Animal(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // MÉTODOS DE COMPORTAMIENTO GENERAL
    
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    public String emitirSonido() {
        return "Sonido genérico de animal";
    }

	public String mostrarDatos() {
		return "Tu mascota es: " + nombre + ", pesa " + peso + "kg" ;
	}


}

