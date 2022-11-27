package aplicacion;

import dominio.*;
import java.util.ArrayList;

public class Principal{
	public static void main(String args[]){
		Asignatura mates = new Asignatura();
		mates.setNombre("Mates");
		Asignatura pr1 = new Asignatura();
		pr1.setNombre("Programación I");

		Curso primero = new Curso();
		primero.setNombre("Primero");
		primero.addAsignatura(mates);
		primero.addAsignatura(pr1);
		System.out.println(primero);
	}
}
