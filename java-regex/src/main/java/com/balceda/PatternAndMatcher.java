package com.balceda;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;

public class PatternAndMatcher {

	public static void main(String[] args) {
		// With Pattern
		Pattern pattern = Pattern.compile(",");
		String[] toSplit = pattern.split("12,24,56,64");
		System.out.println(Arrays.asList(toSplit));

		// With Matcher
		Pattern masterCardPattern = Pattern
				.compile("^(?:5[1-5][0-9]{2}|222[1-9]|22[3-9][0-9]|2[3-6][0-9]{2}|27[01][0-9]|2720)[0-9]{12}$");
		boolean matches;
		matches = masterCardPattern.matcher("5112345678890123").matches();
		System.out.println(matches);
		matches = masterCardPattern.matcher("2221012345678901").matches();
		System.out.println(matches);
		matches = masterCardPattern.matcher("2721012345678901").matches();
		System.out.println(matches);

		// With Streams
		Collection<String> cards = Arrays.asList("5112345678890123", "2221012345678901", "2721012345678901");
		
		cards.stream()
				.filter(masterCardPattern.asPredicate())
				.forEach(System.out::println);
				//.collect(Collectors.toList());		
	}

}
