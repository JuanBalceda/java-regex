package com.balceda;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		// False
		System.out.println("AnyString".matches(".S"));
		
		// True
		System.out.println("abcdefg".matches(".b.d.f."));
		
		// split removes all matches
		System.out.println(Arrays.asList("26,96,36,bike".split(",")));
		System.out.println(Arrays.asList("This is a log string".split(" ")));
		System.out.println(Arrays.asList("This is a log string".split("")));
		System.out.println(Arrays.asList("This is a log string".split(".")));
				
		// Replace All - Replace first
		String sum = "one + one = 2";
		System.out.println(sum.replaceAll("one", "1"));
		System.out.println(sum.replaceFirst("on.", "1"));
		System.out.println(sum.replace("on.", "1")); // No RegEx
		
		
		
		// Replace All
		String original = "Spiderman is great character!";
		String fake = original.replaceAll("q", "Deadpool");
		System.out.println(original == fake); 
	}
}
