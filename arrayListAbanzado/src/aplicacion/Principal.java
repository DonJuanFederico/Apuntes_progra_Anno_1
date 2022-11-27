package aplicacion;

import dominio.*;
import java.util.ArrayList;

public class Principal{
	public static void main(String args[]){
		/*
		ArrayList<Integer> coleccionNumeros = new ArrayList<>();
		coleccionNumeros.add(123);
		coleccionNumeros.add(12);
		coleccionNumeros.add(23);
		coleccionNumeros.add(345);
		coleccionNumeros.add(67);
		coleccionNumeros.add(23);
		System.out.println(coleccionNumeros);
		coleccionNumeros.remove((Integer)23);
		System.out.println(coleccionNumeros);
		*/
		int id = 0;
		ArrayList<Asignatura> asignaturas = new ArrayList<>();
		asignaturas.add(new Asignatura(id++, "Progra",1,50));
		asignaturas.add(new Asignatura(id++, "Mates",1,45));
		asignaturas.add(new Asignatura(id++, "Física",1,60));
		asignaturas.add(new Asignatura(id++, "POT",1,46));
		asignaturas.add(new Asignatura(id++, "INI",1,51));
		System.out.println(asignaturas);
		asignaturas.remove(new Asignatura(1,"Matematicas",134,4599));
		System.out.println(asignaturas);
	}
}
