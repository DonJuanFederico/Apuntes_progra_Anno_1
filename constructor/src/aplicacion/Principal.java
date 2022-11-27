package aplicacion;

import dominio.*;

public class Principal{
	public static void main(String args[]){
		Clase otra = new Clase("Otra");
		Clase programacion = new Clase("Programación", 123);
		Clase matematicas = new Clase("Matematicas", 45);
		System.out.println(programacion + "\n" + matematicas);
	}
}
