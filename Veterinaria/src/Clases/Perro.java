package Clases;

/**
 * Subclase de la clase padre Animal
 */
public class Perro extends Animal{
//atributo
	private String raza;
//constructor
	public Perro(String nombre, double peso, String raza) {
		super(nombre, peso);
		setRaza(raza);
	}
//get and set
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		if(raza == null || raza.trim().isEmpty()) {
			System.err.println("Error en el ingreso de la raza");
			throw new IllegalArgumentException("Error en el ingreso de la raza");
		}
		this.raza = raza.trim();
	}
//metodos
	@Override
	public String hacerRuido() {
		return "Guau";
	}

	@Override
	public void moverse() {
		System.out.println("Es un cuadrupedo");
		
	}

	@Override
	public void comer() {
		System.out.println("Carnivoro y mueve la cola");
	}

	@Override
	public void dormir() {
		System.out.println("Duermen mas de 12 horas");
	}

	@Override
	public String toString() {
		//super.toString();
		String mensaje = "Mi Perro se llama " +super.getNombre()+
				", su raza es: "+ raza + " y pesa: " + super.getPeso() +" kilos.";
		return mensaje;
	}





}



