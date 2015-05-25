package com.weekend1.homework;

public class Task10 {

	/*
	 * Print the first 50 Fibonacci numbers.
	 */
	public static void main(String[] args) {
		long first = 1;
		long second = 1;
		int howMany = 0; // Stores how many number have been printed
		
		while (howMany < 50) {
			System.out.print(first + " " + second + " ");
			howMany += 2; // Two more numbers printed
			
			// Add the first two to get the third
			// Add the second and the (newly calculated) third to get the fourth
			first = first + second;
			second = first + second;			
		}
		
	}

}
