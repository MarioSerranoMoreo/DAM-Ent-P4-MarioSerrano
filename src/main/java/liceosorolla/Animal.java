package main.java.liceosorolla;

public class Animal {
	private String animal;
	private String especie;
	private int peso;
	private int edad;
	private String colorPelo;
	
		public Animal(String animal, String especie, int peso, int edad, String colorPelo) {
		this.animal = animal;
		this.especie = especie;
		this.peso = peso;
		this.edad = edad;
		this.colorPelo = colorPelo;
	}
	
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getColorPelo() {
		return colorPelo;
	}
	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}
	
}
