package Clases;

public class Pez extends Animal{

	public Pez(String nombre, double peso) {
		super(nombre, peso);
	}

	@Override
	public String hacerRuido() {
		return "Gluuup";
	}

	@Override
	public void comer() {
		System.out.println("El pez come algas");
		
	}

	@Override
	public void moverse() {
		System.out.println("El pez nada");
		
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

}
