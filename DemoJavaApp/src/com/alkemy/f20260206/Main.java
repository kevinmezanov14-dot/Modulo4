package com.alkemy.f20260206;

public class Main {

	public static void main(String[] args) {
		// Bucles
		int numero = 8;//10;
		
		//por lo menos se ejecuta una vez
		do {
			System.out.println("do while: "+numero);
			numero = numero + 1;
		} while (numero < 10);

		while (numero < 12) {
			System.out.println("while: "+numero);
			numero++;
		}
		
		for (int i = 0; numero < 14; i++) {
			System.out.println("for: "+numero);
			numero++;
		}
		
		//ARREGLOS
				int[] numeros = {10,20,30,40,50,60,70,80,90};
				for (int num : numeros) {
					System.out.print(num+" ");
				}
	}
}
