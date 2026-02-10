package com.alkemy.f20260210;

import java.util.Scanner;
// Paradigma Orientación Objeto
public class Coche {
	static Scanner sc = new Scanner(System.in);
	// atributos
		String color;
		String marca;
		String modelo;
		String combustible;
		
		
		//constructores
		// permite asignar valores iniciales a los atributos
		
		//constructor vacio ()
		public Coche() {
			
		}


		public Coche(String color, String marca, String modelo, String combustible) {
			super();
			// atributo = parametro
			this.color = color;
			this.marca = marca;
			this.modelo = modelo;
			this.combustible = combustible;
		}

		// metodos Getter and Setters
		// accesador y mutador
		
		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}


		public String getMarca() {
			return marca;
		}


		public void setMarca(String marca) {
			this.marca = marca;
		}


		public String getModelo() {
			return modelo;
		}


		public void setModelo(String modelo) {
			this.modelo = modelo;
		}


		public String getCombustible() {
			return combustible;
		}


		public void setCombustible(String combustible) {
			this.combustible = combustible;
		}
		

		

	}


