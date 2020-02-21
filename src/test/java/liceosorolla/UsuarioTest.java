package test.java.liceosorolla;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import main.java.liceosorolla.Usuario;

public class UsuarioTest {
	private Usuario usuario;
	@Before
	public void Before() {
		usuario = new Usuario("Mario","Serrano Moreo", 7, LocalDate.of(2000, 07, 05));
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
	@Test
	public void comprobarMayoriaDeEdad() {
		assertEquals(true,usuario.mayoriaEdad());
	}
	@Test
	public void comprobarIdentificador() {
		assertEquals(7,usuario.getIdentificador());
	}
}
