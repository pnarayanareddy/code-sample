package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateString {
	public static void main(String[] args) {
		List<Integer> listOfStrings = Arrays.asList(1, 2, 3, 4, 2, 3);
		List<Integer> uniqueStrngs = listOfStrings.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueStrngs);

		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler","Note Book", "Pencil");
		List<String> uniqueStrngs1 = stationeryList.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueStrngs1);

	}
}