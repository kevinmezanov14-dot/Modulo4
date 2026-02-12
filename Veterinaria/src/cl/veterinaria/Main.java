package cl.veterinaria;

import Clases.Perro;
import Clases.Pez;
import Clases.Conejo;
import Clases.Gato;
import Clases.Mascota;
public class Main {

    public static void main(String[] args) {

        Perro perro1 = new Perro("Máximo Meridio", 2.3, "Chihuahua");
        Gato gato1 = new Gato("Jerry", 7.2,"Mestizo");

        System.out.println("=== DATOS ===");
        System.out.println(perro1.mostrarDatos());
        System.out.println(gato1.mostrarDatos());

        System.out.println("\n=== ACCIONES ===");
        perro1.comer();      // heredado
        perro1.dormir();     // heredado
        gato1.comer();
        gato1.dormir();
        System.out.println("Maximo Meridio dijo: "+perro1.emitirSonido()); // propio del perro
        System.out.println("Jerry dijo: "+gato1.emitirSonido());
        
        // polimorfismo
        Mascota[] mascotas = new Mascota[] {
        		new Conejo(),
        		new Pez()
        };
        // recorrer array
        for (Mascota mascota: mascotas) {
        	System.out.println(mascota.hacerRuido());
        	mascota.comer();
        	mascota.moverse();
        }
    }
}



