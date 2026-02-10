package com.alkemy.f20260210;

public class Main {
	
	public static void main(String[] args) {
		// crear objeto
		// instancia de la clase coche
		// () es el constructor que inicializa el contenido
		Coche micro_electric = new Coche();
		Coche sedan = new Coche();
		
		// agregando valores a los atributos a traves del metodo constructor
		Coche suv = new Coche("Negro","Nissan","Qashqai","Bencinero");
		
		
		// estado inicial es la asignacion de valores a los atributos
		
		// usando Get acceder al valor del atributo
		System.out.println(micro_electric.color);
		System.out.println(suv.color);
		System.out.println(suv.getColor());
		System.out.println(suv.getMarca());
		
		// metodo set modificar o mutar el estado del atributo
		
		micro_electric.setColor("Blanco");
		System.out.println(micro_electric.color);
	}

}