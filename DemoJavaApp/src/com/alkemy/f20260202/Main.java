package com.alkemy.f20260202;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Bucles 
		/*
		 * Vamos a escribir un algoritmo en el cual se ingrese un valor límite positivo, y a continuación
			solicite números al usuario hasta que la suma de los números introducidos supere el límite
			inicial.
		 */
		//1. Variables: límite, num, suma.
		int limite = 0;
		int suma = 0; //variable para ir acumulando la suma de los números ingresados
		
		/*while (condición) {
		}*/
		
		//2. Pedir el límite, y luego colocarlo como condición del bucle Mientras
		
		System.out.print("Ingresa un valor límite positivo: ");
		limite = sc.nextInt();
		
		while (suma <= limite) {
			System.out.print("Ingresa un número: ");
			int num = sc.nextInt();
			suma += num; // Acumular la suma de los números ingresados
			System.out.println("Suma actual: " + suma);
			
			
			
		}
		
		//3. Sumar cada número ingresado (reemplazando el valor de “num”)
		//hasta que supere el valor ingresado como límite.
		System.out.printf("el limite es %d y la suma final es %d", limite, suma);
		sc.close();		
	}

}
