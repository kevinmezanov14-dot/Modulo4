package cl.veterinaria.servicios;

import java.util.List;
import java.util.Optional;

import cl.veterinaria.clases.Animal;
import cl.veterinaria.repositories.AnimalRepositorio;

/*
 * se realiza para la logica del negocio
 * CRUD 
 * */
public class AnimalService implements AnimalRepositorio {

	@Override
	public Animal guardar(Animal animal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Animal> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Animal> obtenerPorId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean actualizar(Animal animal) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean actualizar2(int id, String nombre, double peso) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean actualizarPeso(int id, double peso) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
