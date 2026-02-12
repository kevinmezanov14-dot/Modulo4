package com.alkemy.f20260212;

public class Main {

	public static void main(String[] args) {
		// crear un objeto a partir de la clase padre
		Coche coche = new Coche("Negro","Nissan","Qashqai","Bencinero");
		coche.encender();
		System.out.println(coche.getMarca());
		
		
		// crear otro objero a partir de la clase hija
		
		CocheElectrico tesla = new CocheElectrico ("Plomo","Tesla","XRL8","Electrico");
		tesla.encender();
		tesla.marca = "Tesla";
		System.out.println("El modelo es: "+tesla.getModelo()); // si no se asigna el atributo entrega null ya que es un objeto distinto
		System.out.println("El color es: "+tesla.getColor());
		System.out.println("La marca es: "+tesla.getMarca());
		tesla.setKmAutonomia(500);
		System.out.println("Km de Autonomía: "+tesla.getKmAutonomia());
		
		
		
	}
	

}
