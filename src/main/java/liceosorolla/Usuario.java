package main.java.liceosorolla;

public class Usuario {
	private String nombre;
	private String apellidos;
	private String fecha;
	private int identificador;
	
	public Usuario(String nombre, String apellidos, String fecha, int identificador) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha = fecha;
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
}
