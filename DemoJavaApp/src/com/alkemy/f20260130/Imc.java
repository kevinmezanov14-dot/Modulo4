package com.alkemy.f20260130;
 import java.util.Scanner;
public class Imc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
		    System.out.print("Ingresa tu peso en kg: ");
		    double peso = Double.parseDouble(sc.nextLine()); // Leer peso con decimales

		    System.out.print("Ingresa tu talla en metros (ej: 1.70): ");
		    double talla = Double.parseDouble(sc.nextLine()); // Leer talla con decimales

		    if (peso <= 0 || talla <= 0) {
		        System.out.println("El peso y la talla deben ser mayores a 0");
		        return;
		    }

		    double imc = peso / (talla * talla); // Calcular IMC con decimales

		    System.out.printf("Tu IMC es: %.2f%n", imc); // Mostrar IMC con 2 decimales

		    if (imc < 18.5) {
		        System.out.println("Clasificacion: Bajo peso");
		    } else if (imc < 25) {
		        System.out.println("Clasificacion: Normal");
		    } else if (imc < 30) {
		        System.out.println("Clasificacion: Sobrepeso");
		    } else if (imc < 35) {
		        System.out.println("Clasificacion: Obesidad grado I");
		    } else if (imc < 40) {
		        System.out.println("Clasificacion: Obesidad grado II");
		    } else {
		        System.out.println("Clasificacion: Obesidad grado III");
		    }

		} catch (NumberFormatException e) {
		    System.out.println("Error: debes ingresar valores numericos validos");
		} finally {
		    sc.close();
		}


	}

}
