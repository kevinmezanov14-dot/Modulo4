package cl.veterinaria.clases;

public class Gato extends Animal {

	public Gato(int id, String nombre, double peso) {
		super(id, nombre, peso);
	}

	@Override
	public String hacerRuido() {
		// TODO Auto-generated method stub
		return "el gato de nombre "+getNombre()+"hace miau";
	}

	@Override
	public void moverse() {
		System.out.println(getNombre()+" "+ "se mueve sigilosamente");
		
	}

}
