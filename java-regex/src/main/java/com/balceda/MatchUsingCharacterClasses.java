package com.balceda;

public class MatchUsingCharacterClasses {

	public static void main(String[] args) {

		// Any number
		System.out.println("I'm 25 years old".replaceFirst("\\d", "3"));

		// Anything but a number
		System.out.println("I'm 25 years old".replaceFirst("\\D", "3"));
		
	}

}
