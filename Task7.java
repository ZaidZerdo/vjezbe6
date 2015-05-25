package com.weekend1.homework;

public class Task7 {

	/*
	 * Check if n is a palindrome.
	 */
	public static void main(String[] args) {
		int n = 122575221;
		
		int normalNumber = n;
		int reverseNumber = 0;
		
		// Keep pushing the right-most digits of n to the left
		// and keep removing digits from n until it reaches zero.
		while (n != 0) {
			reverseNumber = reverseNumber * 10 + (n % 10);
			n /= 10;
		}
		
		// Check if the normal number is equal to the reversed number
		if (normalNumber == reverseNumber) {
			System.out.println("Palindrome!");
		} else {
			System.out.println("Not a palindrome!");
		}
	}

}
