package com.alkemy.f20260206;
import java.util.Arrays;
public class Matrices {

	public static void main(String[] args) {
		//ARREGLOS BIDIMENSIONALES 
		int[][] numeros = new int[2][3]; // 2 filas y 3 columnas
		numeros[0][0] = 10;
		numeros[0][1] = 12;
		numeros[0][2] = 15;
		numeros[1][0] = 20;
		numeros[1][1] = 30;
		numeros[1][2] = 60;		
		System.out.println(Arrays.deepToString(numeros));

		// recorrer e imprimir la matriz
				for (int filas = 0; filas < numeros.length; filas++) {
					for (int columnas = 0; columnas < numeros[filas].length; columnas++) {
						System.out.print(numeros[filas][columnas] + " ");
					}
					System.out.println();
	
				}
					// recorrido con for-each
					for (int[] fila : numeros) { // de la matriz numeros trae la fila
						for (int valor : fila) { // de esta fila traeme el valor
							System.out.print(valor + " ");
						}
						System.out.println();
					}
					
			// ejercicio calculo de promedio de alumno y curso donde son 13 alumnos	
			// cada alumno con 7 notas		
	}

}
