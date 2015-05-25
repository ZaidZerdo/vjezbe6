package com.weekend1.homework;

public class Task5 {

	/*
	 * Print all numbers in [0, n] that are odd, divisible by three,
	 * but not by five.
	 */
	public static void main(String[] args) {
		int n = 30;
		int number = 0;
		
		// Keep increasing number by one until it reaches n.
		// In each step check the number if it's okay. If yes, print it.
		while (number <= n) {
			if (number % 2 != 0 && number % 3 == 0 && number % 5 != 0) {
				System.out.println(number);
			}
			
			number++;
		}
	}

}
