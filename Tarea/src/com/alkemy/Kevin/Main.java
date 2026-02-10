package com.alkemy.Kevin;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal que ejecuta el menu
 * 
 * @author Israel
 * @version 1.0
 * @since 2026-02-09
 */
public class Main {

	static Scanner sc = new Scanner(System.in);
	static int id = 1;
	static ArrayList<Tarea> tasks = new ArrayList<Tarea>();
	
	public static void main(String[] args) {
		int opcion;
		do {
			menu();
			System.out.println("Ingresa tu opción:");
			opcion = sc.nextInt();// del 0 al 4
			sc.nextLine(); // limpiar el salto de linea
			
			switch (opcion) {
			case 1://agregar tarea
				agregarTarea();
				break;
			case 2:
				mostrarTareas();
				break;
			case 3:
				marcarTareaCompletada();
				
				break;
			case 4:
				eliminarTarea();
				
				break;
			default:
				System.err.println("Opcion invalida");
				break;
			}
			
		} while(opcion < 0 || opcion > 4);
		
	}



	/**
	 * Mostrar el menú
	 * */
	public static void menu() {
		System.out.println("**** Gestión de Tareas ***");
		System.out.println("1.- Agregar tarea");
		System.out.println("2.- Mostrar tareas");
		System.out.println("3.- Marcar tarea completada");
		System.out.println("4.- Eliminar tarea");
		System.out.println("0.- Salir");
	}
	
	/**
	 * Permite agregar una tarea
	 */
	private static void agregarTarea() {
		
		System.out.println("Ingresa el nombre de la tarea: ");
		sc.next();
		String nombreTarea = sc.nextLine().trim();
		
		if(nombreTarea.isEmpty()) {
			System.out.println("Nombre no puede estar vacio: ");
			return;
		}
		
		
		System.out.println("Ingresa la descripcion");
		String descripcionTarea = sc.nextLine();
		if(descripcionTarea.isEmpty()) {
			System.out.println("Descripción no puede estar vacio");
			return;
		}
		
		System.out.println("Ingresa la prioridad");
		String prioridadTarea = sc.nextLine();
		if(prioridadTarea.isEmpty()) {
			System.out.println("prioridad no puede estar vacio");			
			return;
		}
		//objeto
		Tarea tarea = new Tarea(id,nombreTarea,descripcionTarea,prioridadTarea,false);
		/*Tarea tarea = new Tarea();
		tarea.setNombre(nombreTarea);
		tarea.setId(id);
		tarea.setDescripcion(descripcionTarea);
		tarea.setPrioridad(prioridadTarea);
		tarea.setCompletado(false);
		*/
		
		//static ArrayList<Tarea> tasks = new ArrayList<Tarea>();
		tasks.add(tarea);//{tarea1,tarea2, tarea3,...}
		 
		id++;
	}

	/**
	 * Permite listar todas las tareas
	 */
	public static void mostrarTareas() {
		if(tasks.isEmpty()) {
			System.out.println("No hay tareas");
			return;
		}
		
		System.out.println("*** Lista de tareas ***");
		for (Tarea objeto : tasks) {
			System.out.println(objeto.getId()+" "+objeto.getNombre());
		}
	}
	private static void eliminarTarea() {
		// TODO Auto-generated method stub
		
	}

	private static void marcarTareaCompletada() {
		// TODO Auto-generated method stub
		
	}
}
