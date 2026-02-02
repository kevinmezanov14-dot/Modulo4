package com.alkemy.f20260202;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		// calculadora con menu de opciones 
		// ingreso de datos por parte del usuario (1)
		System.out.println(" ╔══════════════════════════════╗");
		System.out.println(" ║      CALCULADORA JAVA        ║");
		System.out.println(" ╠══════════════════════════════╣");
		System.out.println(" ║    Seleccione la operacion:	║"); // operaciones a realizar: suma, resta, multiplicacion, division
		System.out.println(" ║ 0. Salir                     ║");
		System.out.println(" ║ 1. Suma                      ║");
		System.out.println(" ║ 2. Resta                     ║");
		System.out.println(" ║ 3. Multiplicacion            ║");
		System.out.println(" ║ 4. Division                  ║");
		System.out.println(" ╚══════════════════════════════╝");
		
		// Seleccion por parte del usuario (2)
		
        // Selección de la operación
        System.out.print("Ingrese el numero de la operacion (0-4): ");
        int opcion = sc.nextInt();

        // Validación de opción
        if (opcion < 0 || opcion > 4) {
            System.err.println("Opcion invalida. Por favor seleccione una opcion del 0 al 4.");
            sc.close();
            return;
        }
        // Salir
        if (opcion == 0) {
            System.out.println("Saliendo de la calculadora. Hasta luego!");
            sc.close();
            return;
        }
				/*else {
				System.out.print("Ingrese el primer numero: ");
				double num1 = Scanner.nextDouble(); 
				System.out.print("Ingrese el segundo numero: ");
				double num2 = Scanner.nextDouble();
				double resultado = 0;
				switch (opcion) { // estructura switch para seleccionar la operacion				
				case 1:
					resultado = num1 + num2;
					System.out.println("El resultado de la suma es: " + resultado);
					break;
					case 2:
						resultado = num1 - num2;
						System.out.println("El resultado de la resta es: " + resultado);
						break;
						case 3:
							resultado = num1 * num2;
							System.out.println("El resultado de la multiplicacion es: " + resultado);
							break;
							case 4:
								if (num2 == 0) {
									System.out.println("Error: No se puede dividir por cero.");
								} else {
									resultado = num1 / num2;
									System.out.println("El resultado de la division es: " + resultado);
								}
								break;
								default:
									System.out.println("Opcion invalida.");
									break;
									}
				}*/
		
		// Seleccion por parte del usuario segun la cantidad de numeros a operar más de 2 numeros
		
     // Cantidad de números a operar
        System.out.print("Ingrese la cantidad de numeros a operar: ");
        int cantidadNumeros = sc.nextInt();

        if (cantidadNumeros < 2) {
            System.err.println("La cantidad de numeros debe ser al menos 2.");
            sc.close();
            return;
        }

        // Ingreso de números
        double[] numeros = new double[cantidadNumeros]; // arreglo para almacenar los numeros
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble(); // almacenar el numero en el arreglo
        }

        double resultado;

        // Operaciones
        switch (opcion) {
            case 1: // Suma
                resultado = 0;
                for (double num : numeros) {
                    resultado += num;
                }
                System.out.println("El resultado de la suma es: " + resultado);
                break;

            case 2: // Resta
                resultado = numeros[0];
                for (int i = 1; i < numeros.length; i++) {
                    resultado -= numeros[i];
                }
                System.out.println("El resultado de la resta es: " + resultado);
                break;

            case 3: // Multiplicación
                resultado = 1;
                for (double num : numeros) {
                    resultado *= num;
                }
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                break;

            case 4: // División
                resultado = numeros[0];
                for (int i = 1; i < numeros.length; i++) {
                    if (numeros[i] == 0) {
                        System.out.println("Error: No se puede dividir por cero.");
                        sc.close();
                        return;
                    }
                    resultado /= numeros[i];
                }
                System.out.println("El resultado de la division es: " + resultado);
                break;

            default:
                System.out.println("Opcion invalida.");
                break;
        }

        sc.close();
    }
}
									

		
		
		
		
		
	
		
		
