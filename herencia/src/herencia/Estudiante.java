package herencia;

public class Estudiante extends Persona{   // "extends" se usa para indicar que "Estudiante" es una clase hijo de la clase "Persona". Hereda todos los metodos de Persona
	private int codigoDeEstudiante;
	private float notaFinal;

	//constructor
	public Estudiante(String nombre,String apellido, int edad,int codigoDeEstudiante,float notaFinal){
		super(nombre,apellido,edad);  //"super" inicializa los atributos de la clase padre
		this.codigoDeEstudiante = codigoDeEstudiante;
		this.notaFinal = notaFinal;
	}

	public void mostrarDatos(){
		System.out.println("Nombre: "+getNombre()+
				"\nApellido: "+getApellido()+
				"\nEdad: "+getEdad()+
				"\nCodigoDeEstudiante: "+codigoDeEstudiante+
				"\nNotaFinal: "+notaFinal);
	}

}
