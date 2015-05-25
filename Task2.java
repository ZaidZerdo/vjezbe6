package com.weekend1.homework;

public class Task2 {

	/*
	 * Print all birthdays until this year (as dates) for
	 * a given date of birth.
	 * Note: Assume the birthday will never be on
	 * 29th of February of a leap year.
	 */
	public static void main(String[] args) {
		int day = 28;
		int month = 1;
		int year = 1954;
		
		// In each step increase year by one and print the date
		// until the year reaches 2016.
		while (year <= 2015) {
			System.out.println(day + "." + month + "." + year);
			year++;
		}
	}

}
