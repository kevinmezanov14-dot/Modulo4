package com.alkemy.f20260206;

public class ClaseMath {

	public static void main(String[] args) {
		// CLASE MATH.METODO();
		
		System.out.println("Constante PI: "+ Math.PI);
		System.out.println("Constante Euler: "+ Math.E);

		// Redondeo
		System.out.println("****CEIL****");
		System.out.println("math.ceil()"+ Math.ceil(4.1)); //5.0 redondeo hacia arriba
		System.out.println("math.ceil()"+ Math.ceil(Math.PI)); // 4.0
		System.out.println("math.ceil()"+ Math.ceil(-4.1)); // -4.0 ya que es mas grande entero
		System.out.println("****FLOOR****");
		System.out.println("math.floor()"+ Math.floor(4.1)); //4.0 redondeo hacia abajo
		System.out.println("math.floor()"+ Math.floor(Math.PI)); // 3.0
		System.out.println("math.floor()"+ Math.floor(-4.1)); // -5.0 ya que es mas pequeño entero
		System.out.println("****ROUND****");
		System.out.println("math.round)"+ Math.round(4.1)); //aproxima al entero mas cercano
		System.out.println("math.round)"+ Math.round(Math.PI)); // 3.0
		System.out.println("math.round)"+ Math.round(-4.5)); // -4.0 ya que es mas grande entero
		System.out.println("math.round)"+ Math.round(-4.6)); // -5.0 ya que es el mas cercano
		System.out.println("math.round)"+ Math.round(4.5)); // el 0.5 lo aproxima al superior punto inflexión
		
		// RAIZ Y POTENCIAS
		System.out.println("****RAIZ Y POTENCIAS****");
		System.out.println("Math.pow() "+ Math.pow(0, 0));
		System.out.println("Math.pow() "+ Math.pow(5, 3));
		
		//System.out.println("Math.pow() "+ Math.pow(125, (1/5)));
		
		System.out.println("Math.sqrt() "+ Math.sqrt(25)); //raiz cuadrada de un numero
		System.out.println("Math.cbrt() "+ Math.cbrt(125)); // raiz cubica
		
		// valor absoluto
		System.out.println("Math.abs() "+ Math.abs(4.5));
		System.out.println("Math.abs() "+ Math.abs(-4.5));
		
		// como generar numero aleatorio 
		System.out.println("Math.random() "+ Math.random());
		
		
		//forma general
				//(int) (Math.random() * rango) + minimo
				
				System.out.println((int) (Math.random() * 10));//[0 , 9]
				System.out.println((int) (Math.random() * 10) + 1);//[1 , 10]
				System.out.println((int) (Math.random() * 11) + 5);//[5 , 15]
	}
	
}
