package aplicacion;

//import dominio.*;
import java.util.Scanner;

public class Principal{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		for(int i = 0; i < 2; i++){
			System.out.println("Introduzca un número entero:");
			suma += sc.nextInt();
		}
		System.out.println("El resultado es " + suma);
		sc.close();
	}
}
