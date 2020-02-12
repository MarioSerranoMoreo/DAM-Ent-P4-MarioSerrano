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
	@Test
	public void comprobarNombre() {
		assertEquals("Mario", usuario.getNombre());
	}
	@Test
	public void comprobarApellidos() {
		assertEquals("Serrano Moreo", usuario.getApellidos());
	}
	@Test
	public void comprobarNombreCompleto() {
		assertEquals("Mario Serrano Moreo", usuario.getNombre()+" "+usuario.getApellidos());
	}
}
