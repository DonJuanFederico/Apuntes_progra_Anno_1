package aplicacion;

//import dominio.*;

public class Principal{
	public static void main(String args[]){
		String frase = "No vueles como las aves de corral cuando puedes, subir como las águilas. aves de corral";
		String resultado = "La cadena formada por los dos primeros caracteres es " + frase.charAt(0) + frase.charAt(1);
		System.out.println(resultado);
		System.out.println(frase.substring(0,2));
		System.out.println(frase.charAt(4));	
		String[] split = frase.split(" ");
		for(int i = 0; i < split.length; i++){
			System.out.println(split[i]);
			if(split[i].equals("puedes")){
				System.out.println("La posición de la palabra puedes es la " + i);
			}
		}
		System.out.println(frase.indexOf("puedes"));
		System.out.println(frase.charAt(41));
		System.out.println(frase.replace("aves de corral", "gallinas"));
	}
}
