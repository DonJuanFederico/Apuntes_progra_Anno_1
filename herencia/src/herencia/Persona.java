package herencia;

public class Persona{
	private String nombre;      //si "private" pasa a ser "protected" las clases hijo, pueden acceder a los datos
	private String apellido;
	private int edad;

	public Persona(String nombre, String apellido, int edad) {   //inicializacion del constructor
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre(){
		return nombre;
	}

	public String getApellido(){
		return apellido;
	}

	public int getEdad(){
		return edad;
	}
}
