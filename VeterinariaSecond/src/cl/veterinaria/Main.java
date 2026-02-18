package cl.veterinaria;

import cl.veterinaria.clases.Gato;
import cl.veterinaria.clases.Perro;

public class Main {

	public static void main(String[] args) {
		// creacion de un objeto
		//instancia de una clase
		// no se puede crear un objeto a partir de una clase abstracta.
		//Animal animal = new Animal();
		//set asignar valores a los atributos
		//animal.setNombre("Ayun");
		//animal.setPeso(20.70);
		
		//Animal objetoAnimal = new Animal(1,"Zoe",10.5);
		
		//get obtener los valores de los atributos
		//int id = objetoAnimal.getId();
		//System.out.println("El id del objeto animal es: "+id);
		Perro Lester = new Perro(1,"Lester", 20.5, "Pitbull");
		Lester.comer();
		Gato Copo = new Gato(1,"Copo", 5.5);
		Copo.comer();
		Copo.moverse();
		
		

	}
}