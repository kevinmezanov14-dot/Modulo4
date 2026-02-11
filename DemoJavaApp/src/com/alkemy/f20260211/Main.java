package com.alkemy.f20260211;

public class Main {

	public static void main(String[] args) {
		// crear objeto
		Sector sectorCero = new Sector();
		Sector sectorUno = new Sector();
		
		//asignar valores con set
		sectorCero.setId(0);
		sectorUno.setId(0);
		
		// llamado metodo toString es la representacion de los valores de los atributos
		System.out.println(sectorCero.toString()); 
		System.out.println(sectorUno.toString()); 
	
		Pais paisCero = new Pais();
		paisCero.setNombre("Chile");
		System.out.println(paisCero.toString());
		
		Pais paisUno = new Pais();
		paisUno.setId(1);
		paisUno.setNombre("España");
		System.out.println(paisUno.toString());
		
		// obtener datos
		int identificador = sectorCero.getId(); // capturamos el dato
		System.out.println(identificador);
		System.out.println(sectorUno.getId()); // imprimimos el dato
		System.out.println(paisCero.getNombre());
		
		//crear objeto empresa
		Empresa empresaUno = new Empresa();
		empresaUno.setId(1);
		empresaUno.setNombre("Alfasoft");
		empresaUno.setSitioWeb("https://alfasoft.example");
		empresaUno.setPais(paisUno);
		
		sectorUno.setId(1);
		sectorUno.setNombre("Software");
		empresaUno.setSector(sectorUno);
		
		
		System.out.println("");
		System.out.println(empresaUno.toString());
	}

}
