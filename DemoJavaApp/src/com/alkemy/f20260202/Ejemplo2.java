package com.alkemy.f20260202;
import java.util.Scanner;
public class Ejemplo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// las tablas de multiplicar del 1 al 10 for anidado (for dentro de otro for)
		
		for (int tabla = 1; tabla <= 10; tabla++) {
			System.out.printf("Tabla de multiplicar del %d:%n", tabla);
			for (int i = 1; i <= 10; i++) {
				int resultado = tabla * i;
				System.out.printf("%d x %d = %d%n", tabla, i, resultado);
			}
			System.out.println(); // Línea en blanco entre tablas
		}
		sc.close();
	}
	

}
