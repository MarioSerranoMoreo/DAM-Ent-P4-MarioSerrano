package main.java.liceosorolla;

import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;

public class Usuario {
	private String nombre;
	private String apellidos;
	private int identificador;
	private LocalDate fecha;
	
	public Usuario(String nombre, String apellidos, int identificador,LocalDate fecha) {
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

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public boolean mayoriaEdad() {
		boolean bool=true;
		bool=18<Year.now().getValue()-fecha.getYear();
		return bool;
	}
}
