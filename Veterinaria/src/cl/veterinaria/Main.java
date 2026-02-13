package cl.veterinaria;

import Clases.Animal;
import Clases.Gato;
import Clases.Perro;
import Clases.Pez;

public class Main {
	public static void main(String[] args) {
		//Animal animal = new Animal("Bulls",700.00);
		//animal.comer();
		
		Perro perro = new Perro("Ayun", 20, "Bulldog");
		perro.comer();
		System.out.println(perro);
		System.out.println("---------");
		Gato gato = new Gato("Felix",7);
		gato.comer();
		System.out.println(gato);
		System.out.println();
		
		System.out.println("**** Polimorfismo *****");
		/*Polimorfismo*/
		Animal[] mascotas = new Animal[] {
			new Conejo(null, 0),
			new Pez(null, 0)
		};
		// recorrer Array
		for (Animal mascota : mascotas) {
			System.out.println(mascota.hacerRuido());
			mascota.comer();
			mascota.moverse();
		}
		
		//Polimorfismo DownCasting
		Animal  conejin = new Conejo(null, 0);
		conejin.comer();
		//conejin.dormir();
		//DownCasting
		Conejo wonejo = (Conejo) conejin;
		wonejo.dormir();
		
		Pez pescadito = (Pez) conejin; //castException
		
		/* InstanceOf*/
		if(conejin instanceof Pez pez) {
			pescadito.hacerRuido();
		} else {
			System.out.println("No es un pez");
		}
		
		
	}
}



