package examenuf2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrimordialCondTest {
	Primordial primordial;

	@Before
	public void crearObj(){
		primordial = new Primordial();
	}	

	@Test
	public void test() {
		Assert.assertTrue((primordial.get_primordial(8))>200);
	}

	@Test
	public void test2() {
		Assert.assertFalse((primordial.get_primordial(6))>30);
	}

	@Test
	public void test3() {
		Assert.assertTrue((primordial.get_primordial(2))<=2);
	}

	@After
	public void destruirObj(){
		primordial = null;
	}	
}
