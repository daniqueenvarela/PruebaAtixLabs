package test;

import org.junit.Assert;
import org.junit.Test;

import dominio.Password;

public class TestContrase�a {

	@Test
	public void TestQueVerificaContrase�a() {
		Password mipass=new Password("12345678");
		String esperado= "12345678";
		Assert.assertEquals(esperado, mipass.getPassword());
	}
}
