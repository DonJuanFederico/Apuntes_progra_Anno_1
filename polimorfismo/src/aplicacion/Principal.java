package aplicacion;

import poli.*;

public class Principal{
	public static void main(String args[]){
		Vehiculo misVehiculos[] = new Vehiculo[4];

		misVehiculos[0] = new Vehiculo("3785HOL","BMW","730d");
		misVehiculos[1] = new VehiculoTurismo(4,"2049FDP","Audi","P14");
		misVehiculos[2] = new VehiculoDeportivo(7,"8490GHY","Lamborghini","Aventador");
		misVehiculos[3] = new VehiculoFurgoneta(2000,"9504CSON","Ford","Vandid");
		
		for(Vehiculo vehiculos: misVehiculos){
			System.out.println(vehiculos.mostrarDatos());
			System.out.println("");
		}
	}
}
