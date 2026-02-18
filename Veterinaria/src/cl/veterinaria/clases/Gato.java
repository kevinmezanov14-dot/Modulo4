package cl.veterinaria.clases;

public class Gato extends Animal{
	//atributos
	private String raza;
	//constructores
	public Gato(String nombre, double peso) {
		super(nombre, peso);
	}

	public Gato(String nombre, double peso, String raza) {
		super(nombre, peso);
		setRaza(raza);
	}

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
		return "Miau";
	}

	@Override
	public void moverse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return super.toString() + " raza=" + raza ;
	}



}
