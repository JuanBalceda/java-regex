package com.balceda;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptureGroups {

	public static void main(String[] args) {

		String[] input = { "securities-development-equities-valuation-asia", "fixed_income-development-equities-emea",
				"fx-development-america" };

		// Pattern pattern = Pattern.compile("(\\w+)(-(\\w+))+-(\\w+)");
		// My test pattern "(\w+)-(\w+).*-(\w+)"

		// Named capture groups
		Pattern pattern = Pattern.compile("(?<business>\\w+)(-(\\w+))+-(?<region>\\w+)");

		for (int i = 0; i < input.length; i++) {
			// dislay(pattern, input[i]);
			System.out.println();
			dislayGroups(pattern, input[i], "business", "region");
		}
	}

	public static void dislayGroups(Pattern pattern, String input, String... groupNames) {
		Matcher matcher = pattern.matcher(input);
		// int groupCount = matcher.groupCount();

		if (matcher.matches()) {
			for (String name : groupNames) {
				System.out.printf("%s: %s%n", name, matcher.group(name));
			}
		}
	}

	public static void dislay(Pattern pattern, String input) {
		Matcher matcher = pattern.matcher(input);
		int groupCount = matcher.groupCount();

		if (matcher.matches()) {
			for (int i = 0; i < groupCount + 1; i++) {
				System.out.printf("%s.%s%n", i, matcher.group(i));
			}
		}
	}

}
