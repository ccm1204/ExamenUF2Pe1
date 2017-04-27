package examenuf2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrimordialExcpTest {
	Primordial primordial;

	@Before
	public void crearObj(){
		primordial = new Primordial();
	}	

	@Test (expected = IllegalArgumentException.class)
	public void test() {
		Assert.assertEquals(30.0, primordial.get_primordial(-5), 0.03);
	}

}
