package com.alkemy.f20260212;
// heredamos desde clase coche
public class CocheElectrico extends Coche {
	
	
	private int kmAutonomia; //500km

	public CocheElectrico() {
		super(); // llamado al constructor de la clase coche (padre)
	}

	public CocheElectrico(String color, String marca, String modelo, String combustible) {
		// constructor con parametros de la Super clase Coche
		super(color, marca, modelo, combustible);
	}

	public CocheElectrico(int kmAutonomia) {
		super();
		this.kmAutonomia = kmAutonomia;
	}

	public CocheElectrico(String color, String marca, String modelo, String combustible, int kmAutonomia) {
		super(color, marca, modelo, combustible);
		this.kmAutonomia = kmAutonomia;
	}

	public int getKmAutonomia() {
		return kmAutonomia;
	}

	public void setKmAutonomia(int kmAutonomia) {
		this.kmAutonomia = kmAutonomia;
	}
	
	

}
