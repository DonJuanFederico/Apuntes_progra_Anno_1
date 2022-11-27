package dominio;

public class Asignatura{
	private int id;
	private String nombre;
	private int curso;
	private int numeroAlumnos;

	public Asignatura(int id, String nombre, int curso, int numeroAlumnos){
		this.id = id;
		this.nombre = nombre;
		this.curso = curso;
		this.numeroAlumnos = numeroAlumnos;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public boolean equals(Object o){
		Asignatura a = (Asignatura) o;
		if(a.getId() == id){
			return true;
		}
		return false;
	}

	public String toString(){
		return nombre;
	}
}
