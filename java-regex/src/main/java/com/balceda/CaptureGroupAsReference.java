package com.balceda;

import java.util.Arrays;

public class CaptureGroupAsReference {

	public static void main(String[] args) {
		Arrays.stream(new String[] { 
				"securities-development-equities-valuation-asia",
				"fixed_income-development-equities-emea", 
				"fx-development-america" })
				.map(input -> input
						.replaceAll("(?<business>\\w+)(-(\\w+))+-(?<region>\\w+)", "Unit:$1, Region: ${region}"))
				.forEach(System.out::println);
	}
}
