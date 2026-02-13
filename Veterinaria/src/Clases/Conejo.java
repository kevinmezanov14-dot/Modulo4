package Clases;

public class Conejo extends Animal{

	public Conejo(String nombre, double peso) {
		super(nombre, peso);
	}

	@Override
	public String hacerRuido() {
		return "yiiiiiii";
	}

	@Override
	public void comer() {
		System.out.println("El conejo come zanahorias");
		
	}

	@Override
	public void moverse() {
		// TODO Auto-generated method stub
		
	}

	public void dormir() {
		System.out.println("Tiempo de dormir");
	}

}
