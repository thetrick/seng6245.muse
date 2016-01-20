package sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo1Test {

	@Test(expected = IllegalArgumentException.class)
	public void testExceptionIsThrown() {
		Demo1 tester = new Demo1();
		tester.multiply(1000, 5);
	}
	
	@Test
	public void testDivide(){
		Demo1 tester = new Demo1();
		assertEquals("500 multiplied by 5 must be 2500.", 2500, tester.multiply(500, 5));
	}

}
