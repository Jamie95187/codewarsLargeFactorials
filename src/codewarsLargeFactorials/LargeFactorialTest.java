package codewarsLargeFactorials;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargeFactorialTest {

	@Test
	public void factorial_lowNumbers_returnCorrectFactorial() {
		assertEquals("2", LargeFactorial.factorial(2));
		assertEquals("120", LargeFactorial.factorial(5));
	}
	
	@Test
	public void factorial_doubleDigitNumbers_returnCorrectFactorial() {
		assertEquals("1307674368000", LargeFactorial.factorial(15));
		assertEquals("15511210043330985984000000", LargeFactorial.factorial(25));
	}
	
}
