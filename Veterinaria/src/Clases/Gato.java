package Clases;

public class Gato extends Animal {

    private String raza;

    public Gato(String nombre, double peso, String raza) {
        super(nombre, peso);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    // comportamiento del padre
    @Override
    public void comer() {
        super.comer(); // llama al método de Animal
    }

    @Override
    public void dormir() {
        super.dormir(); // llama al método de Animal
    }

    //  comportamiento
    @Override
    public String emitirSonido() {
        return "Miau";
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + " y su raza es: " + raza;
    }
}
