package com.alkemy.f20260202;

public class DoWhile {

	public static void main(String[] args) {
		// Do while evaluar la condición después de ejecutar el bloque de código al menos una vez
		int contador = 1;
		do {
			System.out.println("Valor de contador: " + contador);
			contador++;
		} while (contador <= 0);

	}

}
