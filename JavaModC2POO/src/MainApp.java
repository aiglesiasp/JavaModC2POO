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
		Persona persona1 = new Persona("Paco", 56, "111222333-D", 'H', 85.0, 1.95);
		System.out.println(persona1);
		
		//EJERCICIO 2
		Password password = new Password();
		System.out.println(password);
		
		//EJERCICIO 3
		Electrodomestico electrodomestico = new Electrodomestico();
		System.out.println(electrodomestico);
		
		//EJERCICIO 4
		Serie serie = new Serie();
		System.out.println(serie);
	}

}
