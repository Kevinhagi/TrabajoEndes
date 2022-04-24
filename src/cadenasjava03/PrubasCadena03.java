package cadenasjava03;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrubasCadena03 {
	private String cadenaPrueba;
	
	@Before
	public void metodobefore()
	{
		cadenaPrueba = "HOLA BUENOS DIAS";
	}
	

	@Test
	public void Cadenatest() {
		assertEquals(cadenaPrueba,cadenaPrueba);
	}

}
