package com.weekend1.homework;

public class Task1 {

	/*
	 * This program prints n stars.
	 */
	public static void main(String[] args) {
		int n = 10;
		
		// For each step decrease n by 1 and print *
		// until n reaches 0.
		while (n != 0) {
			System.out.print("*");
			n--;
		}
	}

}
