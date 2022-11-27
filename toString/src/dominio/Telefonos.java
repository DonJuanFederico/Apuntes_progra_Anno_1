package dominio;

public class Telefonos{
	public String nombre;
	public int numero = 0;

	public Telefonos(String nombre, int numero){
		this.nombre = nombre;
		this.numero = numero;
	}

	public String toString(){
		return "El telefono se llama " + nombre + " y su numero es " + numero;
	}
}
