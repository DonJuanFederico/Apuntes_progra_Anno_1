package aplicacion;

//import dominio.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal{
	public static void main(String args[]){
		boolean condicion = true;
		Scanner sc = new Scanner(System.in);
		while (condicion){
			System.out.println("Introduzca un número:");
			try{
				int numero = sc.nextInt();
				condicion = false;
				switch(numero){
					case 1:
						System.out.println("Lunes");
						break;
					case 2: 
						System.out.println("Martes");
						break;
					case 3:
						System.out.println("Miercoles");
						break;
					case 4:
						System.out.println("Jueves");
						break;
					case 5:
						System.out.println("Viernes");
						break;
					case 6:
						System.out.println("Sábado");
						break;
					case 7:
						System.out.println("Domingo");
						break;
					default:
						System.out.println("El número introducido no es correcto");
						condicion = true;
				}
			} catch (InputMismatchException e){
				sc.next();
				System.out.println("No has introducido un número");
			}
		}
		sc.close();
	}
}
