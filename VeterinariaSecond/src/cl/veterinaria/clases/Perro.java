package cl.veterinaria.clases;

public class Perro extends Animal {
	private String raza;

	public Perro(int id, String nombre, double peso, String raza) {
		super(id, nombre, peso);
		this.raza = raza;
	}

	@Override
	public String hacerRuido() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void moverse() {
		// TODO Auto-generated method stub
		
	}
	// el metodo comer ya esta heredado del padre, no es necesario implementarlo.
	// si se desea se puede sobreescribir.
	@Override
	public void comer() {
		System.out.println("El perro de nombre "+getNombre()+" está comiendo");
}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
}
