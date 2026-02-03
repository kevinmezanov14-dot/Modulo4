package com.alkemy.f20260203;

import java.util.Arrays;
import java.util.Scanner;

public class Vectores {

	public static void main(String[] args) {
		// Arrays unidimensional
		//definiendo un array
		int[] notas = new int[8];//8 cantidad de elementos
		
		
		//asignar valores, por posicion
		notas[1] = 4;//{0,4,0,0,0,0,0,0}
		notas[7] = 65;//{0,4,0,0,0,0,0,65}
		
		//acceder e imprimir un elemento del array
		System.out.println(notas[3]);
		System.out.println(notas[1]);
		//System.out.println(notas[8]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
		System.out.println(notas[5]);
		
		notas[1] = 44;//modifico //{0,44,0,0,0,0,0,0}
		System.out.println(notas[1]);
		
		
		System.out.println("tamaño o cantidad de elementos "+notas.length);//8
		
		//acceder al ultimo elemento del array
		System.out.println("ultimo elemento: "+notas[notas.length-1]);//notas[8-1] => notas[7]
		
		//como imprimir un array unidimensional?
		//System.out.println(notas.toString());//[I@4517d9a3
		System.out.println(Arrays.toString(notas));//[0, 44, 0, 0, 0, 0, 0, 65]
		
		//////////////////////////////////////
		String[] dias = {"Domingo","Lunes", "Martes","Miercoles","Jueves","Viernes","Sabado"};
		
		System.out.println("tamaño array dias: "+dias.length);
		
		/**
		 * RECORRER ARRAYS
		 * */
		//indice == posicion
		//indice= 0 ; dias.length = 7
		for (int indice = 0; indice < dias.length; indice++) {
			System.out.printf("indice: %d, valor: %s %n",indice,dias[indice]);//dias[4]
		}
		
		//asignacion dinamica
		Scanner sc = new Scanner(System.in);
		
		int[] puntajes = new int[6]; 
		
		for (int i = 0; i < puntajes.length; i++) {
			System.out.println("ingresa el puntaje");
			int puntaje = sc.nextInt();
			
			puntajes[i]=puntaje;
			
			//puntajes[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(puntajes));
		
		sc.close();
		
	}

}
	

