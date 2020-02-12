package test.java.liceosorolla;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.java.liceosorolla.Usuario;

public class UsuarioTest {
	private Usuario usuario;
	@Before
	public void Before() {
		usuario = new Usuario("Mario","Serrano Moreo", "2020-02-12", 7);
	}
	
}
