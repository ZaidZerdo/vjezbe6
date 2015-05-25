package com.weekend1.homework;

public class Task4 {

	/*
	 * For a given value of n, calculate n!
	 */
	public static void main(String[] args) {
		int n = 5;
		int product = 1;
		
		// In each step multiply the product by n and decrease n by 1
		// until n reaches 1.
		while (n != 1) {
			product *= n;
			n--;
		}
		
		System.out.println("Product is " + product);
	}

}
