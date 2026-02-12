package Clases;

public class Pez implements Mascota {

	@Override
	public String hacerRuido() {
		// TODO Auto-generated method stub
		return "glup-glup";
	}

	@Override
	public void comer() {
		System.out.println("El pez bebe");
		
	}

	@Override
	public void moverse() {
		System.out.println();
		
	}

}
