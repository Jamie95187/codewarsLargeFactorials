package codewarsLargeFactorials;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargeFactorialTest {

	@Test
	public void factorial_lowNumbers_returnCorrectFactorial() {
		assertEquals(2, LargeFactorial.factorial(2));
	}

}
