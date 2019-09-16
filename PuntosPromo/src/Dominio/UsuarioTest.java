package Dominio;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UsuarioTest {

	@Test
	public void testqueverificarcontraseña() {
		Usuario pepe = new Usuario("pepe@gmail.com", "pepelan", "alalalalalo");
		String esperado= "alalalalalo";
		Assert.assertEquals(esperado,pepe.getPassword());
	}
	@Test
	public void verificarUsuario() {
		Usuario tuVieja = new Usuario("pepe@gmail.com", "pepelan", "alalalalalo");
		String esperado="pepelan";
		Assert.assertArrayEquals(esperado;);
	}
}
