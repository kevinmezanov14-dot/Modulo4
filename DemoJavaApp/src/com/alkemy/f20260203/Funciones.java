package com.alkemy.f20260203;

public class Funciones {

	public static void main(String[] args) {
		// llamar o invocar al metodo
		Integer num1= 70;
		Integer num2= 54;
		Integer valor_retorno = calculo_suma(num1,num2);

		System.out.println("El resultado de la suma es: "+ valor_retorno);
		System.out.println(num1+" "+num2);
		
		calculo_suma2(70,70);
	}

	//definicion del metodo
	//accesador; tipo de retorno ; nombre_metodo; (tipo_dato nombre_parametro)
	/**
	 * Metodo que resuelve la suma de dos numeros
	 * Integer numero1
	 * Integer numero2
	 * return Integer
	 * */
	public static Integer calculo_suma(Integer numero1, Integer numero2) {
		
		Integer suma = numero1 + numero2;
		numero1 = numero1 + 2;
		numero2 = numero2 + 2;
		return suma;
		//return numero1 + numero2;
	}
	
	public static void calculo_suma2(Integer numero1, Integer numero2) {
		
		Integer suma = numero1 + numero2;
		System.out.println("El resultado es: " + suma);
		
		
	}
	
}


