package com.alkemy.f20260204;

public class Main {
	static int variableClase;

	public static void main(String[] args) {
		// variable local
		int variableLocal = 0;
		variableClase = 5; 

		System.out.println("***main***");
		System.out.println(variableLocal); // imprimir 0
		System.out.println(variableClase); // imprimir 5
		
		//llamar a la funcion
		imprimir();
		imprimir2(variableLocal);
		imprimir3(20);
	}
	
	public static void imprimir() {
		System.out.println("***imprimir***");
		// variable local
		//System.out.println(variableLocalMetodo); //alcanza solo a variables de clase
		System.out.println(variableClase);
		variableClase = 10; //modificar variable de clase
	}
	
	public static void imprimir2(int varLocal) {
		// variable local
		System.out.println("***imprimir 2***"); 
		System.out.println(varLocal); // imprimir 0
		System.out.println(variableClase); // imprimir 10
		varLocal = 15;
		System.out.println(varLocal); // imprimir 15
	}
	public static void imprimir3(int varLocal) {
		// variable local
		System.out.println("***imprimir 3***");
		System.out.println(varLocal); 
	}
}
