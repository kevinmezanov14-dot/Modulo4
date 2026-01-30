package com.alkemy.f20260129;

public class Impresion {

	public static void main(String[] args) {
		// Print
		System.out.print("Hola Mundo"); // imprime sin salto de linea
		System.out.print("no salta"); // imprime sin salto de linea
		System.out.println("Hola Mundo"); // imprime con salto de linea
		System.out.println("Hola kevin"); // imprime con salto de linea
		String nombre = "catalina";
		System.out.println("Hola " + nombre); // imprime el contenido de la variable nombre
		
		double iva = 0.19;
		System.out.printf("impuesto %.2f ",iva); // imprime con formato
		System.out.printf(" Me llamo: %s%n", nombre); // salto de linea
		
		String apellido = "Ortiz";
		int edad = 30;
		System.out.printf(" Me llamo: %s %n %s, tengo %d años",nombre,apellido,edad); // edad como entero %d
		System.out.printf(" Mi nombre es: %s %n %s", nombre, apellido); // salto de linea los espacios se respetan

	}

}
