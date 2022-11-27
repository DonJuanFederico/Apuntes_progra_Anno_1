package interfaz;
import dominio.*;

public class Interfaz{
	private static String NOMBRE_FICHERO = "libreta.txt";
	//sentencia = "add Pepe 234523"
	//śentencia = "list"
	//sentencia = "help"
	public static void procesarPeticion(String sentencia){
		Libreta libreta = new Libreta();
		String [] palabras = sentencia.split(" ");
		Libreta libreta = inicializarLibreta();
		if(palabras[0].equals("add")&& palabras.length == 3){
			Contacto contacto = new Contacto(palabras[1], palabras[2]);
			System.out.println(contacto);
			guardarLibreta(libreta);
			libreta.annadirContacto(contacto);
		}else if(palabras[0].equals("list")){
			System.out.println(libreta);
		}else if(palabras[0].equals("help")){
			printHelp();
		}else{
			printHelp();
		}
	}
	private static void Libreta inicializarLibreta(){
		Libreta libreta = new libreta
		File file = new File(NOMBRE_FICHERO);
		Scanner sc = new Scanner(file);
		while(sc.hasNext()){
			String nombre = sc.next();
			String telefono = sc.next();
			Contacto contacto = new Contacto(informacion, informacion2);
			libreta.annadirContacto(contacto);

		}
		sc.close();
	}catch (FileNotFoundException e){
		//
	}
	}
	private static void printHelp(){
		String ayuda = "Las operaciones posibles son las siguientes:\n" + "- Añadir contacto: ‘java -jar libreta.jar add <nombre> <teléfono>‘\n" + "Por ejemplo,\n" + "java -jar libreta.jar add Pepe 654321234\n" + "- Mostrar contactos:\n" + "java -jar libreta.jar list\n" + "- Mostrar esta ayuda:\n" + "java -jar libreta.jar help";
		System.out.println(ayuda);
	}
}
