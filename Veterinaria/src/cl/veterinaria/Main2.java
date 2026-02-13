package cl.veterinaria;

import Clases.Animal;
import Clases.Gato;
import Clases.Perro;
import Clases.Pez;

public class Main2 {

	public static void main(String[] args) {
		//No puedo crear una instancia de una clase abstracta
		//Animal animal = new Animal("Ayun", 20.2);
		
		//Polimorfismo
		Animal[] arrayAnimales = new Animal[] { 
			new Perro("Ayun",20.2,"Bulldog"),
			new Gato("Mishi",5.0),
			new Pez("Nemo",0.3),
			new Conejo("BadBunny",0.9)
		};
		//recorriendo un array de clase abstracta
		for(Animal animal : arrayAnimales) {
			if(animal instanceof Gato gato) {
				gato.setRaza("Egipcia");
			}
			System.out.println(animal);
			System.out.println("su sonido es: "+animal.hacerRuido());

			System.out.println("--------------");
		}
		
		//downCasting
		Animal gatito = arrayAnimales[1];
		
		if(gatito instanceof Gato gato) {
			gato.setRaza("Egipcia");
		}
		
	}

}