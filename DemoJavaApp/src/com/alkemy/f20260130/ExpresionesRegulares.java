package com.alkemy.f20260130;

public class ExpresionesRegulares {

	public static void main(String[] args) {
		// Expresiones regulares: patrones para buscar en cadenas de texto
		String texto = "La fecha de hoy es 2024-06-15 y la hora es 14:30.";
		// Buscar fecha en formato YYYY-MM-DD
		String patronFecha = "\\d{4}-\\d{2}-\\d{2}";
		String patronHora = "\\d{2}:\\d{2}";
		
		// Imprimir resultados
		System.out.println("Texto: " + texto);
		System.out.println("Patrón Fecha: " + patronFecha);
		System.out.println("Patrón Hora: " + patronHora);
		System.out.println("Fecha encontrada: " + texto.replaceAll(".*(" + patronFecha + ").*", "$1"));
		System.out.println("Hora encontrada: " + texto.replaceAll(".*(" + patronHora + ").*", "$1"));
		
		

	}

}
