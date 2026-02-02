package com.alkemy.f20260202;
import java.util.Scanner;
public class Ejemplo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// crear mediante bucle tabla de multiplicar del 2; 1 al 10
		
		/*for (int i = 1; i <= 10; i++) {
			int resultado = 2 * i;
			System.out.printf("2 x %d = %d%n", i, resultado);
		}
		*/
		// pedir un numero al usuario y mostrar su tabla de multiplicar
		System.out.print("Ingresa un número para ver su tabla de multiplicar: ");
		int numero = sc.nextInt();
			for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.printf("%d x %d = %d%n", numero, i, resultado);
		}
			sc.close();
	}
}
