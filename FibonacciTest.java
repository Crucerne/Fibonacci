package com.crucerne.www.fibonacci;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void test() {
		assertEquals(0, Fibonacci.fibonacci(0).size());
		assertEquals(Arrays.asList(0), Fibonacci.fibonacci(1));
		assertEquals(Arrays.asList(0, 1), Fibonacci.fibonacci(2));
		assertEquals(Arrays.asList(0, 1, 1), Fibonacci.fibonacci(3));
		assertEquals(Arrays.asList(0, 1, 1, 2), Fibonacci.fibonacci(4));
		assertEquals(Arrays.asList(0, 1, 1, 2, 3), Fibonacci.fibonacci(5));
		assertNotEquals(Arrays.asList(0, 1, 1, 2, 6), Fibonacci.fibonacci(5));
	}

}
