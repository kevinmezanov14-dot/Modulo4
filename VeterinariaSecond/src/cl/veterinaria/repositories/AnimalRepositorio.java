package cl.veterinaria.repositories;

import java.util.List;
import java.util.Optional;

import cl.veterinaria.clases.Animal;

/*
 * metodos para implementar en la logica de negocio
 * CRUD
 * */
public interface AnimalRepositorio {
	Animal guardar(Animal animal);
	List<Animal> obtenerTodos();
	Optional<Animal> obtenerPorId(int id);
	boolean actualizar(Animal animal);//VO -DTO- beans- pojo
	boolean actualizar2(int id, String nombre,double peso);
	boolean actualizarPeso(int id, double peso);
	boolean eliminar(int id);
	

}