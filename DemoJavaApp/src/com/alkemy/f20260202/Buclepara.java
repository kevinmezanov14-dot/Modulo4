package com.alkemy.f20260202;
import java.util.Scanner;
public class Buclepara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Bucle For
		
		// Imprimir los números del 1 al 10 usando un bucle For
		/*for (int i = 1; i <= 10; i++) { // inicialización; condición; incremento
			System.out.println("valor de i "+ i);
		sc.close();	
		}
		 
		System.out.println("Fin del bucle For");
		
	}*/
		
		//pedir el limite y luego colocarlo como condicion bucle mientras
		int suma = 0;
		System.out.println("Ingrese el limite");
		int limite = sc.nextInt();
		
		for (int i = 1; suma < limite; i++) {
			System.out.printf("Ingresa el %d numero%n", i);
			int numero = sc.nextInt();
			suma = suma + numero;
		}
		System.out.printf("el limite es %d  y la suma es %d", limite, suma);
		sc.close();
	}
	
		

}
