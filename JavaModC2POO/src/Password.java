import java.security.SecureRandom;

public class Password {
	
	//CONSTANTES
	static final int lon = 8;
	
	//ATRIBUTOS
	private int longitud;
	private String contraseña;
	
	//CONSTRUCTORES
	public Password() {
		this.longitud = lon;
		this.contraseña = generarPassword(lon);
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarPassword(longitud);
	}
	
	//METODOS
	public static String generarPassword(int longitud) {
	
		final String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		SecureRandom random = new SecureRandom();
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < longitud; i++) {
			int index = random.nextInt(alfabeto.length());
			builder.append(alfabeto.charAt(index));
		}
		//TODO: Generar password
		return builder.toString();
	}
	
	
	
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}
	

	//GETTERS Y SETTERS
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
}
