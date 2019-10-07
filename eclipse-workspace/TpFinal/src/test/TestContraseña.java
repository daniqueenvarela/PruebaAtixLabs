package test;

import org.junit.Assert;
import org.junit.Test;

import dominio.Password;

public class TestContraseña {

	@Test
	public void TestQueVerificaContraseña() {
		Password mipass=new Password("12345678");
		String esperado= "12345678";
		Assert.assertEquals(esperado, mipass.getPassword());
	}
}
