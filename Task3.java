package com.weekend1.homework;

public class Task3 {

	/*
	 * Calculate the sum of all numbers in the range [1, n].
	 */
	public static void main(String[] args) {
		int n = 5;
		int sum = 0;
		
		// In each step add n to the sum and decrease by n
		// until n reaches 0.
		while (n != 0) {
			sum += n;
			n--;
		}
		
		System.out.println("Sum is : " + sum);
	}

}
