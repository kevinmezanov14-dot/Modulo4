package Clases;

public class Conejo implements Mascota {

	@Override
	public String hacerRuido() {
		// TODO Auto-generated method stub
		return "coui coui";
	}

	@Override
	public void comer() {
		System.out.println("El conejo se prepara para la hora del platano, chi cheñol");
		
	}

	@Override
	public void moverse() {
		System.out.println("Salta");
		
	}

}
