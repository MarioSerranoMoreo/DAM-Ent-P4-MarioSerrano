package test.java.liceosorolla;

import java.time.LocalDate;

import org.junit.Before;

import main.java.liceosorolla.Animal;
import main.java.liceosorolla.Usuario;

public class AnimalTest {
	private Animal animal;
	@Before
	public void Before() {
		animal = new Animal ("Rana","Cefalopodo", 100 , 19,"rosa");
	}
}
