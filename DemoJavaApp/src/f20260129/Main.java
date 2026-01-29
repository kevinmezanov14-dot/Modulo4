package f20260129;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tipo de Variables primitivos se escriben en minusculas
		/* enteros(byte son 8 bits -128 a 127 , 
		 * short 16 bits
		 * int 32 bits 
		 * long 64 bits */
		
		int edad = 3; // crear variable de tipo entero
		long sueldo = 1_000_000_000L; // crear variable de tipo entero largo
		// decimales o puntos flotantes 
		/*
		float 32 bits
		double 64 bits
		*/
		
		float altura = 1.80f; // crear variable de tipo decimal
		float altura2 = (float) 1.75; // castear un double a float
		double peso = 75.5; // crear variable de tipo decimal largo
		
		// otros tipos de variables
		/*
		 * boolean verdaderoFalso = true; // true o false
		 * char letra = 'A'; // un solo caracter entre comillas simples
		 * */
		
		// Tipo de variable objeto
		/* */
		String apellido = "Gomez"; // cadena de texto entre comillas dobles
		apellido.length(); // metodo para obtener la longitud de la cadena de texto
		Integer edad2 = 2; // variable objeto de tipo entero
		Float altura3 = 1.65f; // variable objeto de tipo decimal
		
		System.out.println("edad: " + edad);
		System.out.println("sueldo: " + sueldo);
		System.out.println("altura: " + altura);
		
		Integer nota = 5;
		String nota_string = nota.toString(); // convertir Integer a String casteo
		
		String a = "5"; 
		String b = "3";

		System.out.println(a + b); // concatenacion de cadenas de texto
		System.out.println(Integer.parseInt(a) + Integer.parseInt(b)); // convertir String a int y sumar
		
		String texto = "123"; // cadena de texto que representa un numero
		int numero = Integer.parseInt(texto); // convertir String a int
		float numero_decimal = Float.parseFloat(texto); // convertir String a float
		
	}

}
