package appay;

public class Cliente {
	
	// atributos
    private String nombre;
    private String apellido;
    private String direccion;
    private int dni;
    
    // constructor
	public Cliente(String nombre, String apellido, String direccion, int dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
	}
	// metodo del diagrama no se usa el cliente original 
	public void actualizarDatos(Cliente clienteVO) {
	    this.setNombre(clienteVO.getNombre());
	    this.setApellido(clienteVO.getApellido());
	    this.setDireccion(clienteVO.getDireccion());
	    this.setDni(clienteVO.getDni());
	}


	// metodo
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ "]";
	}
    
}
