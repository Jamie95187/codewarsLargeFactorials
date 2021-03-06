# Large Factorial (5 KYU)

Solving [this](https://www.codewars.com/kata/557f6437bf8dcdd135000010/train/java) challenge from codewars.

## Description

In mathematics, the factorial of integer `n` is written as `n!`. It is equal to the product of `n` and every integer preceding it. For example: `5! = 1 x 2 x 3 x 4 x 5 = 120`

Your mission is simple: write a function that takes an integer n and returns the value of `n!`.

You are guaranteed an integer argument. For any values outside the non-negative range, return `null`, `nil` or `None`. For non-negative numbers a full length number is expected for example, return `25! = "15511210043330985984000000"` as a string.

For more on factorials, see [wiki page](http://en.wikipedia.org/wiki/Factorial)

**NOTES:**

- The use of BigInteger or BigNumber functions has been disabled, this requires a complex solution

## Tests

Tests written with Junit 4 in the Eclipse IDE.

```
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
```