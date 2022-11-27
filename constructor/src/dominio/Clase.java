package dominio;

public class Clase{
	private String nombre;
	private int numeroAlumnos;
	private String direccion;

	public Clase(){

	}

	public Clase(String nombre){
		System.out.println("Se ha creado un objeto de la clase Clase");
		this.nombre = nombre;
	}
	
	/*public Clase(String direccion){
		this.direccion = direccion;
	}*/

	public Clase(int numeroAlumnos){
		nombre = "";
		this.numeroAlumnos = numeroAlumnos;
	}

	public Clase(String nombre, int numeroAlumnos){
		this.nombre = nombre;
		this.numeroAlumnos = numeroAlumnos;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public int getNumeroAlumnos(){
		return numeroAlumnos;
	}

	public void setNumeroAlumnos(int numeroAlumnos){
		this.numeroAlumnos = numeroAlumnos;
	}
	
	public String getDireccion(){
		return direccion;
	}

	public void setDireccion(String direccion){
		this.direccion = direccion;
	}

	public String toString(){
		return "La clase se llama " + nombre + " y tiene " + numeroAlumnos + " alumnos.";
	}
}
