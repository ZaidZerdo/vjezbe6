package com.weekend1.homework;

public class Task9 {

	/*
	 * Print all five-digit prime palindromes.
	 * Note: The given solution is not fast/efficient, but simple.
	 */
	public static void main(String[] args) {
		int start = 10000;
		int finish = 99999;
		
		// Start from 10000 and increase by 1 until 99999.
		while (start != finish) {
			boolean isPrime = true;
			boolean isPalindrome;
			
			// ** Check if value of start is a palindrome **
			int n = start;
			int normalNumber = n;
			int reverseNumber = 0;
			
			while (n != 0) {
				reverseNumber = reverseNumber * 10 + (n % 10);
				n /= 10;
			}
			
			isPalindrome = (normalNumber == reverseNumber);
			// *********************************************
			
			// **** Check whether it is a prime number ****
			int divisor = 2;
			
			while (divisor < start) {
				if (start % divisor == 0) {
					isPrime = false;
				}
				
				divisor++;
			}
			// ********************************************
			
			if (isPalindrome && isPrime) {
				System.out.println(start);
			}
			
			start++;
		}
	}

}
