package aplicacion;

//import dominio.*;

public class Principal{
	public static void main(String args[]){
		int resultado = 0;
		int sumatorio = 100;
		while(sumatorio != 0){
			resultado = resultado + sumatorio;
			sumatorio = sumatorio - 1;
		}
		System.out.println(resultado);
	}
}
