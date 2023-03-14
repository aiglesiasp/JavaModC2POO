/**
 * 
 */

/**
 * @author aitor
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//EJERCICIO 1
		Persona persona1 = new Persona();
		Persona persona2 = new Persona("666777888-K");
		Persona persona3 = new Persona("Aitor", 33, 'H');
		Persona persona4 = new Persona("Paco", 56, "111222333-D", 'H', 85.0, 1.95);
		
		//EJERCICIO 2
		Password password = new Password();
		//System.out.println(password.generarPassword(15));
		//EJERCICIO 3
		Electrodomestico electrodomestico = new Electrodomestico();
		//EJERCICIO 4
		Serie serie = new Serie();
	}

}
