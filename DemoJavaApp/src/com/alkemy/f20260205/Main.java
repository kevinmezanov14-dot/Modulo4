package com.alkemy.f20260205;

public class Main {

	public static void main(String[] args) {
		// Operadores en java
		int numero1 = 10;
		int numero2 = 20;
		
		System.out.println(numero1 + numero2); //30
		System.out.println(numero1 - numero2); //-10
		System.out.println(numero1 * numero2); //200
		System.out.println(numero1 / numero2); //  es int
		System.out.println(numero1 % numero2); // 10 resto 20*0 = 0 sobran 10 (numero1)
		
		//CASTEO
		System.out.println(" ");
		System.out.println((double)numero1 / numero2); // devuelve 0.5 y no 0 esto es castear
		System.out.println((long) numero1 / numero2);
		// INCREMENTO /DECREMENTO
		
		System.out.println(" ");
		System.out.println(++numero1); //11 PRIMERO INCREMENTA LUEGO IMPRIME
		System.out.println(numero1++); //11 PRIMERO IMPRIME Y LUEGO INCREMENTA
		System.out.println(numero1); // VALE 12 PORQUE EL ANTERIOR LO INCREMENTÓ
		
		System.out.println(--numero2); // 19 PRIMERO RESTA 1 Y LUEGO IMPRIME
		System.out.println(numero2--); // 19 IMPRIME Y LUEGO RESTA 1
		System.out.println(numero2); // 18 PORQUE EL ANTERIOR LO DECREMENTÓ
		
		for (int i = 100; i>0; --i) {
			if(i==100) {
			System.out.printf(",%d",--i);
			}else {
				System.out.printf(",%d", --i);
			}
		}
		System.out.println(" ");
		System.out.println("%n"); // salto de linea
		// COMPARACIÓN
		System.out.println(++numero1==numero2); //FALSE
		System.out.println(numero1 != numero2); // TRUE
		System.out.println(numero1 < numero2); // TRUE
		System.out.println(numero1 > numero2); // FALSE
		System.out.println(numero1 <= numero2); //  TRUE
		System.out.println(numero1 >= numero2); // FALSE
		
		// LOGICOS
		System.out.println(" ");
		System.out.println("***operadores logicos***");
		boolean tieneClave = true;
		Boolean esAdmin = false;
		// & o AND
		System.out.println(" ");
		System.out.println("***operador & AND***");
		System.out.println(tieneClave && esAdmin); //false
		System.out.println(true&&true); // ambos tienen que ser verdaderos a esto se le llama cortocircuito
		//or
		System.out.println(" ");
		System.out.println("***operador OR***");
		System.out.println(false || false);
		System.out.println( tieneClave || esAdmin);
		
		System.out.println(esAdmin == false); //true
		if(esAdmin) {
			System.out.println("Es Administrador de este lugar");
		}else
			System.out.println("NO es Administrador de este lugar");
		System.out.println(" ");
		System.out.println("***operador negacion***");
		
		if(!esAdmin) {
			System.out.println("Es Administrador de este lugar");
		}else
			System.out.println("NO es Administrador de este lugar");
		System.out.println(" ");
		System.out.println("***IF Ternario***");
		String mensaje = (!esAdmin) ? "Es admin":"No es admin";
		System.out.println(mensaje);
	}
	
		
		
}
