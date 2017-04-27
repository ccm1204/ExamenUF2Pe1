package examenuf2;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (value=Parameterized.class)
public class PrimordialParameterizedTest {
	private Double expected, actual, delta;
	private Primordial primordial;

	@Parameters
	public static Collection<Double[]> testParam(){
		return Arrays.asList(new Double [][]{
			{2.0, 2.0, 0.03},
			{6.0, 3.0, 0.03},
			{6.0, 4.0, 0.03},
			{30.0, 5.0, 0.03},
			{210.0, 7.0, 0.03},
			{2310.0, 11.0, 0.03},
			{30030.0, 13.0, 0.03},
			{510510.0, 17.0, 0.03},
			{9699690.0, 19.0, 0.03},
			{223092870.0, 23.0, 0.03}
		});
	}	

	public PrimordialParameterizedTest(Double expected, Double actual, Double delta) {
		this.expected = expected;
		this.actual = actual;
		this.delta = delta;
	}

	@Before
	public void crearObj(){
		primordial = new Primordial();
	}

	@Test
	public void test() {
		double calculado = primordial.get_primordial(actual.intValue());
		Assert.assertEquals(expected, calculado, delta);
	}

	@After
	public void destruirObj(){
		primordial = null;
	}	
}
