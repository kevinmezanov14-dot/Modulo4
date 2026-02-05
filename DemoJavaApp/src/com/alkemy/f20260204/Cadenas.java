package com.alkemy.f20260204;

import java.util.Arrays;

public class Cadenas {

	public static void main(String[] args) {
		// Cadenas de caracteres String
		String cadenaDeCaracteres = "Alkemy\"%&54564"; // cadena de caracteres
		System.out.println(cadenaDeCaracteres);
		
		// definir un string
		String cadena = new String("Alkemy");
		System.out.println(cadena);
		
		// concatenar cadenas
		String nombre = "Kevin";
		String apellido = "Meza";
		String nombreCompleto = nombre + " " + apellido + " " + "Catril";
		System.out.println(nombreCompleto);
		
		// al concatenar un string con otro tipo de dato siempre se convierte a string
		int edad = 25;
		
		String nombreEdad = nombre + " " + edad; // string + int = string
		System.out.println(nombreEdad);
		System.out.println(nombre+ 3);
		System.out.println(3+4 +"siete"); //se ejecuta de izquierda a derecha se realiza la concatenacion 
		System.out.println("siete" + 3 + 4); //cambia el orden de concatenacion
		System.out.println("siete" + (3 + 4)); // uso de parentesis para cambiar el orden de operaciones
		
		// CONCATENAR CON .concat() FUNCION
		String saludo = "Hola ".concat(nombreCompleto);
		System.out.println(saludo);
		System.out.println("hola".concat(" ").concat(nombre).concat(" ").concat(apellido).concat(" ").concat("tienes").concat(" ").concat(String.valueOf(edad)).concat(" años"));
		
		//funcion length() para obtener la longitud de una cadena
		int cantidadCaracteres = nombreCompleto.length();
		System.out.println("Cantidad de caracteres en nombre completo: " + cantidadCaracteres);
		System.out.println("Cantidad de caracteres en nombre completo: " + apellido.length());
		System.out.println("Cantidad de caracteres en nombre completo: " + nombre.length());
		
		String password = "admin123";
		if(password.length() >= 8) {
			System.out.println("Password valido");
		} else {
			System.err.println("Password invalido, debe tener al menos 8 caracteres");
		}
		// recorrer una cadena de caracteres con charAt()
		for(int i=0; i<password.length(); i++) {
			char caracter = password.charAt(i);
			System.out.println("Caracter en posicion " + i + ": " + caracter);
			System.out.println("Caracter en posicion " + i + ": " + password.charAt(i));
			// invertir el char
			System.out.println("Caracter en posicion invertida " + (password.length() - 1 - i) + ": " + password.charAt(password.length() - 1 - i));
		}
		
		// comparar cadenas de caracteres strings equals()
		if(nombre.equals("Kevin")) {
			System.out.println("El nombre es correcto");
		} else {
			System.err.println("El nombre no coincide");
		}
		
		// Ejemplo
		String x = "hola";
		String y = "Hola";
		
		System.out.println(x.equals(y)); // false
		System.out.println(x==y); // no confiar en este metodo para comparar strings solo numeros
		System.out.println(x.equalsIgnoreCase(y)); // true 
		
		//Substring extraer una parte de la cadena
		String frase = "Bienvenidos a Alkemy Java Bootcamp";
		String subFrase = frase.substring(16, 20); // desde la posicion 16 hasta la 20 sin incluirla
		System.out.println("Subfrase: " + subFrase);
		
		System.out.println("***SUBCADENAS***");
		System.out.println(nombreCompleto);
		System.out.println(nombreCompleto.substring(2)); // desde la posicion 2 hasta el final
		System.out.println(nombreCompleto.substring(6));
		System.out.println(nombreCompleto.substring(2 , 7)); // CONSIDERA EL 2 PERO NO EL 7 
		
		//buscar en String
		System.out.println(nombreCompleto.contains("Kevin")); //true
		System.out.println(nombreCompleto.contains("tevin")); //false
		
		nombreCompleto = nombreCompleto + " Rubén";
		System.out.println(nombreCompleto);
		System.out.println(nombreCompleto.startsWith("Kevin")); //true
		System.out.println(nombreCompleto.endsWith("én")); //true
		System.out.println(nombreCompleto.indexOf(" ")); // detecta donde esta el primer espacio
		System.out.println(nombreCompleto.substring(0,5));
		System.out.println(nombreCompleto.substring(6).indexOf(" "));
		System.out.println(nombreCompleto.substring(6,10));
		
		String correo = "admin@alkemy.com";
		System.out.println(correo.indexOf("@")); //5
		System.out.println(correo.indexOf("$")); // -1 cuando no lo encuentra
		
		
		//quitar espacios trim al inicio y al final
		String mensaje = "Esto es un mensaje de prueba ";
		System.out.println(mensaje.trim());
		
		//dividir string split retorna un array String[]
		
		String[] palabras = mensaje.trim().split(" ") ;
		System.out.println(Arrays.toString(palabras));
		
		System.out.println(Arrays.toString(correo.split("@")));
		System.out.println(Arrays.toString(correo.trim().split("@")));
		
		//funcion replace EL CARACTER A REEMPLAZAR PRIMERO Y LUEGO DE LA (,) EL CARACTER NUEVO
		String rut = "18.895.666-1";
		rut = rut.replace(".", "").replace("-", "");
		System.out.println(rut);
		
		
		
		
		
	}

}
