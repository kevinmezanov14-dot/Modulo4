package com.alkemy.f20260130;
import java.util.Scanner;
public class VerificarEdad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try { // evitar errores de formato y que se detenga el programa
		    System.out.print("Ingresa tu edad en años: "); // Solicitar edad
		    int edad = Integer.parseInt(sc.nextLine()); // Leer edad

		    if (edad < 0) {
		        System.out.println("La edad no puede ser negativa"); // Validar edad negativa
		        return;
		    }

		    if (edad >= 18) {
		        System.out.println("La persona es MAYOR de edad"); // Mayor de edad
		    } else {
		        System.out.println("La persona es MENOR de edad"); // Menor de edad
		    }

		    if (edad == 0) { // Clasificación etaria
		        System.out.println("Segmento etario: Lactante menor"); // 0 años
		    } else if (edad == 1) {
		        System.out.println("Segmento etario: Lactante mayor"); // 1 año
		    } else if (edad <= 5) {
		        System.out.println("Segmento etario: Preescolar"); // 2-5 años
		    } else if (edad <= 12) {
		        System.out.println("Segmento etario: Niño/a"); // 6-12 años
		    } else if (edad <= 17) {
		        System.out.println("Segmento etario: Adolescente"); // 13-17 años
		    } else if (edad <= 29) {
		        System.out.println("Segmento etario: Joven adulto"); // 18-29 años
		    } else if (edad <= 59) {
		        System.out.println("Segmento etario: Adulto"); // 30-59 años
		    } else {
		        System.out.println("Segmento etario: Adulto mayor"); // 60+ años
		    }

		} catch (NumberFormatException e) { // catch para errores de formato 
		    System.out.println("Error: debes ingresar un numero valido"); // Mensaje de error
		} finally { // Cierre del scanner
		    sc.close();
		}
	}
}
