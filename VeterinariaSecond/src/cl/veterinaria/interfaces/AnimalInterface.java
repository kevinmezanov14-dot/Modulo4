package cl.veterinaria.interfaces;

public interface AnimalInterface {
	//getters
	int getId();
	String getNombre();
	double getPeso();
	
	String hacerRuido();
	void comer();
	void dormir();
	void moverse();
	
}
