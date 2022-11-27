package aplicacion;

//import dominio.*;
import java.util.Scanner;

public class Principal{
	public static void main(String args[]){
		System.out.println("Introduzca un número:");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		sc.close();
		if (numero < 10){
			System.out.println("El número es menor que 10");
		} else if (numero < 20){
			System.out.println("El número es menor que 20");
		} else if (numero < 30){
			System.out.println("El número es menor que 30");
		} else {
			System.out.println("El número es mayor o igual que 30");
		}
		System.out.println("Después del if");
	}
}
