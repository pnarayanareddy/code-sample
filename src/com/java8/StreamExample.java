package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {
	
	public static boolean hasUniqueElements(int[] arr) {
		Set<Integer> set = new HashSet<>();
		return Arrays.stream(arr).allMatch(set::add);
	}

	public static void main(String[] args) {

//1
		int[] numbers = { 1, 2, 5, 9, 33 };
		// Find the largest number using Java Streams
		int maxNumber = Arrays.stream(numbers).max().orElseThrow(() -> new IllegalArgumentException("Array is empty"));
		System.out.println("The largest number is: " + maxNumber);
//2

		int[] numbers1 = { 10, 20, 5, 30, 15 };
		// Sort in ascending order
		int[] sortedAsc = Arrays.stream(numbers1).sorted().toArray();
		System.out.println("Ascending Order: " + Arrays.toString(sortedAsc));

		int[] numbers2 = { 10, 20, 5, 30, 15 };
		// Sort in descending order
		int[] sortedDesc = Arrays.stream(numbers2).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue)
				.toArray();
		System.out.println("Descending Order: " + Arrays.toString(sortedDesc));

//3   	
		int[] array1 = { 10, 5, 15 };
		int[] array2 = { 20, 25, 0 };

		// Merge and sort the two arrays
		int[] mergedAndSortedArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).boxed()
				.sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

		System.out.println("Merged and Sorted Array: " + Arrays.toString(mergedAndSortedArray));

//4	
		int[] arr = { 1, 2, 3, 4, 5}; // s
		System.out.println(hasUniqueElements(arr));

//5
			  int number = 12345;
			  // Convert the number to a string, then to an IntStream of digits, and sum them 
			  int sum = Integer.toString(number).chars() // Create an IntStream of characters 
					     .map(Character::getNumericValue) // Convert characters to their numeric value 
			  .sum(); // Sum the values
			  
			  System.out.println("Sum of digits: " + sum);
			  
//6
				int[] arr1 = {10, 12, 10, 33, 40, 40, 61, 61};
		      // declaring a new Set 
		      Set<Integer> newitemSet = new HashSet<>();
		      System.out.println("The list of duplicate Items: ");
		      Arrays.stream(arr1) // converting list to stream
		         .filter(nums -> !newitemSet.add(nums)) // to filter out the elementsthat are not added to the set
		         .forEach(System.out::println); // print the duplicates		


	}
}
