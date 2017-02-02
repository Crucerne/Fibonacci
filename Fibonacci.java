package com.crucerne.www.fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Simple class that provides 2 methods 
 * 1) return the fibonacci sequence of a desired length as a list.
 * 2) return the integer of the desired number in the fibonacci sequence.
*/

public class Fibonacci {

	// Returns a list of the fibonacci sequence to the desired the input number.
	public static List<Integer> fibonacci(int number) {
		// case if input number is less than 0.
		if (number < 0) {
			throw new IllegalArgumentException("Desired fibonacci sequence cannot be negative!");
		}
		
		// case if input is 0, returns an empty list.
		if (number == 0)
		{
			return new ArrayList<Integer>();
		}
		
		// case if input is 1, the 1st number in the fibonacci sequence is 0.
		if (number == 1)
		{
			return Arrays.asList(0);
		}
		
		// case if input is 2, the sequence of values is "0" and then "1".
		if (number == 2)
		{
			return Arrays.asList(0, 1);
		}
		
		// Instantiate an array list with the size of the input length.
		List<Integer> sequence = new ArrayList<Integer>(number);
		
		// Filling the first two base values of the fibonacci sequence.
		sequence.add(0);
		number--;
		sequence.add(1);
		number--;
		
		// Fill the rest of the desired sequence by adding the previous two values in the sequence list 
		// while decrementing the input length, "number" by 1 each time until it has reached 0.
		while (number > 0)
		{
			int a = sequence.get(sequence.size() - 1);
			int b = sequence.get(sequence.size() - 2);
			sequence.add(a + b);
			number--;
		}
		
		return sequence;
		
	}
	
	public static int fibonacciSingle(int number)
	{
		// Throw exception if input number is negative.
		if (number < 0)
		{
			throw new IllegalArgumentException("Fibonacci sequence must be positive!");
		}
		
		// Base case when input number is 0.
		if (number == 0)
		{
			return 0;
		}
		
		// Base case when input number is 1.
		if (number == 1)
		{
			return 1;
		}
		
		return (fibonacciSingle(number - 1) + fibonacciSingle(number - 2));
		
	}

}
