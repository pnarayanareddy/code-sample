package com.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.management.RuntimeErrorException;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		String input = "abcac";
		char result1 = input.chars().mapToObj( c ->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
					    .entrySet().stream().filter(entry -> entry.getValue() == 1)
					    .map(Map.Entry::getKey)
					    .findAny()
					    .orElseThrow(() -> new RuntimeException("No Non - repeting character found"));
		System.out.println("result::  "+result1);
		
//		char result = firstNonRepeatingCharacter(input);
//		System.out.println("First non-repeating character: " + result);
	}

	public static char firstNonRepeatingCharacter(String input) {
		return input.chars() // Convert String to IntStream
				.mapToObj(c -> (char) c) // Convert IntStream to Stream<Character>
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Group by character and count occurrences																						 by
				.entrySet().stream().filter(entry -> entry.getValue() == 1) // Filter characters that appear only once
				.map(Map.Entry::getKey) // Get the character key
				.findFirst() // Find the first entry
				.orElseThrow(() -> new RuntimeException("No non-repeating character found"));
	}
}
