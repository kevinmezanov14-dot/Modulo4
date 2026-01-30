package com.alkemy.f20260130;

public class teoriaDeConjuntos {

	public static void main(String[] args) {
		// teoria de conjuntos
		
		int edad = 20;
		boolean tieneEntrada = true; // pertenece al conjunto de personas que tienen entrada

		if (edad >= 18 && tieneEntrada) { // pertenece al conjunto de personas mayores de edad y que tienen entrada
		    System.out.println("Puede ingresar");
		}

		boolean esAdmin = false; // pertenece al conjunto de administradores
		boolean esModerador = true; // pertenece al conjunto de moderadores

		if (esAdmin || esModerador) { // pertenece al conjunto de administradores o moderadores
		    System.out.println("Tiene permisos");
		}

		boolean bloqueado = false; // pertenece al conjunto de usuarios bloqueados

		if (!bloqueado) { // pertenece al conjunto de usuarios no bloqueados
		    System.out.println("Usuario activo");
		}

		int edad2 = 19; // pertenece al conjunto de personas menores de edad
		boolean autorizado = true; // pertenece al conjunto de personas autorizadas

		if (edad2 >= 18 || autorizado) { // pertenece al conjunto de personas mayores de edad o autorizadas
		    System.out.println("Acceso permitido");
		} else { 
		    System.out.println("Acceso denegado");
		}
		
		int edad3 = 16;
		boolean tienePermiso = true;

		if (edad3 >= 18 && tienePermiso) {
		    System.out.println("A");
		} else if (edad3 >= 18 || tienePermiso) { // pertenece al conjunto de personas mayores de edad o que tienen permiso
		    System.out.println("B");
		} else {
		    System.out.println("C");
		}
		
		//short-circuito
		int numero = 0;
		if (numero != 0 && 10 / numero > 2) { // si numero es 0, no se evalua la segunda condicion
		    System.out.println("OK");
		}

		// problema recomendacion de peliculas
		
		//preferencias del usuario
        boolean accion = true;
        boolean cienciaFiccion = false;
        boolean romantica = true;
        boolean drama = true;
        
     // Reglas
        boolean recomendarAlien = accion || cienciaFiccion;
        boolean recomendarTitanic = romantica && drama;
        
     // Resultados
        if (recomendarAlien) {
            System.out.println("Recomendación: Alien");
        }

        if (recomendarTitanic) {
            System.out.println("Recomendación: Titanic");
        }

        if (!recomendarAlien && !recomendarTitanic) {
            System.out.println("No hay recomendaciones");
            
        }	
	}
}
