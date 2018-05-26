package br.com.db1start.Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1start.classe.integer.Matematica;

public class MatematicaTest {

	private Matematica matematica = new Matematica();
	
	@Before
	public void inicio() {
		matematica.setValor1(10);
		Assert.assertTrue(10 == matematica.getValor1());
		
		matematica.setValor2(2);
		Assert.assertTrue(2 == matematica.getValor2());
		
	}
	
	
	@Test
	public void testeSomar() {
		Assert.assertTrue(12 == matematica.Somar(10, 2));
	}
	
	@Test
	public void testeSubtrair() {
		Assert.assertTrue(8 == matematica.Subtrair(10, 2));
	}
	
	@Test
	public void testeMultiplicar() {
		Assert.assertTrue(20 == matematica.Multiplicar(10, 2));
	}
	
	@Test
	public void testeDividir() {
		Assert.assertTrue(5 == matematica.Dividir(10, 2));
	}
	
	
}
