package com.weekend1.homework;

public class Task6 {

	/*
	 * Calculate how many digits does n have.
	 */
	public static void main(String[] args) {
		int n = 128;
		int length = 0;
		
		// Each step remove a digit from n and increase the length by one
		// until n reaches zero.
		while (n != 0) {
			n /= 10;
			length++;
		}
		
		System.out.println("Length is: " + length);
	}

}
