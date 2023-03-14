
public class Persona {
	
	static final char sexoHombre = 'H';
	
	//ATRIBUTOS
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	
	//CONSTRUCTORES
	//1-Constructor con DNI
	public Persona(String dni) {
		this.nombre = "";
		this.edad = 0;
		this.dni = dni;
		this.sexo = sexoHombre;
		this.peso = 0.0;
		this.altura = 0.0;
	}
	
	//2-Constructor por defecto
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.dni = "";
		this.sexo = sexoHombre;
		this.peso = 0.0;
		this.altura = 0.0;
	}
	//3-Constructor con nombre, edad, sexo
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = "";
		this.sexo = sexo;
		this.peso = 0.0;
		this.altura = 0.0;
	}
	//4-Constructor todos los parametros
	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
}
