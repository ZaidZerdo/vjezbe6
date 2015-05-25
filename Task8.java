package com.weekend1.homework;

public class Task8 {

	/*
	 * Checks whether n is a prime number.
	 */
	public static void main(String[] args) {
		int n = 13;
		int divisor = 2;
		boolean isPrime = true; // Assume n is a prime
		
		// If it ever finds a number in [2, n-1] that
		// can divide n then change isPrime to false.
		while (divisor < n) {
			if (n % divisor == 0) {
				isPrime = false;
			}
			
			divisor++;
		}
		
		System.out.println("Prime? " + isPrime);
	}

}
