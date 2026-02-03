package com.alkemy.f20260203;

import java.util.ArrayList;

public class ArrayListDinamicos {

	public static void main(String[] args) {
		// ArrayList, dinamicos
		
		//definicion
		ArrayList<Integer> edades = new ArrayList<>();
		
		//agregar informacion al ArrayList
		edades.add(15);
		edades.add(18);
		edades.add(21);
		edades.add(23);
		
		//imprimir todo el arraylist
		System.out.println(edades);//[15, 18, 21,23]
		
		//consultamos datos por posicion
		System.out.println(edades.get(0));
		//System.out.println(edades.get(3));//Index 3 out of bounds for length 3
		System.out.println(edades.get(2));//21
		
		//tamaño o cantidad de elementos en el arrylist
		System.out.println("cantidad de elementos: "+edades.size());
		
		System.out.println("ultimo elemento "+ edades.get(edades.size()- 1 ));
		
		/*Metodos de los ArrayList*/
		edades.remove(2);
		System.out.println(edades);//[15, 18, 23]
		System.out.println(edades.get(2));//23
		
		//modifica un elemento en una posicion
		edades.set(0, 16);
		System.out.println(edades);
		
		/** RECORRER UN ARRAYLIST**/
		
		for (int i = 0; i < edades.size(); i++) {
			System.out.println(edades.get(i));
		}
		//agregar elementos al ArrayList ???
		int cantidad = 10;
		for (int i = 0; i < cantidad; i++) {
			edades.add(i+2);
		}
		
		/**
		 * Recorrer con ForEach
		 * */
		System.out.println(edades);
		//[16, 18, 23, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
		for (Integer edad : edades) {//edad = 23
			System.out.println("elemento edad "+ edad);
		}
		
	}

}