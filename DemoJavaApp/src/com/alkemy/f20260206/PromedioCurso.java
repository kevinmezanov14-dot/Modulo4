package com.alkemy.f20260206;

public class PromedioCurso {

	public static void main(String[] args) {

		// EJERCICIO:
		// Calcular el promedio de cada alumno y el promedio general del curso
		// El curso tiene 13 alumnos
		// Cada alumno tiene 7 notas

		// Declaramos una matriz de tipo double
		// Filas  -> alumnos (13)
		// Columnas -> notas por alumno (7)
		double[][] notas = new double[13][7];

		// CARGA DE NOTAS
		// En este ejemplo se cargan todas las notas con valor 6.0
		for (int i = 0; i < notas.length; i++) {              // recorre alumnos
			for (int j = 0; j < notas[i].length; j++) {       // recorre notas
				notas[i][j] = 6.0;                             // asigna nota
			}
		}

		// Variable para acumular la suma total de todas las notas del curso
		double sumaCurso = 0;

		// Contador para saber cuántas notas hay en total
		int totalNotas = 0;

		// Variable para numerar a los alumnos al mostrar resultados
		int alumno = 1;

		// RECORRIDO CON FOR-EACH
		// Recorre cada fila de la matriz (cada alumno)
		for (double[] notasAlumno : notas) {

			// Acumula la suma de las notas de un alumno
			double sumaAlumno = 0;

			// Recorre cada nota del alumno
			for (double nota : notasAlumno) {

				sumaAlumno += nota;   // suma notas del alumno
				sumaCurso += nota;    // suma notas del curso
				totalNotas++;         // cuenta cada nota
			}

			// Calcula el promedio del alumno
			double promedioAlumno = sumaAlumno / notasAlumno.length; // notas del alumnos / 7 notas

			// Muestra el promedio del alumno
			System.out.println("Promedio alumno " + alumno + ": " + promedioAlumno);

			// Aumenta el contador de alumnos y pasa al siguiente
			alumno++; 
		}

		// Calcula el promedio general del curso
		double promedioCurso = sumaCurso / totalNotas;

		// Muestra el promedio del curso
		System.out.println("Promedio general del curso: " + promedioCurso);
	}
}
