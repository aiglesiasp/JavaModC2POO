import java.awt.Color;

public class Electrodomestico {
	
	//CONSTANTES
	static final String colour = "blanco";
	static final char consume = 'F';
	static final double price = 100.0;
	static final double weight = 5.0;
	
	//ATRIBUTOS
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	
	//CONSTRUCTORES
	//1-Constructor por defecto
	public Electrodomestico() {
		this.precioBase = price;
		this.color = colour;
		this.consumoEnergetico = consume;
		this.peso = weight;
		
	}
	
	//2-Constructor con precio y peso
	public Electrodomestico(double precio, double peso) {
		this.precioBase = precio;
		this.color = colour;
		this.consumoEnergetico = consume;
		this.peso = peso;
		
	}
	
	//3-Constructor con todos los atributos
	public Electrodomestico(double precio, String color, char consumo, double peso) {
		this.precioBase = precio;
		this.color = color;
		this.consumoEnergetico = consumo;
		this.peso = peso;
		
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
	
	
	
	

}
