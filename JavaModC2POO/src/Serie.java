
public class Serie {
	//CONSTANTES
	static final int temp = 3;
	static final boolean ent = false;
	
	//ATRIBUTOS
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	//CONSTRUCTORES
	//1-Constructor por defecto
	public Serie() {
		this.titulo = "";
		this.numeroTemporadas = temp;
		this.entregado = ent;
		this.genero = "";
		this.creador = "";
	}
	
	//2- Constructor con titulo y creador
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = temp;
		this.entregado = ent;
		this.genero = "";
		this.creador = creador;
	}
	
	//3- Constructor con todo excepto entregado
	public Serie(String titulo, int temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = temporadas;
		this.entregado = ent;
		this.genero = genero;
		this.creador = creador;
	}
	
	

}
